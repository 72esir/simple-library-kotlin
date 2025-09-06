import actions.ActionsImpl
import models.Library

fun main() {
    println("Hello! Choose your action:")
    println()
    println("1) add book")
    println("2) add reader")
    println("3) find book")
    println("4) give book")
    println("5) print all books")

    val library = Library()

    val actions = ActionsImpl(library.books, library.readers)


}