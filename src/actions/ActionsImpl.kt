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
            if (book._title == title){
                if (book._location == "library"){
                    println("This book in library!")
                }
                else{
                    println("${book._location} take this book ")
                }
                return
            }
        }
        println("Your book does not here!")
    }

    override fun giveBook(title: String, name: String){
        for (book in books){
            if (book._title == title && book._location == "library"){
                for (reader in readers){
                    if (reader._name == name){
                        book._location = name
                        reader._books.add(book)

                        println("Book were given!")
                        return
                    }
                }
                println("This is not our reader")
                return
            }
        }
        println("Your book does not here!")
    }

    override fun giveBackBook(title: String, name: String) {
        for (reader in readers){
            if (reader._name == name){
                for (book in reader._books){
                    if (book._title == title){
                        reader._books.remove(book)
                        book._location = "library"
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
            if (book._location == "library"){
                println(book._title)
                count += 1
            }
        }
        if (count == 0){
            println("Empty")
        }
        println()
    }
}