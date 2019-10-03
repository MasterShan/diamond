package com.supergrecko.diamond.application

data class CommandEvent(val args: List<String>, val options: List<Options>, val app: Application) {
    // Argument related commands
    fun getOption(name: String) = options.filter { it.name == name }
    fun hasOpt(name: String) = options.any { it.name == name }
    fun first(name: String) = options.firstOrNull { it.name == name }?.values?.first()
    fun all(name: String) = getOption(name).map { it.values.first() }
}
