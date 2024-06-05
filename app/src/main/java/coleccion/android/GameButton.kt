package coleccion.android

import android.widget.ImageButton

/*
    Similar to GameButton in original collection - separate buttons with parameters for index and card.
*/

class GameButton {

    var active: Boolean = false
    var card: Card?
    var cImg: Int = 0
    var index: Int = 0
    lateinit var gameImgBtn: ImageButton
    constructor(giBtn: ImageButton, crd: Card) {
        card = crd
        gameImgBtn = giBtn
        cImg = card!!.image
    }
    constructor(indx: Int, giBtn: ImageButton, crd: Card) {
        card = crd
        index = indx
        gameImgBtn = giBtn
        cImg = card!!.image
    }
    constructor(indx: Int, crd: Card) {
        card = crd
        index = indx
        cImg = card!!.image
    }
    constructor(crd: Card) {
        card = crd
        cImg = card!!.image
    }
    fun toggleSelection() {
        // Toggle the selection state of the card
        if (this.active == true) {
            this.active = false;
        } else {
            this.active = true
        }
    }
    fun replace(crdnu: Card) {
        card = crdnu
        cImg = card!!.image
    }
    fun linkImgButton(giBtn2: ImageButton) {
        gameImgBtn = giBtn2
    }
}
