package com.supergrecko.diamond.application

import com.supergrecko.diamond.exceptions.CompilerException

/**
 * Represents a command for the command line
 *
 * @property name
 * @property arguments
 * @property executor
 * @property options
 */
class Command {
    var name: String = "unnamed"
    var arguments: Int = 0
    var description: String = "Default description"
    // The lambda which is ran when the event is triggered
    private var executor: (event: CommandEvent) -> Unit = { throw CompilerException("CommandLineException","Missing internal implementation of the $name command.", false) }
    val options: MutableList<Option> = mutableListOf()

    fun options(vararg opts: Option) = options.addAll(opts)
    fun dispatch(event: CommandEvent) = executor(event)

    fun execute(handle: (event: CommandEvent) -> Unit) {
        this.executor = handle
    }
}
