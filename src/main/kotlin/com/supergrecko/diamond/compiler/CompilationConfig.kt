package com.supergrecko.diamond.compiler

import com.supergrecko.diamond.application.CommandEvent
import com.supergrecko.diamond.exceptions.CompilerException
import com.supergrecko.diamond.utils.DirectoryPath
import com.supergrecko.diamond.utils.FilePath
import com.supergrecko.diamond.utils.FilesystemPath
import com.supergrecko.diamond.utils.pathFromString

/**
 * Represent a runtime config
 *
 * @property main
 * @property include
 * @property output
 * @property target
 */
data class CompilationConfig(
        val main: FilePath,
        val include: List<DirectoryPath>,
        val output: DirectoryPath,
        val target: Targets
)

/**
 * Create a compiler config from an event
 *
 * @param event
 */
fun createCompilerConfig(event: CommandEvent): CompilationConfig = createConfig(
        main = event.args.first(),
        include = event.all("i"),
        output = event.first("o") ?: "./output",
        target = event.first("target") ?: "llvm"
)

/**
 * Create a compiler config
 *
 * @param main
 * @param include
 * @param output
 * @param target
 */
private fun createConfig(main: String, include: List<String>, output: String, target: String): CompilationConfig = CompilationConfig(
        main = verifyPath(main) as FilePath,
        include = include.map { pathFromString(it) as DirectoryPath },
        output = pathFromString(output),
        target = when (target) {
            "llvm" -> Targets.LLVM
            else -> Targets.LLVM
        }
)

/**
 * Verify a file path
 *
 * @param path
 */
private fun verifyPath(path: String): FilesystemPath {
    val p = pathFromString<FilesystemPath>(path)

    if (!p.exists()) {
        throw CompilerException("CompilerException", "File or directory at path ${p.absolute} does not exist.", false)
    }

    return p
}
