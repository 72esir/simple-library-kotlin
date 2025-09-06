package models

class Reader (val name: String) {
    val _name = name
    var _books = mutableListOf<Book>()
}