package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity

class HelpScreens : ComponentActivity() {

    private lateinit var viewFlip : ViewFlipper

    private lateinit var eButto2 : Button
    private lateinit var eButto22 : Button
    private lateinit var eButto3 : Button
    private lateinit var eButto33 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_screens)

        viewFlip = findViewById(R.id.helpFlipper)

        eButto2 = findViewById(R.id.e_button2)
        eButto22 = findViewById(R.id.e_button22)
        eButto3 = findViewById(R.id.e_button3)
        eButto33 = findViewById(R.id.e_button33)

        eButto2.setOnClickListener { returningHome() }
        eButto33.setOnClickListener { returningHome() }

        eButto22.setOnClickListener { viewFlip.showNext() }
        eButto3.setOnClickListener { viewFlip.showPrevious() }

    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}
