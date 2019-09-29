package com.supergrecko.diamond.application

class ArgumentParser(private val command: Command, private val argv: List<String>) {
    private val args: MutableList<String> = mutableListOf()
    private val options: MutableList<Options> = mutableListOf()

    fun parse(): CommandEvent {


        return CommandEvent(args, options)
    }
}
