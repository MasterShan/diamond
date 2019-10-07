package com.supergrecko.diamond.compiler

import com.google.gson.GsonBuilder
import com.supergrecko.diamond.frontend.*
import com.supergrecko.diamond.frontend.listeners.LexerErrorListener
import com.supergrecko.diamond.frontend.listeners.ParserErrorListener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Compiler(private val config: CompilationConfig) {
    init {
        val stream = CharStreams.fromFileName(config.main.absolute.toString())

        val lexer = DiamondLexer(stream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(LexerErrorListener())

        val parser = DiamondParser(CommonTokenStream(lexer))
        parser.removeErrorListeners()
        parser.addErrorListener(ParserErrorListener())

        val tree = TransformVisitor().visit(parser.program())
        println(GsonBuilder().setPrettyPrinting().create().toJson(tree))
    }
}
