package models

data class Library (
    private var _books: MutableList<Book> = mutableListOf<Book>(),
    private var _readers: MutableList<Reader> = mutableListOf<Reader>()
) {
    val books
        get() = _books

    val readers
        get() = _readers
}