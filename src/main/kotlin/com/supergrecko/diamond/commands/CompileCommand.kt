package com.supergrecko.diamond.commands

import com.supergrecko.diamond.annotations.AppCommand
import com.supergrecko.diamond.application.Option
import com.supergrecko.diamond.dsl.command

@AppCommand
fun compileCommand() = command {
    name = "compile"
    description = "Compile a .dm file with the specified compiler options."
    arguments = 1

    options(Option("target", 1), Option("i", 1), Option("o", 1))

    execute {

    }
}
