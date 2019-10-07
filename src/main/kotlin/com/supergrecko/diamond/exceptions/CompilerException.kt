package com.supergrecko.diamond.exceptions

import java.lang.Exception

class CompilerException(private val type: String, private val reason: String, val silent: Boolean) : Exception(reason) {
    fun print() = println("$type${ if (silent) " (Silent)" else "" }: $reason")
}
