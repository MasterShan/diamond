package com.supergrecko.diamond.exceptions

import java.lang.Exception

class CompilerException(val reason: String, val warning: Boolean) : Exception(reason) {
    fun print() = println("Compiler Exception${ if (warning) "(Warning)" else "" }: $reason")
}
