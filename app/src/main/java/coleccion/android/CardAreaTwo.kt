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

class CardAreaTwo : ComponentActivity() {

    var nca: Int = 0
    var ii: Int = 0
    var yy: Int = 0
    var uu: Int = 12
    var deck = Deck()
    var cards = ArrayList<Card>()
    var cardMap = HashMap<Int, Card>()
    private val buttonStates = HashMap<Int, Boolean>()
    var buttonMapping = HashMap<Int, GameButton>()
    var imageButtons = HashMap<Int, ImageButton>()
    var imagesMap = HashMap<Int, ImageButton>()
    var buttonMap = HashMap<Int, GameButton>()
    private lateinit var scoreValu: TextView
    private lateinit var timeValu: TextView
    private lateinit var randButto: ImageButton
    private lateinit var nucOne: ImageButton
    private lateinit var nucTwo: ImageButton
    private lateinit var nucThree: ImageButton
    private lateinit var nucFour: ImageButton
    private lateinit var nucFive: ImageButton
    private lateinit var nucSix: ImageButton
    private lateinit var nucSeven: ImageButton
    private lateinit var nucEight: ImageButton
    private lateinit var nucNine: ImageButton
    private lateinit var nucTen: ImageButton
    private lateinit var nucEleven: ImageButton
    private lateinit var nucTwelve: ImageButton
    private lateinit var rButts: ImageButton
    private lateinit var eButts1: ImageButton
    private lateinit var pButts: ImageButton
    private lateinit var viewFlip: ViewFlipper
    private lateinit var eButts2: ImageButton
    lateinit var bgLinking: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play_layout)

        viewFlip = findViewById(R.id.playFlipper); bgLinking = findViewById(R.id.board_layout2)
        bgLinking.setBackgroundResource(AllDatas.boardBGdrawable)

        nucOne = findViewById(R.id.card1); nucTwo = findViewById(R.id.card2); nucThree = findViewById(R.id.card3); pButts = findViewById(R.id.pause_button)
        nucFour = findViewById(R.id.card4); nucFive = findViewById(R.id.card5); nucSix = findViewById(R.id.card6)
        nucSeven = findViewById(R.id.card7); nucEight = findViewById(R.id.card8); nucNine = findViewById(R.id.card9)
        nucTen = findViewById(R.id.card10); nucEleven = findViewById(R.id.card11); nucTwelve = findViewById(R.id.card12)

        imagesMap[0] = nucOne ; imagesMap[1] = nucTwo ; imagesMap[2] = nucThree ; imagesMap[3] = nucFour
        imagesMap[4] = nucFive ; imagesMap[5] = nucSix ; imagesMap[6] = nucSeven ; imagesMap[7] = nucEight
        imagesMap[8] = nucNine ; imagesMap[9] = nucTen ; imagesMap[10] = nucEleven ; imagesMap[11] = nucTwelve

        scoreValu = findViewById(R.id.score_value); timeValu = findViewById(R.id.time_value)
        randButto = findViewById(R.id.random_button) ; rButts = findViewById(R.id.resume_button)
        eButts1 = findViewById(R.id.e_button); eButts2 = findViewById(R.id.e_button2)

        makeDeck()
        createCountDownTimer()
        scoreValu.text = AllDatas.scoreTrack.scoreFinal()

        randButto.setOnClickListener { randomCards() } ; pButts.setOnClickListener { onPaused() } ; rButts.setOnClickListener { onResumed() }
        eButts1.setOnClickListener { returnMenuHome() } ; eButts2.setOnClickListener { returnAndroidHome() }

        buttonMapping[0]!!.gameImgBtn.setOnClickListener { toggleCardState(0) }
        buttonMapping[0]!!.gameImgBtn.setImageResource(buttonMapping[0]!!.cImg)
        buttonMapping[1]!!.gameImgBtn.setOnClickListener { toggleCardState(1) }
        buttonMapping[1]!!.gameImgBtn.setImageResource(buttonMapping[1]!!.cImg)
        buttonMapping[2]!!.gameImgBtn.setOnClickListener { toggleCardState(2) } 
        buttonMapping[2]!!.gameImgBtn.setImageResource(buttonMapping[2]!!.cImg)
        buttonMapping[3]!!.gameImgBtn.setOnClickListener { toggleCardState(3) }  
        buttonMapping[3]!!.gameImgBtn.setImageResource(buttonMapping[3]!!.cImg)
        buttonMapping[4]!!.gameImgBtn.setOnClickListener { toggleCardState(4) } 
        buttonMapping[4]!!.gameImgBtn.setImageResource(buttonMapping[4]!!.cImg)
        buttonMapping[5]!!.gameImgBtn.setOnClickListener { toggleCardState(5) }  
        buttonMapping[5]!!.gameImgBtn.setImageResource(buttonMapping[5]!!.cImg)
        buttonMapping[6]!!.gameImgBtn.setOnClickListener { toggleCardState(6) } 
        buttonMapping[6]!!.gameImgBtn.setImageResource(buttonMapping[6]!!.cImg)
        buttonMapping[7]!!.gameImgBtn.setOnClickListener { toggleCardState(7) }  
        buttonMapping[7]!!.gameImgBtn.setImageResource(buttonMapping[7]!!.cImg)
        buttonMapping[8]!!.gameImgBtn.setOnClickListener { toggleCardState(8) }  
        buttonMapping[8]!!.gameImgBtn.setImageResource(buttonMapping[8]!!.cImg)
        buttonMapping[9]!!.gameImgBtn.setOnClickListener { toggleCardState(9) } 
        buttonMapping[9]!!.gameImgBtn.setImageResource(buttonMapping[9]!!.cImg)
        buttonMapping[10]!!.gameImgBtn.setOnClickListener { toggleCardState(10) }  
        buttonMapping[10]!!.gameImgBtn.setImageResource(buttonMapping[10]!!.cImg)
        buttonMapping[11]!!.gameImgBtn.setOnClickListener { toggleCardState(11) } 
        buttonMapping[11]!!.gameImgBtn.setImageResource(buttonMapping[11]!!.cImg)

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
            gameButton = imagesMap[ii]?.let { GameButton(it, cards[ii]) }!!
            buttonMapping[ii] = gameButton
            buttonStates[ii] = false
            ii++
        }
        ii = 0
        yy = 0
    }
    
    private fun toggleCardState(cardId: Int) {
        // Toggle the state
        val currentState = buttonStates[cardId] ?: false
        val newState = !currentState
        buttonStates[cardId] = newState

        // Update the UI
        updateCardUI(cardId, newState)
    }

    private fun updateCardUI(cardId: Int, isActive: Boolean) {
        val cardButton = buttonMapping[cardId]
        if (isActive) {
            // Change to active state
            nca++
            when (nca) {
                1 -> {
                    cardMap[1] = cardButton?.card!!
                    buttonMap[1] = cardButton
                    imageButtons[1] = cardButton.gameImgBtn
                    cardButton.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                2 -> {
                    cardMap[2] = cardButton?.card!!
                    buttonMap[2] = cardButton
                    imageButtons[2] = cardButton.gameImgBtn
                    cardButton.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                3 -> {
                    cardMap[3] = cardButton?.card!!
                    buttonMap[3] = cardButton
                    imageButtons[3] = cardButton.gameImgBtn

                    if (solves()) {
                        nuDeck()
                        // score.push(cardmap[1]); score.push(cardmap[2]); score.push(cardmap[3])
                        AllDatas.scoreTrack.push(cardMap[1]); AllDatas.scoreTrack.push(cardMap[2]); AllDatas.scoreTrack.push(
                            cardMap[3]
                        )
                        scoreValu.text = AllDatas.scoreTrack.scoreFinal()
                        AllDatas.gameScoreInfo = AllDatas.scoreTrack.scoreTotal()

                        buttonMap[1]!!.replace(cards[uu])
                        buttonMap[2]!!.replace(cards[uu + 1])
                        buttonMap[3]!!.replace(cards[uu + 2])
                        uu += 3
                        imageButtons[1]!!.setImageResource(buttonMap[1]!!.card!!.image)
                        imageButtons[2]!!.setImageResource(buttonMap[2]!!.card!!.image)
                        imageButtons[3]!!.setImageResource(buttonMap[3]!!.card!!.image)
                    } else {
                        Toast.makeText(this, "W R O N G", Toast.LENGTH_SHORT).show()
                    }
                    imageButtons[1]!!.setBackgroundColor(0x00000000)
                    imageButtons[2]!!.setBackgroundColor(0x00000000)
                    imageButtons[3]!!.setBackgroundColor(0x00000000)
                    nca = 0
                    cardMap.clear(); buttonMap.clear(); imageButtons.clear()
                }
            }
        } else {
            // Change to inactive state
            when (nca) {
                1 -> {
                    cardMap.remove(1)
                    buttonMap.remove(1)
                    imagesMap.remove(1)
                    cardButton!!.gameImgBtn.setBackgroundColor(0x00000000)
                    --nca
                }
                2 -> {
                    cardMap.remove(2)
                    buttonMap.remove(2)
                    imagesMap.remove(2)
                    cardButton!!.gameImgBtn.setBackgroundColor(0x00000000)
                    --nca
                }
            }
        }
    }

    private fun solves() : Boolean {
        val checkss = CheckMatch(cardMap[1]!!, cardMap[2]!!, cardMap[3]!!)
        return checkss.matchCheck
    }

    private fun randomCards() {
        nuDeck()
        var crcr = uu
        while (ii < 12) {
            buttonMapping[ii]!!.replace(cards[crcr])
            buttonMapping[ii]!!.gameImgBtn.setImageResource(cards[crcr].image)
            buttonStates[ii] = false
            crcr++
            ii++
        }
        uu += 12
        nca = 0
        ii = 0
    }

    private fun nuDeck() {
        if (uu >= 131) {
            deck = Deck()
            ii = 0 ;  yy = 0
            cards.clear() ; buttonMapping.clear()
            makeDeck()
            uu = 12
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
