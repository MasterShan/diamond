package com.supergrecko.diamond.application

import com.supergrecko.diamond.commands.compileCommand
import kotlin.system.exitProcess

class Application(private val args: List<String>) {
    private val commands: List<Command> = listOf(
        compileCommand("compile")
    )

    fun route() {
        // Find first command which name is equal to the action, if passed
        val command = commands.firstOrNull { args.firstOrNull()?.equals(it.name) ?: false }

        if (command == null) {
            exitProcess(1)
        }

        println(command)
    }
}
