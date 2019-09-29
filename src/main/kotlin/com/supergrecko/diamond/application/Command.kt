package com.supergrecko.diamond.application

class Command {
    var name: String = "unnamed"
    private val args: MutableList<Argument<*>> = mutableListOf()

    fun expect(vararg types: Argument<*>) = args.addAll(types)

    fun run(): Unit {}
}

fun command(init: Command.() -> Unit): Command {
    val command = Command()
    command.init()

    return command
}
