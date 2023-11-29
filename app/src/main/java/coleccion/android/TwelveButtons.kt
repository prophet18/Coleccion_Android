package coleccion.android

import android.widget.ImageButton
import java.util.Stack

class TwelveButtons : Stack<ImageButton>() {

    var active: Boolean = false
    var card: Card? = null
    var cImg: Int = 0

    init {


        var index: Int = 0
        var iBut2: ImageButton


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

}