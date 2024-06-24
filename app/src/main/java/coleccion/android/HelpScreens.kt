package coleccion.android

/*
    HelpScreens is the class which controls the display and navigation of the help pages of the app.
    Using a ViewFlipper, the class switches between the different help screen layouts.
*/

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity

class HelpScreens : ComponentActivity() {

    private lateinit var eButto2 : ImageButton
    private lateinit var eButto22 : ImageButton
    private lateinit var eButto3 : ImageButton
    private lateinit var eButto222 : ImageButton
    private lateinit var eButto32 : ImageButton
    private lateinit var eButto33 : ImageButton
    private lateinit var viewFlip : ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_layout)

        viewFlip = findViewById(R.id.helpFlipper)
        eButto2 = findViewById(R.id.e_button2)
        eButto22 = findViewById(R.id.e_button22)
        eButto3 = findViewById(R.id.e_button3)
        eButto222 = findViewById(R.id.e_button222)
        eButto32 = findViewById(R.id.e_button32)
        eButto33 = findViewById(R.id.e_button33)

        eButto2.setOnClickListener { returningHome() }
        eButto22.setOnClickListener { viewFlip.showNext() }
        eButto3.setOnClickListener { viewFlip.showPrevious() }
        eButto222.setOnClickListener { viewFlip.showNext() }
        eButto32.setOnClickListener { viewFlip.showPrevious() }
        eButto33.setOnClickListener { returningHome() }
    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}
