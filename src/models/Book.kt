package models

class Book (val input_title: String){
    private val _title: String = input_title
    private var _location: String = "library"

    val title
        get() = _title

    var location: String
        get() = _location
        set(loca) {
            _location = loca
        }
}