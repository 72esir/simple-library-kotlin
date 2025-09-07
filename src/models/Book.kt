package models

data class Book (private val _title: String){
    private var _location: String = "library"

    val title
        get() = _title

    var location: String
        get() = _location
        set(loca) {
            _location = loca
        }
}