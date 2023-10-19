package coleccion.android

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

class NuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board_layout)

        var nuCard1 = findViewById<ImageView>(R.id.card1)

        nuCard1.setOnClickListener {
            finish()
        }

    }
}