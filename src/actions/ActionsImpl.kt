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
                if (book.location == "library"){
                    println("This book in library!")
                }
                else{
                    println("${book.location} take this book ")
                }
                return
            }
        }
        println("This book does not here!")
    }

    override fun giveBook(title: String, name: String){
        for (book in books){
            if (book.title == title && book.location == "library"){
                for (reader in readers){
                    if (reader.name == name){
                        book.location = name
                        reader.books.add(book)

                        println("Book were given!")
                        return
                    }
                }
                println("This is not our reader")
                return
            }
        }
        println("This book does not here!")
    }

    override fun giveBackBook(title: String, name: String) {
        for (reader in readers){
            if (reader.name == name){
                for (book in reader.books){
                    if (book.title == title){
                        reader.books.remove(book)
                        book.location = "library"
                        println("Book were given back!")
                        return
                    }
                }
                println("This reader does not have target book")
                return
            }
        }
        println("This is not our reader")
    }

    override fun printAllBooks() {
        var count: Int = 0
        for (book in books){
            if (book.location == "library"){
                println(book.title)
                count += 1
            }
        }
        if (count == 0){
            println("Empty")
        }
        println()
    }
}