package com.supergrecko.diamond.dsl

import com.supergrecko.diamond.application.Command

fun command(init: Command.() -> Unit): Command {
    val command = Command()
    command.init()

    return command
}
