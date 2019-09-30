package com.supergrecko.diamond.application

data class CommandEvent(val args: List<String>, val options: List<Options>, val app: Application) {
    // Argument related commands
    fun hasOpt(name: String) = options.any { it.name == name }
    fun getOpt(name: String) = options.first { it.name == name }
    fun hasArg(name: String) = args.contains(name)

    fun print(message: String) = kotlin.io.print(message)
    fun println(message: String) = kotlin.io.println(message)
}
