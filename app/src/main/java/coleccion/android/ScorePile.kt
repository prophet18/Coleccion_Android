package coleccion.android

/*
    Similar to ScorePile in original collection - originally empty stack that is used to hold cards from successful matches.
    Functions for ScorePile include calculations for number of matches and cards, and reporting them.
*/

import java.util.Stack
import kotlin.math.floor

class ScorePile : Stack<Card>() {

    private var numCard : Int = 0
    private var numMatch : Int = 0
    private var numMatching : String = " "

    fun scoreTotal(): Int {
        numCard = size
        numMatch = floor((numCard / 3).toDouble()).toInt()
        return numMatch
    }

    fun scoreFinal(): String {
        numCard = size
        numMatch = floor((numCard / 3).toDouble()).toInt()
        numMatching = numMatch.toString()
        return numMatching
    }
}
