package coleccion.android

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import coleccion.android.cards.Card
import coleccion.android.cards.CheckMatch
import coleccion.android.cards.Deck
import coleccion.android.cards.GameButton
import coleccion.android.cards.ScorePile

class CardArea : ComponentActivity() {

    var buttons = ArrayList<GameButton>();          var cardmap = HashMap<Int, Card>();             var uu: Int = 11
    var deck = Deck();                              var cards = ArrayList<Card>();                  var score = ScorePile()
    var nca: Int = 0;                               var ii: Int = 0 ;                               var yy: Int = 0
    var imageButtons = ArrayList<ImageButton>();    var imgsmap = HashMap<Int, ImageButton>() ;     var buttonmap = HashMap<Int, GameButton>()
    private lateinit var scoreValu: TextView;       private lateinit var timeValu: TextView ;       private lateinit var randButto : ImageButton
    private lateinit var nucOne	: ImageButton ;     private lateinit var nucTwo	: ImageButton ;     private lateinit var nucThree : ImageButton
    private lateinit var nucFour : ImageButton ;    private lateinit var nucFive : ImageButton ;    private lateinit var nucSix : ImageButton
    private lateinit var nucSeven : ImageButton ;   private lateinit var nucEight : ImageButton ;   private lateinit var nucNine : ImageButton
    private lateinit var nucTen	: ImageButton ;     private lateinit var nucEleven : ImageButton ;  private lateinit var nucTwelve : ImageButton
    lateinit var bgLinking : LinearLayout ;         private lateinit var rButts : ImageButton ;     private lateinit var eButts1 : ImageButton
    private lateinit var pButts : ImageButton ;     private lateinit var viewFlip : ViewFlipper ;   private lateinit var eButts2 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play_layout)

        viewFlip = findViewById(R.id.playFlipper) ;  bgLinking = findViewById(R.id.board_layout2)
        bgLinking.setBackgroundResource(AllDatas.boardBGdrawable)

        nucOne	= findViewById(R.id.card1) ;        nucTwo	= findViewById(R.id.card2) ;         nucThree = findViewById(R.id.card3);       pButts = findViewById(R.id.pause_button)
        nucFour	= findViewById(R.id.card4) ;        nucFive = findViewById(R.id.card5) ;         nucSix = findViewById(R.id.card6)
        nucSeven = findViewById(R.id.card7) ;       nucEight = findViewById(R.id.card8) ;        nucNine = findViewById(R.id.card9)
        nucTen	= findViewById(R.id.card10) ;       nucEleven = findViewById(R.id.card11) ;      nucTwelve = findViewById(R.id.card12)

        scoreValu = findViewById(R.id.score_value) ; timeValu = findViewById(R.id.time_value) ; randButto	= findViewById(R.id.random_button)
        rButts = findViewById(R.id.resume_button) ;  eButts1 = findViewById(R.id.e_button) ;   eButts2 = findViewById(R.id.e_button2)

        imageButtons.add(nucOne) ;  imageButtons.add(nucTwo) ; imageButtons.add(nucThree) ;  imageButtons.add(nucFour)
        imageButtons.add(nucFive) ; imageButtons.add(nucSix) ; imageButtons.add(nucSeven) ;  imageButtons.add(nucEight)
        imageButtons.add(nucNine) ; imageButtons.add(nucTen) ; imageButtons.add(nucEleven) ; imageButtons.add(nucTwelve)

        makeDeck()
        createCountDownTimer()
        scoreValu.text = AllDatas.scoreTrack.scoreFinal()

        buttons[0].gameImgBtn.setOnClickListener { cardWorks(0) } ; buttons[0].gameImgBtn.setImageResource(
            buttons[0].cImg)
        buttons[1].gameImgBtn.setOnClickListener { cardWorks(1) } ; buttons[1].gameImgBtn.setImageResource(
            buttons[1].cImg)
        buttons[2].gameImgBtn.setOnClickListener { cardWorks(2) } ; buttons[2].gameImgBtn.setImageResource(
            buttons[2].cImg)
        buttons[3].gameImgBtn.setOnClickListener { cardWorks(3) } ; buttons[3].gameImgBtn.setImageResource(
            buttons[3].cImg)
        buttons[4].gameImgBtn.setOnClickListener { cardWorks(4) } ; buttons[4].gameImgBtn.setImageResource(
            buttons[4].cImg)
        buttons[5].gameImgBtn.setOnClickListener { cardWorks(5) } ; buttons[5].gameImgBtn.setImageResource(
            buttons[5].cImg)
        buttons[6].gameImgBtn.setOnClickListener { cardWorks(6) } ; buttons[6].gameImgBtn.setImageResource(
            buttons[6].cImg)
        buttons[7].gameImgBtn.setOnClickListener { cardWorks(7) } ; buttons[7].gameImgBtn.setImageResource(
            buttons[7].cImg)
        buttons[8].gameImgBtn.setOnClickListener { cardWorks(8) } ; buttons[8].gameImgBtn.setImageResource(
            buttons[8].cImg)
        buttons[9].gameImgBtn.setOnClickListener { cardWorks(9) } ; buttons[9].gameImgBtn.setImageResource(
            buttons[9].cImg)
        buttons[10].gameImgBtn.setOnClickListener { cardWorks(10) } ; buttons[10].gameImgBtn.setImageResource(
            buttons[10].cImg)
        buttons[11].gameImgBtn.setOnClickListener { cardWorks(11) } ; buttons[11].gameImgBtn.setImageResource(
            buttons[11].cImg)

        randButto.setOnClickListener { randomCards() } ; pButts.setOnClickListener { onPaused() } ; rButts.setOnClickListener { onResumed() }
        eButts1.setOnClickListener { returnMenuHome() } ; eButts2.setOnClickListener { returnAndroidHome() }
    }

    private fun makeDeck() {
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
            gameButton = GameButton(imageButtons[ii], cards[ii])
            buttons.add(gameButton)
            ii++
        }
    }

    private fun cardWorks(wId: Int) {
        val nubu = buttons[wId]

        if (!nubu.active) {
            nca++
            when (nca) {
                1 -> {
                    cardmap[1] = nubu.card!!
                    buttonmap[1] = nubu
                    imgsmap[1] = nubu.gameImgBtn
                    nubu.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                2 -> {
                    cardmap[2] = nubu.card!!
                    buttonmap[2] = nubu
                    imgsmap[2] = nubu.gameImgBtn
                    nubu.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                3 -> {
                    cardmap[3] = nubu.card!!
                    buttonmap[3] = nubu
                    imgsmap[3] = nubu.gameImgBtn

                    if (solves() == true) {
                        nuDeck()
                        score.push(cardmap[1]); score.push(cardmap[2]); score.push(cardmap[3])
                        AllDatas.scoreTrack.push(cardmap[1]); AllDatas.scoreTrack.push(cardmap[2]); AllDatas.scoreTrack.push(
                            cardmap[3]
                        )
                        scoreValu.text = AllDatas.scoreTrack.scoreFinal()
                        AllDatas.gameScoreInfo = AllDatas.scoreTrack.scoreTotal()

                        buttonmap[1]!!.replace(cards[uu])
                        buttonmap[2]!!.replace(cards[uu + 1])
                        buttonmap[3]!!.replace(cards[uu + 2])
                        uu += 3
                        imgsmap[1]!!.setImageResource(buttonmap[1]!!.card!!.image)
                        imgsmap[2]!!.setImageResource(buttonmap[2]!!.card!!.image)
                        imgsmap[3]!!.setImageResource(buttonmap[3]!!.card!!.image)
                    } else {
                        Toast.makeText(this, "W R O N G", Toast.LENGTH_SHORT).show()
                    }
                    imgsmap[1]!!.setBackgroundColor(0x00000000)
                    imgsmap[2]!!.setBackgroundColor(0x00000000)
                    imgsmap[3]!!.setBackgroundColor(0x00000000)
                    nca = 0
                    cardmap.clear(); buttonmap.clear(); imgsmap.clear()
                }
            }
            nubu.active
        } else {
            when (nca) {
                1 -> {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                    imgsmap.remove(1)
                    nubu.gameImgBtn.setBackgroundColor(0x00000000)
                    nca--
                }
                2 -> {
                    cardmap.remove(2)
                    buttonmap.remove(2)
                    imgsmap.remove(2)
                    nubu.gameImgBtn.setBackgroundColor(0x00000000)
                    nca--
                }
            }
            !nubu.active
        }
    }

    private fun solves() : Boolean {
        val checkss = CheckMatch(cardmap[1]!!, cardmap[2]!!, cardmap[3]!!)
        return checkss.matchCheck
    }

    private fun randomCards() {
        nuDeck()
        var crcr = uu
        for (gameButton in buttons) {
            gameButton.replace(cards[crcr])
            gameButton.gameImgBtn.setImageResource(cards[crcr].image)
            crcr++
        }
        uu += 12
        nca = 0
    }

    private fun nuDeck() {
        if (uu == 143) {
            deck = Deck()
            ii = 0 ;  yy = 0
            cards.clear() ; buttons.clear()
            makeDeck()
            uu = 11
        }
    }

    private fun createCountDownTimer() {
        val intent1 = Intent(this, GameOverScreen::class.java)

        AllDatas.finalTimer = object : CountDownTimer(AllDatas.timeRemaining, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                AllDatas.timeRemaining = millisUntilFinished
                timeValu.text = (millisUntilFinished / 1000).toString()
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                AllDatas.collectionHighScoring += AllDatas.gameScoreInfo
                AllDatas.collectionTotalTime += AllDatas.gameTimeForm
                AllDatas.createFile()
                AllDatas.addHighScore()
                startActivity(intent1)
                finish()
            }
        }
        AllDatas.finalTimer.start()
    }

    private fun onPaused() {
        AllDatas.finalTimer.cancel()
        viewFlip.showNext()
    }

    private fun onResumed() {
        createCountDownTimer()
        viewFlip.showPrevious()
    }

    private fun returnMenuHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }

    private fun returnAndroidHome() {
        finish()
    }
}
