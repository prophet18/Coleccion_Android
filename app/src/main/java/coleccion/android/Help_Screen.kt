package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Help_Screen : ComponentActivity() {

    private lateinit var eButto2 : Button
    private lateinit var eButto22 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_screen)

        eButto2 = findViewById(R.id.e_button2)
        eButto22 = findViewById(R.id.e_button22)
        eButto2.setOnClickListener { returningHome() }
        eButto22.setOnClickListener { nextHelp() }
    }
    fun returningHome() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        finish()
        startActivity(intent1)
    }
    fun nextHelp() {
        val intent2 = Intent(this, Help_Screen2::class.java)
        finish()
        startActivity(intent2)
    }
}
