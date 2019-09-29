package com.supergrecko.diamond.application

import com.supergrecko.diamond.exceptions.CompilerException

/**
 * Represents a command for the command line
 *
 * @property name
 * @property required
 * @property executor
 * @property options
 */
class Command {
    var name: String = "unnamed"
    var required: Int = 0
    private var executor: (event: CommandEvent) -> Unit = { throw CompilerException("Missing internal implementation of the $name command.", false) }
    private val options: MutableList<Option> = mutableListOf()

    fun options(vararg opts: Option) = options.addAll(opts)
    fun dispatch(event: CommandEvent) = executor(event)

    fun execute(handle: (event: CommandEvent) -> Unit) {
        this.executor = handle
    }
}
