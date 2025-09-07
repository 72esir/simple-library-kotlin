package models

class Reader (val input_name: String) {
    private val _name = input_name
    private var _books = mutableListOf<Book>()

    val name
        get() = _name

    val books
        get() = _books
}