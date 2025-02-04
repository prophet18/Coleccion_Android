package coleccion.android

/*
    CardArea is the backbone of Coleccion - the game board and pause screen are found in this file.
    All of the Game Buttons, Cards, and Game Information appear on the board (play_layout).
    In addition, using a ViewFlipper allows switching between the board and the pause screen.
    CardArea contains all of the major functions comprising gameplay.
*/

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import coleccion.android.cards.Card
import coleccion.android.cards.CheckMatch
import coleccion.android.cards.Deck
import coleccion.android.cards.GameButton
import coleccion.android.cards.ScorePile
import com.google.gson.Gson

class CardArea : ComponentActivity() {

    var nca: Int = 0
    var boardCardCount: Int = 0
    var deckCardCount: Int = 0
    var usedCardCount: Int = 12
    private var remainingMillis: Long = 0
    private var timer2: CountDownTimer? = null
    var deck = Deck()
    var cards = ArrayList<Card>()
    var buttonStates = HashMap<Int, Boolean>()
    var buttonMapping = HashMap<Int, GameButton>()
    var imageButtons = HashMap<Int, ImageButton>()
    var imagesMap = HashMap<Int, ImageButton>()
    var buttonMap = HashMap<Int, GameButton>()
    var cardMap = HashMap<Int, Card>()
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
    private lateinit var eButts2: ImageButton
    private lateinit var hintButt: ImageButton
    lateinit var bgLinking: ConstraintLayout
    private lateinit var viewFlip: ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play_layouts)

        viewFlip = findViewById(R.id.playFlipper)
        bgLinking = findViewById(R.id.board_layout2)
        bgLinking.setBackgroundResource(AllDatas.boardBGdrawable)

        nucOne = findViewById(R.id.card1);      nucTwo = findViewById(R.id.card2);      nucThree = findViewById(R.id.card3)
        nucFour = findViewById(R.id.card4);     nucFive = findViewById(R.id.card5);     nucSix = findViewById(R.id.card6)
        nucSeven = findViewById(R.id.card7);    nucEight = findViewById(R.id.card8);    nucNine = findViewById(R.id.card9)
        nucTen = findViewById(R.id.card10);     nucEleven = findViewById(R.id.card11);  nucTwelve = findViewById(R.id.card12)

        imagesMap[0] = nucOne;      imagesMap[1] = nucTwo;      imagesMap[2] = nucThree;        imagesMap[3] = nucFour
        imagesMap[4] = nucFive;     imagesMap[5] = nucSix;      imagesMap[6] = nucSeven;        imagesMap[7] = nucEight
        imagesMap[8] = nucNine;     imagesMap[9] = nucTen;      imagesMap[10] = nucEleven;      imagesMap[11] = nucTwelve

        scoreValu = findViewById(R.id.score_value);         timeValu = findViewById(R.id.time_value)
        randButto = findViewById(R.id.random_button);       rButts = findViewById(R.id.resume_button)
        eButts1 = findViewById(R.id.e_button);              eButts2 = findViewById(R.id.e_button2)
        pButts = findViewById(R.id.pause_button);           hintButt = findViewById(R.id.hint_button)

        makeDeck()
        createCountDownTimer(AllDatas.timeRemaining)
        scoreValu.text = AllDatas.scoreTrack.scoreFinal()

        randButto.setOnClickListener { randomCards() };     pButts.setOnClickListener { onPaused() }
        rButts.setOnClickListener { onResumed() };          hintButt.setOnClickListener { giveHint(buttonMapping) }
        eButts1.setOnClickListener { returnMenuHome() };    eButts2.setOnClickListener { returnAndroidHome() }

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
        while (deckCardCount < 144) {
            card = deck.peek()
            deck.pop()
            cards.add(card)
            deckCardCount++
        }
        while (boardCardCount < 12) {
            gameButton = imagesMap[boardCardCount]?.let { GameButton(it, cards[boardCardCount]) }!!
            buttonMapping[boardCardCount] = gameButton
            buttonStates[boardCardCount] = false
            boardCardCount++
        }
        boardCardCount = 0
        deckCardCount = 0
    }

    private fun toggleCardState(cardId: Int) {
        // Toggle the state
        val currentState = buttonStates[cardId]
        val newState = !currentState!!
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
                    AllDatas.indexKeep.add(cardId)
                    cardButton.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                2 -> {
                    cardMap[2] = cardButton?.card!!
                    buttonMap[2] = cardButton
                    imageButtons[2] = cardButton.gameImgBtn
                    AllDatas.indexKeep.add(cardId)
                    cardButton.gameImgBtn.setBackgroundColor(0xff00ff00.toInt())
                }
                3 -> {
                    cardMap[3] = cardButton?.card!!
                    buttonMap[3] = cardButton
                    imageButtons[3] = cardButton.gameImgBtn
                    AllDatas.indexKeep.add(cardId)

                    if (solves()) {
                        nuDeck()
                        // score.push(cardmap[1]); score.push(cardmap[2]); score.push(cardmap[3])
                        AllDatas.scoreTrack.push(cardMap[1])
                        AllDatas.scoreTrack.push(cardMap[2])
                        AllDatas.scoreTrack.push(cardMap[3])
                        scoreValu.text = AllDatas.scoreTrack.scoreFinal()
                        AllDatas.gameScoreInfo = AllDatas.scoreTrack.scoreTotal()

                        buttonMap[1]!!.replace(cards[usedCardCount])
                        buttonMap[2]!!.replace(cards[usedCardCount + 1])
                        buttonMap[3]!!.replace(cards[usedCardCount + 2])
                        usedCardCount += 3
                        imageButtons[1]!!.setImageResource(buttonMap[1]!!.card!!.image)
                        imageButtons[2]!!.setImageResource(buttonMap[2]!!.card!!.image)
                        imageButtons[3]!!.setImageResource(buttonMap[3]!!.card!!.image)

                        if (AllDatas.gameType == "Easy") {
                            addTime(3000)
                        }

                    } else {
                        Toast.makeText(this, "W R O N G", Toast.LENGTH_SHORT).show()

                        if (AllDatas.gameType == "Hard") {
                            minusTime(1000)
                        }
                    }
                    resetBoard()
                }
            }
        } else {
            when (nca) {
                1 -> {
                    cardMap.remove(1)
                    buttonMap.remove(1)
                    imagesMap.remove(1)
                    AllDatas.indexKeep.remove(cardId)
                    cardButton!!.gameImgBtn.setBackgroundColor(0x00000000)
                    --nca
                }
                2 -> {
                    cardMap.remove(2)
                    buttonMap.remove(2)
                    imagesMap.remove(2)
                    AllDatas.indexKeep.remove(cardId)
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
        var crcr = usedCardCount
        while (boardCardCount < 12) {
            buttonMapping[boardCardCount]!!.replace(cards[crcr])
            buttonMapping[boardCardCount]!!.gameImgBtn.setImageResource(cards[crcr].image)
            buttonStates[boardCardCount] = false
            crcr++
            boardCardCount++
        }
        usedCardCount += 12
        nca = 0
        boardCardCount = 0
    }

    private fun nuDeck() {
        if (usedCardCount >= 132) {
            deck = Deck()
            boardCardCount = 0 ;  deckCardCount = 0
            cards.clear() ; buttonMapping.clear()
            makeDeck()
            usedCardCount = 12
        }
    }

    private fun createCountDownTimer(time: Long) {
        val intent1 = Intent(this, GameOverScreen::class.java)
        timer2?.cancel()

        // AllDatas.finalTimer.cancel()

        timer2 = object : CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingMillis = millisUntilFinished
                AllDatas.timeLeft = millisUntilFinished
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
        }.start()
        // AllDatas.finalTimer.start()
    }

    private fun addTime(deltaMillis: Long) {
        remainingMillis += deltaMillis
        // Don’t let the time go below 0
        if (remainingMillis < 0) remainingMillis = 0
        // Restart the timer with the new total
        createCountDownTimer(remainingMillis)
    }

    private fun minusTime(deltaMillis: Long) {
        remainingMillis -= deltaMillis
        if (remainingMillis < 0) remainingMillis = 0
        createCountDownTimer(remainingMillis)
    }

    private fun onPaused() {
        // AllDatas.finalTimer.cancel()
        saveGameStateToPrefs()
        timer2?.cancel()
        viewFlip.showNext()
    }

    private fun onResumed() {
        createCountDownTimer(AllDatas.timeLeft)
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

    private fun findPossibleMatches(gameButtons: HashMap<Int, GameButton>):
            List<Triple<Pair<Int, GameButton>, Pair<Int, GameButton>, Pair<Int, GameButton>>> {
        val cards = gameButtons.toList()
        val matches = mutableListOf<Triple<Pair<Int, GameButton>, Pair<Int, GameButton>, Pair<Int, GameButton>>>()

        for (i in cards.indices) {
            for (j in i + 1 until cards.size) {
                for (k in j + 1 until cards.size) {
                    val card1 = cards[i]
                    val card2 = cards[j]
                    val card3 = cards[k]

                    if (CheckMatch(card1.second.card!!, card2.second.card!!, card3.second.card!!).matchCheck) {
                        matches.add(Triple(card1, card2, card3))
                    }
                }
            }
        }
        return matches
    }

    private fun selectMatch(matches: List<Triple<Pair<Int, GameButton>, Pair<Int, GameButton>, Pair<Int, GameButton>>>):
            Triple<Pair<Int, GameButton>, Pair<Int, GameButton>, Pair<Int, GameButton>>? {
        return if (matches.isNotEmpty()) {
            matches.random()
        } else {
            null
        }
    }

    private fun highlightTwoCards(match: Triple<Pair<Int, GameButton>, Pair<Int, GameButton>, Pair<Int, GameButton>>) {
        when (nca) {
            1 -> {
                cardMap.remove(1)
                buttonMap.remove(1)
                imagesMap.remove(1)
            }
            2 -> {
                cardMap.remove(1)
                buttonMap.remove(1)
                imagesMap.remove(1)
                cardMap.remove(2)
                buttonMap.remove(2)
                imagesMap.remove(2)
            }
        }

        val gbHint1 = match.first.second
        val gbHint2 = match.second.second

        cardMap[1] = gbHint1.card!!
        buttonMap[1] = gbHint1
        imageButtons[1] = gbHint1.gameImgBtn
        gbHint1.gameImgBtn.setBackgroundColor(0xffff0000.toInt())
        AllDatas.indexKeep.add(match.first.first)

        cardMap[2] = gbHint2.card!!
        buttonMap[2] = gbHint2
        imageButtons[2] = gbHint2.gameImgBtn
        gbHint2.gameImgBtn.setBackgroundColor(0xffff0000.toInt())
        AllDatas.indexKeep.add(match.second.first)

        nca = 2
    }

    private fun giveHint(gameButtons: HashMap<Int, GameButton>) {
        val matches = findPossibleMatches(gameButtons)
        val selectedMatch = selectMatch(matches)

        selectedMatch?.let {
            highlightTwoCards(it)
        } ?: run {
            println("No matches found.")
            Toast.makeText(this, "No matches found, randomize cards", Toast.LENGTH_SHORT).show()
        }
    }

    private fun resetBoard() {
        imageButtons[1]!!.setBackgroundColor(0x00000000)
        imageButtons[2]!!.setBackgroundColor(0x00000000)
        imageButtons[3]!!.setBackgroundColor(0x00000000)
        nca = 0
        buttonStates[AllDatas.indexKeep[0]] = false
        buttonStates[AllDatas.indexKeep[1]] = false
        buttonStates[AllDatas.indexKeep[2]] = false
        cardMap.clear(); buttonMap.clear(); imageButtons.clear(); AllDatas.indexKeep.clear()
    }

    private fun saveGameStateToPrefs() {
        val prefs = getSharedPreferences("MyGamePrefs", MODE_PRIVATE)
        val gson = Gson()
        val jsonST = gson.toJson(AllDatas.scoreTrack)
        prefs.edit()
            .putLong("TIME_LEFT", AllDatas.timeLeft)
            .putString("BG_INFO", AllDatas.boardBGinfo)
            .putInt("GAME_SCORE", AllDatas.gameScoreInfo)
            .putString("SCORE_PILE", jsonST)
            .putInt("BG_DRAWABLE", AllDatas.boardBGdrawable)
            .apply()
    }

    private fun loadGameStateFromPrefs() {
        val prefs = getSharedPreferences("MyGamePrefs", MODE_PRIVATE)
        val gson = Gson()
        val jsonSTS = prefs.getString("SCORE_PILE", null)
        AllDatas.scoreTrack = gson.fromJson(jsonSTS, ScorePile::class.java)
        AllDatas.timeLeft = prefs.getLong("TIME_LEFT", 30000L)
        AllDatas.boardBGinfo = prefs.getString("BG_INFO", " ").toString()
        AllDatas.gameScoreInfo = prefs.getInt("GAME_SCORE", 0)
        AllDatas.boardBGdrawable = prefs.getInt("BG_DRAWABLE", 0)
    }



}

