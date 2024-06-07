package coleccion.android

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity

class HelpScreens : ComponentActivity() {

    private lateinit var eButto2 : ImageButton
    private lateinit var eButto22 : ImageButton
    private lateinit var eButto3 : ImageButton
    private lateinit var eButto33 : ImageButton
    private lateinit var viewFlip : ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_screens)

        viewFlip = findViewById(R.id.helpFlipper)

        eButto2 = findViewById(R.id.e_button2)
        eButto22 = findViewById(R.id.e_button22)
        eButto2.setOnClickListener { returningHome() }
        eButto22.setOnClickListener { viewFlip.showNext() }

        eButto3 = findViewById(R.id.e_button3)
        eButto33 = findViewById(R.id.e_button33)
        eButto3.setOnClickListener { viewFlip.showPrevious() }
        eButto33.setOnClickListener { returningHome() }
    }
    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}
