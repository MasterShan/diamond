package com.supergrecko.diamond.commands

import com.supergrecko.diamond.application.Option
import com.supergrecko.diamond.dsl.command

fun compileCommand(label: String) = command {
    name = label

    options(
        Option("arg", 1)
    )

    execute {
        println(it.args)
        println(it.options)
    }
}
