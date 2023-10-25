package coleccion.android

import android.graphics.drawable.Drawable

data class Card (var col: String, var num: Int, var sha: String, var fil: String, var pat: String, var iiimg: Drawable) {

        var color: String = ""
        var number: Int = 0
        var shape: String = ""
        var fill: String = ""
        var path: String = ""
        lateinit var image: Drawable

        init {
            col = color
            num = number
            sha = shape
            fil = fill
            pat = path
            iiimg = image

        }


        /*
        fun imgAdd (iimg: Int) {
            this.image = iimg
        }

        */


}

class Deck {
    val cards: MutableList<Card> = mutableListOf()
}




