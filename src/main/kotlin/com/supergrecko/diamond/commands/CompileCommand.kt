package com.supergrecko.diamond.commands

import com.supergrecko.diamond.dsl.command

fun compileCommand(label: String) = command {
    name = label

    execute {
        println("compile")
    }
}
