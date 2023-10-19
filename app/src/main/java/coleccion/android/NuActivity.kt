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
        var nuCard2 = findViewById<ImageView>(R.id.card2)

        val dedeck: Deck

        nuCard1.setOnClickListener {
            nuCard2.setImageResource(R.drawable.colecci_n_blue_parallelogram_2)
        // finish()
        }


    }
}