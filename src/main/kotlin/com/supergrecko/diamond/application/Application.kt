package com.supergrecko.diamond.application

import com.supergrecko.diamond.exceptions.CompilerException
import com.supergrecko.diamond.commands.compileCommand

class Application(private val args: List<String>) {
    private val commands: List<Command> = listOf(
        compileCommand("compile")
    )

    private val exceptions: MutableList<CompilerException> = mutableListOf()

    fun run() {
        try {
            route()
        } catch (ex: CompilerException) {
            // Exit the process if it wasn't a warning
            if (ex.warning) {
                exceptions.add(ex)
            } else {
                return ex.print()
            }
        } finally {
            exceptions.forEach { it.print() }
        }
    }

    private fun route() {
        // Find first command which name is equal to the action, if passed
        val command = commands.firstOrNull { args.firstOrNull()?.equals(it.name) ?: false }
            ?: throw CompilerException("Command '${args.first()}' was not found. Run 'diamond help' to view the command line manual.", false)

        println(command)
    }
}
