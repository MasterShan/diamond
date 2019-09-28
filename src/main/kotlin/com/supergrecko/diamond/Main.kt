package com.supergrecko.diamond

import com.supergrecko.diamond.codegen.DiamondLexer
import java.io.File
import org.antlr.v4.runtime.CharStreams

fun main(args: Array<out String>) {
    val stream = File(args.first()).inputStream()

    val lexer = DiamondLexer(CharStreams.fromStream(stream))

    println(lexer.allTokens)
}
