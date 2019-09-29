package com.supergrecko.diamond.application

interface Argument<T> {
    val type: ArgumentType

    fun execute(arg: String, args: List<String>): T
}
