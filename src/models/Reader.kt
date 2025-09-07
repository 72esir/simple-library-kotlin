package models

data class Reader (private val _name: String) {
    private var _books = mutableListOf<Book>()

    val name
        get() = _name

    val books
        get() = _books
}