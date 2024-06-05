package coleccion.android

import android.widget.ImageButton

/*
    Similar to GameButton in original collection - separate buttons with parameters for index and card.
*/

class GameButton(giBtn: ImageButton, crd: Card) {

<<<<<<< Updated upstream
    var active: Boolean = false
    var card: Card?
=======
    var active: Boolean? = null
    var card: Card? = crd
>>>>>>> Stashed changes
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
