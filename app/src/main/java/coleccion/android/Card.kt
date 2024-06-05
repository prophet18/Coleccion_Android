package coleccion.android

/*
    Similar to Card in original collection - class is created with necessary parameters / arguments.
*/

class Card {

    var color: String = ""
    var number: Int = 0
    var shape: String = ""
    var fill: String = ""
    var path: String = ""
    var image: Int = 0

    constructor(col: String, num: Int, sha: String, fil: String, img: Int) {
        color = col
        number = num
        shape = sha
        fill = fil
        image = img
    }
    constructor(col: String, num: Int, sha: String, fil: String) {
        color = col
        number = num
        shape = sha
        fill = fil

    }
    init {

    }
}

fun matchCheck(uno: Card, dos: Card, tres: Card): Boolean {
    var first = uno
    var second = dos
    var third = tres
    var theCheck = CheckMatch(first, second, third)

    if (theCheck.matchCheck == true) {
        return true
    } else {
        return false
    }
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




