package coleccion.android

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import coleccion.android.Deck

class NuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board_layout)

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

        /*
        lateinit var dedeck: Deck
        dedeck.shuffle()

        var cc1 = dedeck.drawCard()
        */
        var dd2 = Deck()
        dd2.shuffle()
        var cc3 = dd2.drawCard()

        var mm2 = dd2.bS2


        nuCard1.setOnClickListener {
            if (cc3 != null) {
                nuCard3.setImageResource(cc3.image)
            }
        // finish()
        }

        /*
        nuCard2.setOnClickListener {
            if (cc1 != null) {
                nuCard6.setImageResource(cc1.image)
            }
            // finish()
        }
        */

        nuCard4.setOnClickListener {
            Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
            if (cc3 != null) {
                nuCard5.setImageResource(mm2.image)
            }
        }



    }
}