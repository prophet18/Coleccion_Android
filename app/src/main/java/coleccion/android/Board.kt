package coleccion.android

/*
    Similar to Board in original collection - all cards, labels, and buttons.
    17 Nov, trying buttion action adding here.
*/

import android.R
import android.R.attr.button
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import coleccion.android.R.id
import coleccion.android.R.layout


class Board : ComponentActivity() {

    var buttons = ArrayList<GameButton>();
    var cardmap = HashMap<Int, Card>();
    var uu: Int = 13;
    var yy: Int = 0
    val deck = CardStack();
    var cards = ArrayList<Card>();
    var score = ScorePile();
    var tt: Int = 0
    var nca: Int = 0;
    var ii: Int = 0;
    var buttonmap = HashMap<Int, GameButton>();
    var gh: Int = 0;
    var gi: Int = 0
    var ibuttons = ArrayList<ImageButton>()
    var cactivity: Boolean = false;
    var nomadmap = HashMap<Int, ImageButton>()

    var nuCard1 = findViewById<ImageButton>(id.card1);
    var nuCard2 = findViewById<ImageButton>(id.card2);
    var nuCard3 = findViewById<ImageButton>(id.card3);
    var nuCard4 = findViewById<ImageButton>(id.card4);
    var nuCard5 = findViewById<ImageButton>(id.card5);
    var nuCard6 = findViewById<ImageButton>(id.card6);
    var nuCard7 = findViewById<ImageButton>(id.card7);
    var nuCard8 = findViewById<ImageButton>(id.card8);
    var nuCard9 = findViewById<ImageButton>(id.card9);
    var nuCard10 = findViewById<ImageButton>(id.card10);
    var nuCard11 = findViewById<ImageButton>(id.card11);
    var nuCard12 = findViewById<ImageButton>(id.card12);


    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)

        /**/

        var gamebutton: GameButton;
        var scoreLabel: String = ("0");
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

        ibuttons.add(nuCard1); ibuttons.add(nuCard2);ibuttons.add(nuCard3);ibuttons.add(nuCard4);ibuttons.add(
            nuCard5
        );ibuttons.add(nuCard6);
        ibuttons.add(nuCard7); ibuttons.add(nuCard8);ibuttons.add(nuCard9);ibuttons.add(nuCard10);ibuttons.add(
            nuCard11
        );ibuttons.add(nuCard12);

        nomadmap.put(1, nuCard1); nomadmap.put(2, nuCard2);nomadmap.put(3, nuCard3);nomadmap.put(
            4,
            nuCard4
        );nomadmap.put(5, nuCard5);nomadmap.put(6, nuCard6);
        nomadmap.put(7, nuCard7); nomadmap.put(8, nuCard8);nomadmap.put(9, nuCard9);nomadmap.put(
            10,
            nuCard10
        );nomadmap.put(11, nuCard11);nomadmap.put(12, nuCard12);

        nuCard1.setOnClickListener { meching(nuCard1) }
        nuCard2.setOnClickListener { meching(nuCard2) }
        nuCard3.setOnClickListener { meching(nuCard3) }
        nuCard4.setOnClickListener { meching(nuCard4) }
        nuCard5.setOnClickListener { meching(nuCard5) }
        nuCard6.setOnClickListener { meching(nuCard6) }
        nuCard7.setOnClickListener { meching(nuCard7) }
        nuCard8.setOnClickListener { meching(nuCard8) }
        nuCard9.setOnClickListener { meching(nuCard9) }
        nuCard10.setOnClickListener { meching(nuCard10) }
        nuCard11.setOnClickListener { meching(nuCard11) }
        nuCard12.setOnClickListener { Toast.makeText(this, "moo", Toast.LENGTH_SHORT).show() }
    }


    /*
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
*/

    fun evals() {
        var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)

        if (checkss != null) {
            if (checkss.matchCheck == true) {
                score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(
                    cardmap.get(3)
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
        cardmap.clear(); buttons.clear(); nomadmap.clear()

    }


    fun meching(view: View) {
        for (GameButton in buttons) {
            if (cactivity == true) {
                cactivity = false
            } else {
                cactivity = true
            }
        }
        for (ImageButton in ibuttons) {
            if (cactivity == true) {
                cactivity = false
            } else {
                cactivity = true
            }
        }

        while (tt < 12) {
            if (buttons.get(tt).active == true && cactivity == true) {
                buttons.get(tt).active = false
                cactivity = false
                nca--
                if (nca == 1) {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                    nomadmap.remove(1)
                } else if (nca == 2) {
                    cardmap.remove(2)
                    buttonmap.remove(2)
                    nomadmap.remove(2)
                }
            } else {
                buttons.get(tt).active = true
                cactivity = true
                nca++
                if (nca == 1) {
                    cardmap.put(1, buttons.get(tt).card)
                    buttonmap.put(1, buttons.get(tt))
                    nomadmap.put(1, ibuttons.get(tt))
                } else if (nca == 2) {
                    cardmap.put(2, buttons.get(tt).card)
                    buttonmap.put(2, buttons.get(tt))
                    nomadmap.put(2, ibuttons.get(tt))
                } else {
                    cardmap.put(3, buttons.get(tt).card)
                    buttonmap.put(3, buttons.get(tt))
                    nomadmap.put(3, ibuttons.get(tt))
                }

            }
            tt++
        }

        if (nca == 3) {
            evals()
        }


    }
}



/*
buttons.get(1).getStyleClass().remove("ActiveButton"); buttons.get(2)
    .getStyleClass().remove("ActiveButton"); buttons.get(3).getStyleClass()
    .remove("ActiveButton");


*/

