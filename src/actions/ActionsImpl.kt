package actions

import models.Book
import models.Library
import models.Reader

class ActionsImpl (val books: MutableList<Book>, val readers: MutableList<Reader>): IActions  {
    override fun addBook(title: String) {
        TODO("Not yet implemented")
        val book: Book = Book(title)

        books.add(book)
        println("Book added!")
    }

    override fun addReader(name: String) {
        TODO("Not yet implemented")
        readers.add(name)
    }

    override fun findBook(title: String) {
        TODO("Not yet implemented")
    }

    override fun giveBook(title: String) {
        TODO("Not yet implemented")
    }

    override fun printAllBooks() {
        TODO("Not yet implemented")

    }
}