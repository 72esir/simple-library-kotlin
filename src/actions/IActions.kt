package actions

interface IActions {
    fun addBook(title: String)

    fun addReader(name: String)

    fun findBook(title: String)

    fun giveBook(title: String)

    fun printAllBooks()
}