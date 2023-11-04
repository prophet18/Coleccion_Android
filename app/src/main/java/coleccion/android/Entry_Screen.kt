package coleccion.android

/*
    Similar to Game in original collection - this serves as the entry screen for the game and major buttons functionality.
*/

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity


class Entry_Screen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_screen)



        var ngButton = findViewById<ImageButton>(R.id.new_game_button)
        var hsButton = findViewById<ImageButton>(R.id.high_score_button)
        var setButton = findViewById<ImageButton>(R.id.settings_button)
        var helpButton = findViewById<ImageButton>(R.id.help_button)
        var exitButton = findViewById<Button>(R.id.exit_button)



        ngButton.setOnClickListener {
            val intent1 = Intent(this, Board::class.java)
            startActivity(intent1)
        }
        hsButton.setOnClickListener {
            Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show()
        }
        setButton.setOnClickListener {
            Toast.makeText(this, "moo", Toast.LENGTH_SHORT).show()
        }
        helpButton.setOnClickListener {
            Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
        }
        exitButton.setOnClickListener {
            finish()
        }


    }
}

