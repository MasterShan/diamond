package com.supergrecko.diamond.application

import com.supergrecko.diamond.annotations.AppCommand
import com.supergrecko.diamond.exceptions.CompilerException
import org.reflections.Reflections
import org.reflections.scanners.MethodAnnotationsScanner

class Application(private val args: List<String>) {
    val version: String = "0.0.0-alpha"
    val commands: MutableList<Command> = mutableListOf()
    private val exceptions: MutableList<CompilerException> = mutableListOf()

    init {
        loadCommands()
    }

    fun run() {
        try {
            dispatch()
        } catch (ex: CompilerException) {
            // Exit the process if it wasn't a warning
            if (ex.silent) {
                exceptions.add(ex)
            } else {
                return ex.print()
            }
        } finally {
            exceptions.forEach { it.print() }
        }
    }

    private fun loadCommands() {
        // Reflectively get all @AppCommands
        val ref = Reflections("com.supergrecko.diamond", MethodAnnotationsScanner())
        val found = ref.getMethodsAnnotatedWith(AppCommand::class.java)

        found.forEach {
            commands.add(it.invoke(it) as Command)
        }
    }

    private fun dispatch() {
        // Find first command which name is equal to the action, if passed
        val command = commands.firstOrNull { args.firstOrNull()?.equals(it.name) ?: false }
                ?: throw CompilerException("CommandLineException", "Command '${args.first()}' was not found. Run 'diamond help' to view the command line manual.", false)

        val event = ArgumentParser(command, args.drop(1), this).parse()
        command.dispatch(event)
    }
}
