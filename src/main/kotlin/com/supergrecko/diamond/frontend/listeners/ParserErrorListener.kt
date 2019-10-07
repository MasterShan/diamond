package com.supergrecko.diamond.frontend.listeners

import com.supergrecko.diamond.exceptions.CompilerException
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer

class ParserErrorListener : BaseErrorListener() {
    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        symbol: Any?,
        line: Int,
        position: Int,
        msg: String?,
        exception: RecognitionException?
    ) = throw CompilerException("ParseException", "Unexpected token ${exception?.toString()}", false)
}
