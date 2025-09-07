package models

class Library {
    private var _books = mutableListOf<Book>()
    private var _readers = mutableListOf<Reader>()

    val books
        get() = _books

    val readers
        get() = _readers
}