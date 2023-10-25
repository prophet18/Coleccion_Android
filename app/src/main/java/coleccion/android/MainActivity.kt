package coleccion.android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.Text as Text1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_screen)

        var ngButton = findViewById<ImageButton>(R.id.new_game_button)
        var hsButton = findViewById<ImageButton>(R.id.high_score_button)
        var setButton = findViewById<ImageButton>(R.id.settings_button)
        var helpButton = findViewById<ImageButton>(R.id.help_button)
        var exitButton = findViewById<Button>(R.id.exit_button)



        ngButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
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
            val intent1 = Intent(this, NuActivity::class.java)
            startActivity(intent1)
        }


    }
}

