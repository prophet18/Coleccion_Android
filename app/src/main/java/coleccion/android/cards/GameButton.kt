package coleccion.android.cards

import android.widget.ImageButton
import coleccion.android.cards.Card

/*
    Similar to GameButton in original collection - separate buttons with parameters for index and card.
*/

class GameButton(giBtn: ImageButton, crd: Card) {

    var active: Boolean = false
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
