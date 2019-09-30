package com.supergrecko.diamond.commands

import com.supergrecko.diamond.dsl.command

fun versionCommand(label: String) = command {
    name = label
    description = "Get the compiler version."
    arguments = 0

    execute {
        it.println("Diamond Compiler v${it.app.version}")
    }
}