package coleccion.android.cards

/*
    Similar to GameButton in original collection - button with parameters for ImageButton and Card.
*/

import android.widget.ImageButton

class GameButton(giBtn: ImageButton, crd: Card) {

    var card: Card? = crd
    var cImg: Int = 0
    var gameImgBtn: ImageButton = giBtn

    init {
        cImg = card!!.image
    }

    fun replace(crdnu: Card) {
        card = crdnu
        cImg = card!!.image
    }
}
