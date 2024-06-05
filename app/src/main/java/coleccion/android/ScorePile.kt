package coleccion.android

/*
    Similar to ScorePile in original collection - originally empty stack that is used to hold cards from successful matches.
    Functions for ScorePile include calculations for number of matches and cards, and reporting them.
*/

import android.annotation.SuppressLint
import java.util.Stack
import kotlin.math.floor

class ScorePile : Stack<Card>() {

<<<<<<< Updated upstream
    var numCard:Int = 0 ; var numMatch:Int = 0;
    var numMatching:String = " "; lateinit var card:Card;

        fun ScorePile() {
            numCard = 0
            numMatch = 0
        }

=======
    private var numCard : Int = 0
    private var numMatch : Int = 0
    private var numMatching : String = " "
>>>>>>> Stashed changes
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
