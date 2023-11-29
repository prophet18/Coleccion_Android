package coleccion.android

class IBnu (nuGB: GBnu) {

    var active: Boolean = false
    var card = nuGB.card
    var cImg = card.image
    var index: Int = 0



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