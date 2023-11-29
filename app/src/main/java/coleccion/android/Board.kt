package coleccion.android

/*
    Similar to Board in original collection - all cards, labels, and buttons.
*/

import android.annotation.SuppressLint
import android.os.Bundle
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
    var daImgButtons = ArrayList<ImageButton>();
    var score = ScorePile();
    var tt: Int = 0
    var nca: Int = 0;
    var ii: Int = 0;
    var buttonmap = HashMap<Int, GameButton>();
    var kk: Int = 0

    var acting: Boolean = false


    lateinit var card: Card
    lateinit var gameButton: GameButton


    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)


        makeDeck()

        var nuCard1 = findViewById<ImageButton>(id.card1); daImgButtons.add(nuCard1)
        var nuCard2 = findViewById<ImageButton>(id.card2); daImgButtons.add(nuCard2)
        var nuCard3 = findViewById<ImageButton>(id.card3); daImgButtons.add(nuCard3)
        var nuCard4 = findViewById<ImageButton>(id.card4); daImgButtons.add(nuCard4)
        var nuCard5 = findViewById<ImageButton>(id.card5); daImgButtons.add(nuCard5)
        var nuCard6 = findViewById<ImageButton>(id.card6); daImgButtons.add(nuCard6)
        var nuCard7 = findViewById<ImageButton>(id.card7); daImgButtons.add(nuCard7)
        var nuCard8 = findViewById<ImageButton>(id.card8); daImgButtons.add(nuCard8)
        var nuCard9 = findViewById<ImageButton>(id.card9); daImgButtons.add(nuCard9)
        var nuCard10 = findViewById<ImageButton>(id.card10); daImgButtons.add(nuCard10)
        var nuCard11 = findViewById<ImageButton>(id.card11); daImgButtons.add(nuCard11)
        var nuCard12 = findViewById<ImageButton>(id.card12); daImgButtons.add(nuCard12)

        /**/
        var scoreVal = findViewById<TextView>(id.score_value)
        var timeVal = findViewById<TextView>(id.time_value)


        var scoreLabel: String = ("0");




        nuCard1.setBackgroundResource(buttons.get(0).card!!.image); nuCard2.setBackgroundResource(
            buttons.get(1).card!!.image
        )
        nuCard3.setBackgroundResource(buttons.get(2).card!!.image); nuCard4.setBackgroundResource(
            buttons.get(3).card!!.image
        )
        nuCard5.setBackgroundResource(buttons.get(4).card!!.image); nuCard6.setBackgroundResource(
            buttons.get(5).card!!.image
        )
        nuCard7.setBackgroundResource(buttons.get(6).card!!.image); nuCard8.setBackgroundResource(
            buttons.get(7).card!!.image
        )
        nuCard9.setBackgroundResource(buttons.get(8).card!!.image); nuCard10.setBackgroundResource(
            buttons.get(9).card!!.image
        )
        nuCard11.setBackgroundResource(buttons.get(10).card!!.image); nuCard12.setBackgroundResource(
            buttons.get(11).card!!.image
        )

        nuCard1.setOnClickListener {
            funDo(
                nuCard1,
                0
            )
        }; nuCard2.setOnClickListener { funDo(nuCard2, 1) };
        nuCard3.setOnClickListener {
            funDo(
                nuCard3,
                2
            )
        }; nuCard4.setOnClickListener { funDo(nuCard4, 3) };
        nuCard5.setOnClickListener {
            funDo(
                nuCard5,
                4
            )
        }; nuCard6.setOnClickListener { funDo(nuCard6, 5) };
        nuCard7.setOnClickListener {
            funDo(
                nuCard7,
                6
            )
        }; nuCard8.setOnClickListener { funDo(nuCard8, 7) };
        nuCard9.setOnClickListener { funDo(nuCard9, 8) }; nuCard10.setOnClickListener {
            funDo(
                nuCard10,
                9
            )
        };
        nuCard11.setOnClickListener { funDo(nuCard11, 10) }; nuCard12.setOnClickListener {
            funDo(
                nuCard12,
                11
            )
        };


    }

    fun makeDeck() {

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

    }

    private fun doClick(ibs: ImageButton) {
        buttons.get(3).card?.let { it1 ->
            ibs.setBackgroundResource(it1.image)
        }
    }

    fun funDo(ib: ImageButton, idex: Int) {
        // !ib.isSelected();

        if (nca == 3) {
            Toast.makeText(this, "fuckfgssgsdgdsgdoffgsfgdsf", Toast.LENGTH_SHORT).show()
        }

        ib.setSelected(!ib.isSelected())

        var nubu = buttons.get(idex)

        if (!ib.isSelected()) {

            nca++
            // GameButton.getStyleClass().add("ActiveButton")
            if (nca == 1) {
                cardmap.put(1, gameButton.card!!)
                buttonmap.put(1, gameButton)
            } else if (nca == 2) {
                cardmap.put(2, gameButton.card!!)
                buttonmap.put(2, gameButton)
            } else {
                cardmap.put(3, gameButton.card!!)
                buttonmap.put(3, gameButton)
            }




        } else {
            nca--
            if (nca == 1) {
                cardmap.remove(1)
                buttonmap.remove(1)
            } else if (nca == 2) {
                cardmap.remove(2)
                buttonmap.remove(2)
            }

            Toast.makeText(this, "fgdsf", Toast.LENGTH_SHORT).show()

        }




        ib.setSelected(ib.isSelected())

    }
}


        /*

        nuCard4.setBackgroundResource(buttons.get(3).card.image)
        nuCard5.setBackgroundResource(buttons.get(4).card.image)
        nuCard6.setBackgroundResource(buttons.get(5).card.image)
        nuCard7.setBackgroundResource(buttons.get(6).card.image)
        nuCard8.setBackgroundResource(buttons.get(7).card.image)
        nuCard9.setBackgroundResource(buttons.get(8).card.image)
        nuCard10.setBackgroundResource(buttons.get(9).card.image)
        nuCard11.setBackgroundResource(buttons.get(10).card.image)
        nuCard12.setBackgroundResource(buttons.get(11).card.image)
*/
        /*
        // nuCard1.setOnClickListener { mechanics(nuCard1) }
        // nuCard2.setOnClickListener { mechanics(nuCard2) }
        nuCard3.setOnClickListener { mechanics(nuCard3) }
        nuCard4.setOnClickListener { mechanics(nuCard4) }
        nuCard5.setOnClickListener { mechanics(nuCard5) }
        nuCard6.setOnClickListener { mechanics(nuCard6) }
        nuCard7.setOnClickListener { mechanics(nuCard7) }
        nuCard8.setOnClickListener { mechanics(nuCard8) }
        nuCard9.setOnClickListener { mechanics(nuCard9) }
        nuCard10.setOnClickListener { mechanics(nuCard10) }
        nuCard11.setOnClickListener { mechanics(nuCard11) }
        nuCard12.setOnClickListener { Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show() }

    }
*/
        /*
    fun mechanics(imbb: ImageButton) {
        for (GameButton in buttons) {

            imbb.setBackgroundResource(GameButton.card.image)

            if (GameButton.active == true) {
                GameButton.active = false;
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
                GameButton.active = true;
                nca++
                // GameButton.getStyleClass().add("ActiveButton")
                if (nca == 1) {
                    cardmap.put(1, GameButton.card)
                    buttonmap.put(1, GameButton)
                } else if (nca == 2) {
                    cardmap.put(2, GameButton.card)
                    buttonmap.put(2, GameButton)
                } else {
                    cardmap.put(3, GameButton.card)
                    buttonmap.put(3, GameButton)
                }
            }

            if (nca == 3) {
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

                /*
            buttons.get(1).getStyleClass().remove("ActiveButton"); buttons.get(2)
                .getStyleClass().remove("ActiveButton"); buttons.get(3).getStyleClass()
                .remove("ActiveButton");
                */

                cardmap.clear(); buttons.clear();


            }
        }
    }
*/


            /*
        var nuB1 = buttons.get(0).card?.let { GBnu2(it, nuCard1) }
        var nuB2 = buttons.get(1).card?.let { GBnu2(it, nuCard2) }
        var nuB3 = buttons.get(2).card?.let { GBnu2(it, nuCard3) }
        var nuB4 = buttons.get(3).card?.let { GBnu2(it, nuCard4) }
        var nuB5 = buttons.get(4).card?.let { GBnu2(it, nuCard5) }
        var nuB6 = buttons.get(5).card?.let { GBnu2(it, nuCard6) }
        var nuB7 = buttons.get(6).card?.let { GBnu2(it, nuCard7) }
        var nuB8 = buttons.get(7).card?.let { GBnu2(it, nuCard8) }
        var nuB9 = buttons.get(8).card?.let { GBnu2(it, nuCard9) }
        var nuB10 = buttons.get(9).card?.let { GBnu2(it, nuCard10) }
        var nuB11 = buttons.get(10).card?.let { GBnu2(it, nuCard11) }
        var nuB12 = buttons.get(11).card?.let { GBnu2(it, nuCard12) }

        if (nuB1 != null) {
            nuB1.imTwo.setOnClickListener(nuB1.)
        }

     */




    /*
    fun makeButtons() {
        makeDeck()



        for (ImageButton in daImgButtons) {
            ImageButton.setBackgroundResource()
        }

        nuCard1.setBackgroundResource()

    }

    private fun onCardClicked(iimmgg: ImageButton) {
        val clickedCard = (iimmgg as ImageButton).card

        // Toggle the selection state
        view.toggleSelection()

        // Check for a valid set
        if (isSetSelected()) {
            // Handle a valid set
            handleSetSelection()
        }
    }
*/






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
