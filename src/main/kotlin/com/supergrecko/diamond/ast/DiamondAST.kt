package com.supergrecko.diamond.ast

sealed class DiamondAST {
    sealed class Literal : DiamondAST() {
        data class Int(val value: kotlin.Int) : DiamondAST()
        data class Double(val value: kotlin.Double) : DiamondAST()
        data class String(val value: kotlin.String) : DiamondAST()
        data class Boolean(val value: kotlin.Boolean) : DiamondAST()
        data class Id(val value: kotlin.String) : DiamondAST()
    }

    sealed class Expression : DiamondAST() {
        data class Grouping(val inner: DiamondAST) : DiamondAST()
        data class Variable(val name: DiamondAST) : DiamondAST()
        data class Call(val subject: DiamondAST, val types: List<DiamondAST>, val args: List<DiamondAST>) : DiamondAST()
        data class Multiplicative(val left: DiamondAST, val operator: DiamondAST, val right: DiamondAST) : DiamondAST()
        data class Additive(val left: DiamondAST, val operator: DiamondAST, val right: DiamondAST) : DiamondAST()
        data class Binary(val left: DiamondAST, val operator: DiamondAST, val right: DiamondAST) : DiamondAST()
        data class Infix(val left: DiamondAST, val operator: DiamondAST, val right: DiamondAST) : DiamondAST()
        data class Equality(val left: DiamondAST, val operator: DiamondAST, val right: DiamondAST) : DiamondAST()

        class This : DiamondAST()
    }

    sealed class Declaration : DiamondAST() {
        data class Namespace(val name: String) : DiamondAST()
        data class Entry(val body: List<DiamondAST>) : DiamondAST()
    }
}
