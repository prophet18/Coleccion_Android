package coleccion.android

import android.view.View
import android.widget.ImageButton

class GBnu2 (gbCard: Card, imggg: ImageButton) {

    var active: Boolean = false
    var card = gbCard
    var cImg = card.image
    var index: Int = 0
    var imTwo = imggg



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
        cImg = card.image
    }
}
