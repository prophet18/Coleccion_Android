package coleccion.android

import android.app.Activity
import android.text.method.Touch
import android.view.MotionEvent
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Motion
import com.google.firebase.events.EventHandler

/*
    Similar to CardArea in original collection - all 12 cards and major workings of game.
*/

class PlayArea {

    var buttons = ArrayList<GameButton>();      var cardmap = HashMap<Int, Card>();      var uu: Int = 13;                              var yy: Int = 0
    val deck = CardStack();                     var cards = ArrayList<Card>();           var score = ScorePile();                        var tt: Int = 0
    var nca: Int = 0;                           var ii: Int = 0;                         var buttonmap = HashMap<Int, GameButton>()

    init {
        var gamebutton: GameButton;
        var scoreLabel: String = ("0");
        // var bord = Board()
        var card: Card
        deck.shuffle()

        while (yy < 144) {
            card = deck.peek()
            deck.pop()
            cards.add(card)
            yy++
        }

        while (ii < 12) {
            gamebutton = GameButton((ii + 1), cards.get(ii))
            buttons.add(gamebutton)
            ii++
        }

    }







    }






