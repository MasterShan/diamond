package com.supergrecko.diamond.frontend

import com.supergrecko.diamond.exceptions.CompilerException
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import org.antlr.v4.runtime.Token

class LexerErrorListener : BaseErrorListener() {
    override fun syntaxError(
        recognizer: Recognizer<*, *>,
        symbol: Any?,
        line: Int,
        position: Int,
        msg: String?,
        exception: RecognitionException?
    ) {
        throw CompilerException("ParseException", "Unexpected token '${(symbol as Token).text}' in file ${recognizer.inputStream.sourceName}:$line:$position", false)
    }
}
