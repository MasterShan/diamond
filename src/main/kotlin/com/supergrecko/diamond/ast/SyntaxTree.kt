package com.supergrecko.diamond.ast

sealed class SyntaxTree {
    sealed class Literal : SyntaxTree() {
        data class Int(val value: kotlin.Int) : SyntaxTree()
        data class Double(val value: kotlin.Double) : SyntaxTree()
        data class String(val value: kotlin.String) : SyntaxTree()
        data class Boolean(val value: kotlin.Boolean) : SyntaxTree()
        data class Id(val value: kotlin.String) : SyntaxTree()
    }

    sealed class Expression : SyntaxTree() {
        data class Grouping(val inner: SyntaxTree) : SyntaxTree()
        data class Variable(val name: SyntaxTree) : SyntaxTree()
        data class Call(val subject: SyntaxTree, val types: List<SyntaxTree>, val args: List<SyntaxTree>) : SyntaxTree()
        data class Multiplicative(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
        data class Additive(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
        data class Binary(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
        data class Infix(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
        data class Equality(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()

        class This : SyntaxTree()
    }

    sealed class Declaration : SyntaxTree() {
        data class Namespace(val name: String) : SyntaxTree()
        data class Entry(val body: List<SyntaxTree>) : SyntaxTree()
    }
}
