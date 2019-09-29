package com.supergrecko.diamond.application

data class CommandEvent(val args: List<String>, val options: List<Options>) {
    fun hasOpt(name: String) = options.any { it.name == name }
    fun getOpt(name: String) = options.first { it.name == name }
    fun hasArg(name: String) = args.contains(name)
}
