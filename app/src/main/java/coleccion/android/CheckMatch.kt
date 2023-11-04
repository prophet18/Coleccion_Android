package coleccion.android

/*
    Similar to CheckMatch in original collection - this class (with constuctor) creates an object of 3 cards.
    These cards are then analyed for the conditions that constitute a set, and returns the boolean.
*/
class CheckMatch internal constructor(first: Card, second: Card, third: Card) {
    var colorSame = false
    var numberSame = false
    var typeSame = false
    var fillSame = false
    var colorDifferent = false
    var numberDifferent = false
    var typeDifferent = false
    var fillDifferent = false
    var colorCheck = false
    var numberCheck = false
    var typeCheck = false
    var fillCheck = false
    var matchCheck = false
    init {
        colorCheck = if (sameColor(first, second, third) == true || differentColor(
            first, second, third) == true            ) {true} else {                false            }
        numberCheck =            if (sameNumber(first, second, third) == true || differentNumber(
                    first,                    second,                    third                ) == true            ) {                true
            } else {                false            }
        typeCheck =            if (sameType(first, second, third) == true || differentType(
                    first,                    second,                    third                ) == true
            ) {                true            } else {                false            }
        fillCheck =            if (sameFill(first, second, third) == true || differentFill(
                    first,                    second,                    third                ) == true
            ) {                true            } else {                false            }
        matchCheck =            if (colorCheck == true && numberCheck == true && typeCheck == true && fillCheck == true) {
                true            } else {                false            }    }
    fun sameColor(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        colorSame =            if (cardOne.color === cardTwo.color && cardThree.color === cardTwo.color && cardThree.color === cardOne.color) {
                true            } else {                false            }
        return colorSame    }
    fun sameNumber(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        numberSame =
            if (cardOne.number == cardTwo.number && cardThree.number == cardTwo.number && cardThree.number == cardOne.number) {
                true            } else {                false            }
        return numberSame    }

    fun sameType(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        typeSame =            if (cardOne.shape === cardTwo.shape && cardThree.shape === cardTwo.shape && cardThree.shape === cardOne.shape) {
                true            } else {                false            }
        return typeSame
    }
    fun sameFill(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        fillSame =            if (cardOne.fill === cardTwo.fill && cardThree.fill === cardTwo.fill && cardThree.fill === cardOne.fill) {
                true            } else {                false            }
        return fillSame
    }
    fun differentColor(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        colorDifferent =            if (cardOne.color !== cardTwo.color && cardThree.color !== cardTwo.color && cardThree.color !== cardOne.color) {
                true            } else {                false            }
        return colorDifferent
    }
    fun differentNumber(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        numberDifferent =            if (cardOne.number != cardTwo.number && cardThree.number != cardTwo.number && cardThree.number != cardOne.number) {
                true            } else {                false            }
        return numberDifferent
    }
    fun differentType(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        typeDifferent =            if (cardOne.shape !== cardTwo.shape && cardThree.shape !== cardTwo.shape && cardThree.shape !== cardOne.shape) {
                true            } else {                false            }
        return typeDifferent
    }
    fun differentFill(cardOne: Card, cardTwo: Card, cardThree: Card): Boolean {
        fillDifferent =            if (cardOne.fill !== cardTwo.fill && cardThree.fill !== cardTwo.fill && cardThree.fill !== cardOne.fill) {
                true            } else {                false            }
        return fillDifferent
    }
    fun result() {
        println("Are Cards a Match? $matchCheck")
    }

}

