package coleccion.android

/*
    Similar to Game in original collection - this serves as the entry screen for the game and major buttons functionality.
*/

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class EntryScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_screen)

        val ngButton = findViewById<ImageButton>(R.id.new_game_button)
        val hsButton = findViewById<ImageButton>(R.id.high_score_button)
        val setButton = findViewById<ImageButton>(R.id.settings_button)
        val helpButton = findViewById<ImageButton>(R.id.help_button)
        val exitButton = findViewById<ImageButton>(R.id.exit_button)

        ngButton.setOnClickListener {
            val intent1 = Intent(this, CardAreaTwo::class.java)
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
}
