package coleccion.android

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

class NuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board_layout)

        var bulge = R.drawable.colecci_n_blue_parallelogram_2

        var nuCard1 = findViewById<ImageView>(R.id.card1)
        var nuCard2 = findViewById<ImageView>(R.id.card2)
        var nuCard3 = findViewById<ImageView>(R.id.card3)
        var nuCard4 = findViewById<ImageView>(R.id.card4)
        var nuCard5 = findViewById<ImageView>(R.id.card5)
        var nuCard6 = findViewById<ImageView>(R.id.card6)
        var nuCard7 = findViewById<ImageView>(R.id.card7)
        var nuCard8 = findViewById<ImageView>(R.id.card8)
        var nuCard9 = findViewById<ImageView>(R.id.card9)
        var nuCard10 = findViewById<ImageView>(R.id.card10)
        var nuCard11 = findViewById<ImageView>(R.id.card11)
        var nuCard12 = findViewById<ImageView>(R.id.card12)

        nuCard1.setOnClickListener {
            finish()
        }

        nuCard2.setOnClickListener {
            nuCard1.setImageResource(bulge)
        }





    }
}

