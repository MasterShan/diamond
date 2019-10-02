package com.supergrecko.diamond.commands

import com.supergrecko.diamond.annotations.AppCommand
import com.supergrecko.diamond.dsl.command

@AppCommand
fun versionCommand() = command {
    name = "version"
    description = "Get the compiler version."
    arguments = 0

    execute {
        it.println("Diamond Compiler v${it.app.version}")
    }
}