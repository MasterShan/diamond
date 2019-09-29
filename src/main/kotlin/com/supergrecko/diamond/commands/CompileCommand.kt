package com.supergrecko.diamond.commands

import com.supergrecko.diamond.application.command
import com.supergrecko.diamond.arguments.SingleArg

fun compileCommand(label: String) = command {
    name = label

    expect(SingleArg)
}
