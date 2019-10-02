package com.supergrecko.diamond.commands

import com.supergrecko.diamond.annotations.AppCommand
import com.supergrecko.diamond.application.Option
import com.supergrecko.diamond.dsl.command

@AppCommand
fun compileCommand() = command {
    name = "compile"
    description = "Compile a .dm file."
    arguments = 1

    options(Option("target", 3), Option("with", 1))

    execute {
        println(it)
    }
}
