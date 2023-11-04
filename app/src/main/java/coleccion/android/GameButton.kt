package coleccion.android

/*
    Similar to GameButton in original collection - separate buttons with parameters for index and card.
*/

class GameButton internal constructor(indx: Int, crd: Card) {

    var active: Boolean = false
    var card: Card

    init {

        var index: Int

        var upcards: HashMap<Int?, Card?>

        index = indx
        card = crd


    }

    fun replace(crdnu: Card) {
        card = crdnu

    }



}