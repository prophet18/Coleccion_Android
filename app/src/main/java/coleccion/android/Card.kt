<<<<<<< Updated upstream:app/src/main/java/coleccion/android/Card.kt
package coleccion.android
=======
package coleccion.android.cards
>>>>>>> Stashed changes:app/src/main/java/coleccion/android/cards/Card.kt

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
