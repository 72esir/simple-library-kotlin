import actions.ActionsImpl
import models.Library

fun main() {
    val library = Library()
    val actions = ActionsImpl(library.books, library.readers)

    while (true){
        printMenu()
        val choice = userChoice()
        when (choice) {
            1 -> addBook(actions)
            2 -> addReader(actions)
            3 -> findBook(actions)
            4 -> giveBook(actions)
            5 -> giveBackBook(actions)
            6 -> actions.printAllBooks()
            7 -> return
            else -> println("Your choice not from the list")
        }
    }
}

private fun printMenu() {
    println()
    println("Hello! Choose your action:")
    println("1) add book")
    println("2) add reader")
    println("3) find book")
    println("4) give book")
    println("5) give back book")
    println("6) print all books")
    println("7) exit")
}

private fun userChoice(): Int{
    while (true){
        val choice: Int = try {
            readLine()?.toInt() ?: -1
        } catch (e: NullPointerException) {
            println("Invalid input. Try again with correct number")
            -1
        }
        return choice
    }
}

private fun addBook (actions: ActionsImpl){
    println("Enter the book title")
    while (true){
        val title = readLine()?.trim()

        if (title.isNullOrBlank()) {
            println("Invalid input. Try again with correct title")
            continue
        }
        actions.addBook(title)
        break
    }
}

private fun addReader (actions: ActionsImpl){
    println("Enter the reader name")
    while (true){
        val name = readLine()?.trim()

        if (name.isNullOrBlank()) {
            println("Invalid input. Try again with correct name")
            continue
        }
        actions.addReader(name)
        break
    }
}

private fun findBook(actions: ActionsImpl){
    println("Enter the book title")
    while (true){
        val title = readLine()?.trim()

        if (title.isNullOrBlank()) {
            println("Invalid input. Try again with correct title")
            continue
        }
        actions.findBook(title)
        break
    }
}

private fun giveBook(actions: ActionsImpl){
    println("Enter the book title and reader name")
    while (true){
        val title = readLine()?.trim()
        val name = readLine()?.trim()

        if (title.isNullOrBlank()) {
            println("Invalid input. Try again with correct title")
            continue
        }
        if (name.isNullOrBlank()) {
            println("Invalid input. Try again with correct name")
            continue
        }

        actions.giveBook(title, name)
        break
    }
}

private fun giveBackBook(actions: ActionsImpl){
    println("Enter the book title and reader name")
    while (true){
        val title = readLine()?.trim()
        val name = readLine()?.trim()

        if (title.isNullOrBlank()) {
            println("Invalid input. Try again with correct title")
            continue
        }
        if (name.isNullOrBlank()) {
            println("Invalid input. Try again with correct name")
            continue
        }

        actions.giveBackBook(title, name)
        break
    }
}
