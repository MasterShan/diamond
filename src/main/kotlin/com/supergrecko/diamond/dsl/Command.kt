package com.supergrecko.diamond.dsl

import com.supergrecko.diamond.application.Command
import com.supergrecko.diamond.application.Option

fun command(init: Command.() -> Unit): Command {
    val command = Command()
    command.init()

    return command
}

fun option(init: Option.() -> Unit): Option {
    val option = Option()
    option.init()

    return option
}
