package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class CardArea : ComponentActivity() {

    var buttons = ArrayList<GameButton>();      var cardmap = HashMap<Int, Card>();      var uu: Int = 13;                              var yy: Int = 0
    var deck = CardStack();                     var cards = ArrayList<Card>();           var score = ScorePile();
    var nca: Int = 0;                           var ii: Int = 0;                         var buttonmap = HashMap<Int, GameButton>()

    var imageButtons = ArrayList<ImageButton>(); var imgsmap = HashMap<Int, ImageButton>();

    private lateinit var scoreValu: TextView; private lateinit var timeValu: TextView ; private lateinit var randButto : Button
    private lateinit var nucOne	: ImageButton ; private lateinit var nucTwo	: ImageButton ; private lateinit var nucThree : ImageButton
    private lateinit var nucFour : ImageButton ; private lateinit var nucFive : ImageButton ; private lateinit var nucSix : ImageButton
    private lateinit var nucSeven : ImageButton ; private lateinit var nucEight : ImageButton ; private lateinit var nucNine : ImageButton
    private lateinit var nucTen	: ImageButton ; private lateinit var nucEleven : ImageButton ; private lateinit var nucTwelve : ImageButton

    var settings = Settings() ; val tt = settings.tim4 ; lateinit var ltlt2 : LinearLayout ; var dabgint4 : Int = settings.ppppint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board_layout)


        Toast.makeText(this, dabgint4.toString(), Toast.LENGTH_SHORT).show()


        ltlt2 = findViewById(R.id.board_layout2)

        when (dabgint4) {
            1 -> { ltlt2.setBackgroundResource(R.drawable.aurora_over_canada_2016) }
            2 -> { ltlt2.setBackgroundResource(R.drawable.boston_financial_district_skyline) }
            3 -> { ltlt2.setBackgroundResource(R.drawable.dark_clouds_of_rho_ophiuchus) }
            4 -> { ltlt2.setBackgroundResource(R.drawable.sunset_with_birds) }
            5 -> { ltlt2.setBackgroundResource(R.drawable.train_mountains_winter) }
            6 -> { ltlt2.setBackgroundResource(R.drawable.trees_and_mountains_and_clouds_and_sky) }
            7 -> { ltlt2.setBackgroundResource(R.drawable.south_oregon_coast_18499357) }


        }

        startTimer()

/*
         ;
        var setstring = settings.timtwo

        var settings = Settings()
        var setstring = settings.timtwo
        tt = setstring!!.toInt()

*/

        nucOne	= findViewById(R.id.card1) ; nucTwo	= findViewById(R.id.card2) ; nucThree = findViewById(R.id.card3)
        nucFour	= findViewById(R.id.card4) ; nucFive = findViewById(R.id.card5) ; nucSix = findViewById(R.id.card6)
        nucSeven	= findViewById(R.id.card7) ; nucEight = findViewById(R.id.card8) ; nucNine = findViewById(R.id.card9)
        nucTen	= findViewById(R.id.card10) ; nucEleven	= findViewById(R.id.card11) ; nucTwelve	= findViewById(R.id.card12)

        scoreValu	= findViewById(R.id.score_value) ; timeValu	= findViewById(R.id.time_value) ; randButto	= findViewById(R.id.random_button)

        imageButtons.add(nucOne) ; imageButtons.add(nucTwo) ; imageButtons.add(nucThree) ; imageButtons.add(nucFour)
        imageButtons.add(nucFive) ; imageButtons.add(nucSix) ; imageButtons.add(nucSeven) ; imageButtons.add(nucEight)
        imageButtons.add(nucNine) ; imageButtons.add(nucTen) ; imageButtons.add(nucEleven) ; imageButtons.add(nucTwelve)

        makeDeck()

        if (uu >= 140) {
            deck = CardStack()
            makeDeck()
            uu = 13
        }

        buttons.get(0).gameImgBtn.setOnClickListener { cardWorks(0) } ; buttons.get(0).gameImgBtn.setImageResource(buttons.get(0).cImg)
        buttons.get(1).gameImgBtn.setOnClickListener { cardWorks(1) } ; buttons.get(1).gameImgBtn.setImageResource(buttons.get(1).cImg)
        buttons.get(2).gameImgBtn.setOnClickListener { cardWorks(2) } ; buttons.get(2).gameImgBtn.setImageResource(buttons.get(2).cImg)
        buttons.get(3).gameImgBtn.setOnClickListener { cardWorks(3) } ; buttons.get(3).gameImgBtn.setImageResource(buttons.get(3).cImg)
        buttons.get(4).gameImgBtn.setOnClickListener { cardWorks(4) } ; buttons.get(4).gameImgBtn.setImageResource(buttons.get(4).cImg)
        buttons.get(5).gameImgBtn.setOnClickListener { cardWorks(5) } ; buttons.get(5).gameImgBtn.setImageResource(buttons.get(5).cImg)
        buttons.get(6).gameImgBtn.setOnClickListener { cardWorks(6) } ; buttons.get(6).gameImgBtn.setImageResource(buttons.get(6).cImg)
        buttons.get(7).gameImgBtn.setOnClickListener { cardWorks(7) } ; buttons.get(7).gameImgBtn.setImageResource(buttons.get(7).cImg)
        buttons.get(8).gameImgBtn.setOnClickListener { cardWorks(8) } ; buttons.get(8).gameImgBtn.setImageResource(buttons.get(8).cImg)
        buttons.get(9).gameImgBtn.setOnClickListener { cardWorks(9) } ; buttons.get(9).gameImgBtn.setImageResource(buttons.get(9).cImg)
        buttons.get(10).gameImgBtn.setOnClickListener { cardWorks(10) } ; buttons.get(10).gameImgBtn.setImageResource(buttons.get(10).cImg)
        buttons.get(11).gameImgBtn.setOnClickListener { cardWorks(11) } ; buttons.get(11).gameImgBtn.setImageResource(buttons.get(11).cImg)

        randButto.setOnClickListener { randomCards() }


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
            gameButton = GameButton(imageButtons.get(ii), cards.get(ii))
            buttons.add(gameButton)
            ii++
        }
    }

    fun cardWorks(wId: Int) {

        var nubu = buttons.get(wId)

        if (nubu.active == false) {
            nca++
            when (nca) {
                1 -> {
                    cardmap.put(1, nubu.card!!)
                    buttonmap.put(1, nubu)
                    imgsmap.put(1, nubu.gameImgBtn)
                    nubu.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                2 -> {
                    cardmap.put(2, nubu.card!!)
                    buttonmap.put(2, nubu)
                    imgsmap.put(2, nubu.gameImgBtn)
                    nubu.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                3 -> {
                    cardmap.put(3, nubu.card!!)
                    buttonmap.put(3, nubu)
                    imgsmap.put(3, nubu.gameImgBtn)

                    if (solves() == true) {
                        score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(cardmap.get(3));
                        scoreValu.setText(score.scoreFinal())


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

                }
            }
            nubu.active == true

        } else {

            when (nca) {
                1 -> {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                    imgsmap.remove(1)
                    nubu.gameImgBtn.setBackgroundColor(0x00000000.toInt())
                    nca--
                }
                2 -> {
                    cardmap.remove(2)
                    buttonmap.remove(2)
                    imgsmap.remove(2)
                    nubu.gameImgBtn.setBackgroundColor(0x00000000.toInt())
                    nca--
                }
            }
            nubu.active == false


        }
        Toast.makeText(this, nubu.active.toString(), Toast.LENGTH_SHORT).show()

    }

    fun solves() : Boolean {
        var hir : Boolean
        var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)
        if (checkss.matchCheck == true) {
            hir = true } else {
            hir = false }
        return hir
    }

    private fun randomCards() {
        var crcr = uu
        for (GameButton in buttons) {
            GameButton.replace(cards.get(crcr));
            GameButton.gameImgBtn.setImageResource(cards.get(crcr).image)
            crcr++ }
        uu = uu + 12
        nca = 0
    }

    fun startTimer() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        var cTimer = object : CountDownTimer(tt.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeValu.setText("Seconds Left: " + (millisUntilFinished / 1000).toString())
            }
            override fun onFinish() {
                startActivity(intent1)
                finish()
            }
        }
        cTimer.start()
    }




}