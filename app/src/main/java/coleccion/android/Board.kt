package coleccion.android

/*
    Similar to Board in original collection - all cards, labels, and buttons.
*/

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import coleccion.android.R.id
import coleccion.android.R.layout


class Board : ComponentActivity() {

    var buttons = ArrayList<GameButton>();      var cardmap = HashMap<Int, Card>();      var uu: Int = 13;                              var yy: Int = 0
    val deck = CardStack();                     var cards = ArrayList<Card>();           var score = ScorePile();                        var tt: Int = 0
    var nca: Int = 0;                           var ii: Int = 0;                         var buttonmap = HashMap<Int, GameButton>()

    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)

        /**/

        var gamebutton: GameButton;
        var scoreLabel: String = ("0");
        var bord = Board()
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


        var kk: Int = 0;

        var scoreVal = findViewById<TextView>(id.score_value)
        var timeVal = findViewById<TextView>(id.time_value)

        var nuCard1 = findViewById<ImageButton>(id.card1)
        var nuCard2 = findViewById<ImageButton>(id.card2)
        var nuCard3 = findViewById<ImageButton>(id.card3)
        var nuCard4 = findViewById<ImageButton>(id.card4)
        var nuCard5 = findViewById<ImageButton>(id.card5)
        var nuCard6 = findViewById<ImageButton>(id.card6)
        var nuCard7 = findViewById<ImageButton>(id.card7)
        var nuCard8 = findViewById<ImageButton>(id.card8)
        var nuCard9 = findViewById<ImageButton>(id.card9)
        var nuCard10 = findViewById<ImageButton>(id.card10)
        var nuCard11 = findViewById<ImageButton>(id.card11)
        var nuCard12 = findViewById<ImageButton>(id.card12)

        nuCard1.setBackgroundResource(buttons.get(0).card.image)
        nuCard2.setBackgroundResource(buttons.get(1).card.image)
        nuCard3.setBackgroundResource(buttons.get(2).card.image)
        nuCard4.setBackgroundResource(buttons.get(3).card.image)
        nuCard5.setBackgroundResource(buttons.get(4).card.image)
        nuCard6.setBackgroundResource(buttons.get(5).card.image)
        nuCard7.setBackgroundResource(buttons.get(6).card.image)
        nuCard8.setBackgroundResource(buttons.get(7).card.image)
        nuCard9.setBackgroundResource(buttons.get(8).card.image)
        nuCard10.setBackgroundResource(buttons.get(9).card.image)
        nuCard11.setBackgroundResource(buttons.get(10).card.image)
        nuCard12.setBackgroundResource(buttons.get(11).card.image)



        nuCard1.setOnClickListener { mechanics(0) }
        nuCard2.setOnClickListener { mechanics(1) }
        nuCard3.setOnClickListener { mechanics(2) }
        nuCard4.setOnClickListener { mechanics(3) }
        nuCard5.setOnClickListener { mechanics(4) }
        nuCard6.setOnClickListener { mechanics(5) }
        nuCard7.setOnClickListener { mechanics(6) }
        nuCard8.setOnClickListener { mechanics(7) }
        nuCard9.setOnClickListener { mechanics(8) }
        nuCard10.setOnClickListener { mechanics(9) }
        nuCard11.setOnClickListener { mechanics(10) }
        nuCard12.setOnClickListener { Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show() }





        }


     fun mechanics(crd: Int) {

            if (buttons.get(crd).active == true) {
                buttons.get(crd).active = false;
                // GameButton.getStyleClass().remove("ActiveButton")
                nca--
                if (nca == 1) {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                } else if (nca == 2) {
                    cardmap.remove(2)
                    buttonmap.remove(2)
                }
            } else {
                buttons.get(crd).active = true;
                nca++
                // GameButton.getStyleClass().add("ActiveButton")
                if (nca == 1) {
                    cardmap.put(1, buttons.get(crd).card)
                    buttonmap.put(1, buttons.get(crd))
                } else if (nca == 2) {
                    cardmap.put(2, buttons.get(crd).card)
                    buttonmap.put(2, buttons.get(crd))
                } else {
                    cardmap.put(3, buttons.get(crd).card)
                    buttonmap.put(3, buttons.get(crd))
                }
            }

            if (nca == 3) {
                var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)

                if (checkss != null) {
                    if (checkss.matchCheck == true) {
                        score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(
                            cardmap.get(
                                3
                            )
                        )
                        buttonmap.get(1)?.replace(cards.get(uu));
                        buttonmap.get(2)?.replace(cards.get(uu + 1));
                        buttonmap.get(3)?.replace(cards.get(uu + 2));

                        uu = uu + 3;
                        var scoreLabel = score.scoreFinal();
                        // setResult.setText("Correct!");
                    } else {
                        System.out.println("Wrong");
                        // setResult.setText("Wrong...");
                        // GameButton.getStyleClass().remove("ActiveButton");
                        // GameButton.getStyleClass().add("GameButton");
                    }
                }
                nca = 0;
                // scoreKeep.setText(scoreLabel);
                buttonmap.get(1)?.active = false; buttons.get(2)?.active =
                    false; buttons.get(3)?.active = false;

                /*
                buttons.get(1).getStyleClass().remove("ActiveButton"); buttons.get(2)
                    .getStyleClass().remove("ActiveButton"); buttons.get(3).getStyleClass()
                    .remove("ActiveButton");

                cardmap.clear(); buttons.clear(); indexmap.clear();
                check = null;

                 */
            }

        }

    }


/*
    fun mechanics(view: View) {cardArea.mechanics()}
    fun pooty(view: View) {Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show()}
*/


/*
private val handleTouch = OnTouchListener { v, event ->
    val x = event.x.toInt()
    val y = event.y.toInt()
    when (event.action) {
        MotionEvent.ACTION_DOWN -> Log.i("TAG", "touched down")
        MotionEvent.ACTION_MOVE -> Log.i("TAG", "moving: ($x, $y)")
        MotionEvent.ACTION_UP -> Log.i("TAG", "touched up")
    }
    true
}
*/
