package com.supergrecko.diamond.application

import com.supergrecko.diamond.exceptions.CompilerException

class ArgumentParser(private val command: Command, private val argv: List<String>, private val app: Application) {
    private val args: MutableList<String> = mutableListOf()
    private val opts: MutableList<Options> = mutableListOf()
    private var index: Int = 0

    // Navigation helpers
    private fun next() = index++
    private fun get() = argv[index]
    private fun atEnd() = index >= argv.size

    fun parse(): CommandEvent {
        // Iterate over each cli arg
        while (!atEnd()) {
            val arg = get()

            // If it is a flag
            if (arg.startsWith("--")) {
                parseOption(arg.substring(2))
            } else {
                args.add(arg)
                next()
            }
        }

        if (args.size != command.arguments) {
            throw CompilerException("CommandLineException", "Command '${command.name}' expects ${command.arguments} arguments. ${args.size} passed.", false)
        }

        return CommandEvent(args, opts, app)
    }

    /**
     * Parse a cli option
     *
     * @param name
     */
    private fun parseOption(name: String) {
        // Get the option if it exists for the command
        val option = command.options.firstOrNull { it.name == name }
            ?: throw CompilerException("CommandLineException", "Option '--$name' is not a valid option for ${command.name}.", false)

        val matches = mutableListOf<String>()

        // For as many as the option requires
        for (i in 0..option.size) {
            if (atEnd()) {
                // Not enough arguments were passed
                throw CompilerException("CommandLineExceptiomn", "Option '--$name' expected ${option.size} parameters. $i parameters were passed.", false)
            }

            matches.add(get())
            next()
        }
        // Add to list
        opts.add(Options(name, matches.drop(1)))
    }
}
