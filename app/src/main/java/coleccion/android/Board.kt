package coleccion.android

/*
    Similar to Board in original collection - all cards, labels, and buttons.
*/

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
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
    var imgsmap = HashMap<Int, ImageButton>();
    var kk: Int = 0
    var scoreString = score.scoreFinal()

    val backing = Card("Blfdue", 1, "Paralleldfogram", "Solfdid", R.drawable.my_button_bg2)


    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)


        makeDeck()
        if(uu >= 140) {
            makeDeck()
            uu = 13
        }

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

        var rButting = findViewById<Button>(id.random_button)
        rButting.setOnClickListener {randomCars()}

        /**/
        var scoreVal = findViewById<TextView>(id.score_value)
        var timeVal = findViewById<TextView>(id.time_value)

        scoreVal.setText(scoreString)


        var scoreLabel: String = ("0");




        nuCard1.setImageResource(buttons.get(0).card!!.image); nuCard2.setImageResource(
            buttons.get(1).card!!.image
        )
        nuCard3.setImageResource(buttons.get(2).card!!.image); nuCard4.setImageResource(
            buttons.get(3).card!!.image
        )
        nuCard5.setImageResource(buttons.get(4).card!!.image); nuCard6.setImageResource(
            buttons.get(5).card!!.image
        )
        nuCard7.setImageResource(buttons.get(6).card!!.image); nuCard8.setImageResource(
            buttons.get(7).card!!.image
        )
        nuCard9.setImageResource(buttons.get(8).card!!.image); nuCard10.setImageResource(
            buttons.get(9).card!!.image
        )
        nuCard11.setImageResource(buttons.get(10).card!!.image); nuCard12.setImageResource(
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
        
        var card: Card
        var gameButton: GameButton

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

    fun funDo(ib: ImageButton, idex: Int) {


        var nubu = buttons.get(idex)

        if (ib.isActivated == false) {
            nca++
            // GameButton.getStyleClass().add("ActiveButton")
            when (nca) {
                1 -> {
                    cardmap.put(1, nubu.card!!)
                    buttonmap.put(1, nubu)
                    imgsmap.put(1, ib)
                    ib.isActivated = true
                    ib.setBackgroundColor(0xff00ff00.toInt())
                }
                2 -> {
                    cardmap.put(2, nubu.card!!)
                    buttonmap.put(2, nubu)
                    imgsmap.put(2, ib)
                    ib.isActivated = true
                    ib.setBackgroundColor(0xff00ff00.toInt())
                }
                3 -> {
                    cardmap.put(3, nubu.card!!)
                    buttonmap.put(3, nubu)
                    imgsmap.put(3, ib)

                    if (solves() == true) {
                        score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(cardmap.get(3))

                        buttonmap.get(1)!!.replace(cards.get(uu));
                        buttonmap.get(2)!!.replace(cards.get(uu + 1));
                        buttonmap.get(3)!!.replace(cards.get(uu + 2));

                        uu = uu + 3;

                        imgsmap.get(1)!!.setImageResource(buttonmap.get(1)!!.card!!.image)
                        imgsmap.get(2)!!.setImageResource(buttonmap.get(2)!!.card!!.image)
                        imgsmap.get(3)!!.setImageResource(buttonmap.get(3)!!.card!!.image)



                    } else {
                        Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show()
                    }
                    imgsmap.get(1)!!.setBackgroundColor(0x00000000.toInt())
                    imgsmap.get(2)!!.setBackgroundColor(0x00000000.toInt())
                    imgsmap.get(3)!!.setBackgroundColor(0x00000000.toInt())
                    nca = 0
                    cardmap.clear(); buttonmap.clear(); imgsmap.clear()
                    ib.isActivated = false

                }
            }

        } else {

            when (nca) {
                1 -> {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                    imgsmap.remove(1)
                    ib.setBackgroundColor(0x00000000.toInt())
                    ib.isActivated = false

                }
                2 -> {
                    cardmap.remove(2)
                    buttonmap.remove(2)
                    imgsmap.remove(2)
                    ib.setBackgroundColor(0x00000000.toInt())
                    ib.isActivated = false
                }
            }
            nca--
        }

    }

    fun solves() : Boolean {
        var hir : Boolean

        var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)

        if (checkss.matchCheck == true) {
            hir = true
        } else {
            hir = false
        }
        return hir
    }

    fun randomCars() {
        var rcrc = uu
        var crcr = uu
        for (ImageButton in daImgButtons) {
            ImageButton.setImageResource(cards.get(rcrc).image)
            rcrc++
        }
        for (GameButton in buttons) {
            GameButton.replace(cards.get(crcr));
            crcr++
        }
        uu = uu + 12
    }



}



/*
    fun mechanics(view: View) {cardArea.mechanics()}
    fun pooty(view: View) {Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show()}
*/


