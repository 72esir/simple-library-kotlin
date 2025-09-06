package actions

import models.Book
import models.Library
import models.Reader

class ActionsImpl (val books: MutableList<Book>, val readers: MutableList<Reader>): IActions  {
    override fun addBook(title: String) {
        val book: Book = Book(title)
        books.add(book)
        println("Book added!")
    }

    override fun addReader(name: String) {
        val reader = Reader(name)
        readers.add(reader)
        println("Reader added!")
    }

    override fun findBook(title: String){
        for (book in books){
            if (book.title == title){
                println("Your book here!")
                return
            }
        }
        println("Your book does not here!")
    }

    override fun giveBook(title: String){
        for (book in books){
            if (book.title == title){
                books.remove(book)
                println("Book were given!")
                return
            }
        }
        println("Your book does not here!")
    }

    override fun printAllBooks() {
        for (book in books){
            println(book.title)
        }
        println()
    }
}