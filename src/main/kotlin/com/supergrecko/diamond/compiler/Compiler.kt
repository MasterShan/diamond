package com.supergrecko.diamond.compiler

import com.supergrecko.diamond.utils.FilePath

class Compiler(private val config: CompilationConfig) {
    private val main = config.main
    private val include: MutableList<FilePath> = mutableListOf()

    init {
        config.include.forEach {
            println(it.toFileList())
        }
    }
}
