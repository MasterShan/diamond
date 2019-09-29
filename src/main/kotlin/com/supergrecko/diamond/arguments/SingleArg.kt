package com.supergrecko.diamond.arguments

import com.supergrecko.diamond.application.Argument
import com.supergrecko.diamond.application.ArgumentType

open class SingleArg : Argument<String> {
    companion object : SingleArg()
    override val type: ArgumentType = ArgumentType.SINGLE

    override fun execute(arg: String, args: List<String>): String {
        return arg
    }
}
