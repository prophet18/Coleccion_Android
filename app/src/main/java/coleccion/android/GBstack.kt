package coleccion.android

import java.util.Stack

class GBstack : Stack<GameButton>() {

    var active: Boolean = false
    var cImg: Int = 0
    var index: Int = 0
    var card: Card? = null


    var gb1 = GameButton(card!!)

    }
/*
fun makeDeck() {

    val deck: CardStack()

    deck.shuffle()

    while (yy < 144) {
        card = deck.peek()
        deck.pop()
        cards.add(card)
        yy++
    }

    while (ii < 12) {
        gameButton = GameButton(cards.get(ii))
        // gameButton = GameButton((cards.get(ii))
        buttons.add(gameButton)
        ii++
    }
*/


