package coleccion.android.cards

/*
    Similar to Card in original collection - class is created with necessary parameters / arguments.
*/

class Card(col: String, num: Int, sha: String, fil: String, img: Int) {

    var color: String = col
    var number: Int = num
    var shape: String = sha
    var fill: String = fil
    var path: String = ""
    var image: Int = img

}
