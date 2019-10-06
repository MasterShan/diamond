package com.supergrecko.diamond.compiler

import com.supergrecko.diamond.frontend.DiamondLexer
import com.supergrecko.diamond.frontend.DiamondParser
import com.supergrecko.diamond.utils.FilePath
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Compiler(private val config: CompilationConfig) {
    private val include: MutableList<FilePath> = mutableListOf()

    init {
        val stream = CharStreams.fromFileName(config.main.absolute.toString())
        val lexer = DiamondLexer(stream)
        val parser = DiamondParser(CommonTokenStream(lexer))
    }
}
