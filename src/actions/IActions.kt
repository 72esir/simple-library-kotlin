package actions

interface IActions {
    fun addBook(title: String)

    fun addReader(name: String)

    fun findBook(title: String)

    fun giveBook(title: String, name: String)

    fun giveBackBook(title: String, name: String)

    fun printAllBooks()
}