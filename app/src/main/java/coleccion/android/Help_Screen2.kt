package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Help_Screen2 : ComponentActivity() {

    private lateinit var eButto3 : Button
    private lateinit var eButto33 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_screen2)

        eButto3 = findViewById(R.id.e_button3)
        eButto33 = findViewById(R.id.e_button33)
        eButto3.setOnClickListener { prevHelp() }
        eButto33.setOnClickListener { returningHome() }
    }

    fun prevHelp() {
        val intent2 = Intent(this, Help_Screen::class.java)
        finish()
        startActivity(intent2)
    }

    fun returningHome() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        finish()
        startActivity(intent1)
    }
}
