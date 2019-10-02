package com.supergrecko.diamond.compiler

import com.supergrecko.diamond.exceptions.CompilerException
import com.supergrecko.diamond.utils.DirectoryPath
import com.supergrecko.diamond.utils.FilePath
import com.supergrecko.diamond.utils.FilesystemPath
import com.supergrecko.diamond.utils.pathFromString

data class CompilationConfig(
        val main: FilePath,
        val include: List<DirectoryPath>,
        val output: FilePath,
        val target: Targets
)

fun createConfig(main: String, include: List<String>, output: String, target: String): CompilationConfig {
    return CompilationConfig(
            main = verifyPath(main) as FilePath,
            // Map each path's directory
            include = include.map { pathFromString(it) as DirectoryPath },
            output = pathFromString(output) as FilePath,
            target = when (target) {
                "llvm" -> Targets.LLVM
                else -> Targets.LLVM
            }
    )
}

private fun verifyPath(path: String): FilesystemPath {
    val p = pathFromString(path)

    if (!p.exists()) {
        throw CompilerException("File or directory at path ${p.absolute} does not exist.", false)
    }

    return p
}