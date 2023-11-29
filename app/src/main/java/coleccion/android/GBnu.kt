package coleccion.android

class GBnu (gbCard: Card) {

    var active: Boolean = false
    var card = gbCard
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