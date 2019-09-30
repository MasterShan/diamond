package com.supergrecko.diamond.commands

import com.supergrecko.diamond.application.Option
import com.supergrecko.diamond.dsl.command

fun compileCommand(label: String) = command {
    name = label
    description = "Compile a .dm file."
    arguments = 1

    options(Option("target", 3), Option("with", 1))

    execute {
        println(it)
    }
}
