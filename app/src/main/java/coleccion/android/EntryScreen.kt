package coleccion.android

/*
    Similar to Game in original collection - this serves as the entry screen for the game and navigation buttons functionality.
*/

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import coleccion.android.cards.ScorePile
import com.google.gson.Gson

class EntryScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_screen)

        val ngButton = findViewById<ImageButton>(R.id.new_game_button)
        val rgButton = findViewById<ImageButton>(R.id.continue_game_button)
        val hsButton = findViewById<ImageButton>(R.id.high_score_button)
        val setButton = findViewById<ImageButton>(R.id.settings_button)
        val helpButton = findViewById<ImageButton>(R.id.help_button)
        val exitButton = findViewById<ImageButton>(R.id.exit_button)

        ngButton.setOnClickListener {
            AllDatas.scoreTrack.clear()
            val intent1 = Intent(this, CardArea::class.java)
            startActivity(intent1)
            finish()
        }

        rgButton.setOnClickListener {
            loadGameStateFromPrefs()
            AllDatas.timeRemaining = AllDatas.timeLeft
            val intent1 = Intent(this, CardArea::class.java)
            startActivity(intent1)
            finish()
        }

        hsButton.setOnClickListener {
            val intent2 = Intent(this, HighScoreScreen::class.java)
            AllDatas.createFile()
            startActivity(intent2)
            finish()
        }

        setButton.setOnClickListener {
            val intent3 = Intent(this, Settings::class.java)
            startActivity(intent3)
            finish()
        }

        helpButton.setOnClickListener {
            val intent4 = Intent(this, HelpScreens::class.java)
            startActivity(intent4)
            finish()
        }

        exitButton.setOnClickListener {
            finish()
        }
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

