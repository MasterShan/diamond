package com.supergrecko.diamond.compiler

import com.supergrecko.diamond.utils.FilePath
import com.supergrecko.diamond.utils.listFilesRecursive

class Compiler(private val config: CompilationConfig) {
    private val main = config.main
    private val include: MutableList<FilePath> = mutableListOf()

    init {
        config.include.forEach {
            println(listFilesRecursive(it))
        }
    }
}
