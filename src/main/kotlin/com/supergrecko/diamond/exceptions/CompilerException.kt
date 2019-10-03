package com.supergrecko.diamond.exceptions

import java.lang.Exception

class CompilerException(val reason: String, val silent: Boolean) : Exception(reason) {
    fun print() = println("Compiler Exception${ if (silent) "(Silent)" else "" }: $reason")
}
