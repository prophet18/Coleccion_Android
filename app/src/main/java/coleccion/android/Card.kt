package coleccion.android

class Card (var col: String, var num: Int, var sha: String, var fil: String, var img: Int) {

    var color: String = ""
    var number: Int = 0
    var shape: String = ""
    var fill: String = ""
    var path: String = ""
    var image: Int = 0
    init {
        col = color
        num = number
        sha = shape
        fil = fill
        img = image
    }
}

fun matchCheck(): Boolean {

    return true
}

/*
class Cards {
    var col: String
    var num: Int
    var sha: String
    var fil: String
    var image: Int = 0

    constructor(col: String, num: Int, sha: String, fil: String, img: Int) {
        this.col = col
        this.num = num
        this.sha = sha
        this.fil = fil
        this.image = img
    }
}


 */




