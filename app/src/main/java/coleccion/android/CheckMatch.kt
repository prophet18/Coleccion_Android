package coleccion.android

/*
    Similar to CheckMatch in original collection - this class (with constuctor) creates an object of 3 cards.
    These cards are then analyed for the conditions that constitute a set, and returns the boolean.
*/

class CheckMatch (first: Card, second: Card, third: Card) {
    private var colorSame = false
    private var numberSame = false
    private var typeSame = false
    private var fillSame = false
    private var colorDifferent = false
    private var numberDifferent = false
    private var typeDifferent = false
    private var fillDifferent = false
    private var colorCheck = false
    private var numberCheck = false
    private var typeCheck = false
    private var fillCheck = false
    var matchCheck = false

    init {
        colorCheck = sameColor(first, second, third) == true || differentColor(first, second, third) == true
        numberCheck = sameNumber(first, second, third) == true || differentNumber(first, second, third) == true
        typeCheck = sameType(first, second, third) == true || differentType(first, second, third) == true
        fillCheck = sameFill(first, second, third) == true || differentFill(first, second, third) == true
        matchCheck =
            colorCheck == true && numberCheck == true && typeCheck == true && fillCheck == true
    }

    // Functions to assess identical properties

    private fun sameColor (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        colorSame = cardOne.color == cardTwo.color && cardThree.color == cardTwo.color
        return colorSame
    }

    private fun sameNumber (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        numberSame = cardOne.number == cardTwo.number && cardThree.number == cardTwo.number
        return numberSame
    }

    private fun sameType (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        typeSame = cardOne.shape == cardTwo.shape && cardThree.shape == cardTwo.shape
        return typeSame
    }

    private fun sameFill (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        fillSame = cardOne.fill == cardTwo.fill && cardThree.fill == cardTwo.fill
        return fillSame
    }

    // private functions to assess discordant properties

    private fun differentColor (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        colorDifferent =
            cardOne.color != cardTwo.color && cardThree.color != cardTwo.color && cardThree.color != cardOne.color
        return colorDifferent
    }

    private fun differentNumber (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        numberDifferent =
            cardOne.number != cardTwo.number && cardThree.number != cardTwo.number && cardThree.number != cardOne.number
        return numberDifferent
    }

    private fun differentType (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        typeDifferent =
            cardOne.shape != cardTwo.shape && cardThree.shape != cardTwo.shape && cardThree.shape != cardOne.shape
        return typeDifferent
    }

    private fun differentFill (cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        fillDifferent =
            cardOne.fill != cardTwo.fill && cardThree.fill != cardTwo.fill && cardThree.fill != cardOne.fill
        return fillDifferent
    }
}
