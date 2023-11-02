package coleccion.android

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import coleccion.android.R.*

class Board : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)

        /**/



        val deck = CardStack()
        var cord = deck.getCard()
        var cords = deck.getCard()
        var cordss = deck.getCard()

        var ater1 = deck.getCard()
        var ater2 = deck.getCard()
        var ater3 = deck.getCard()


        var ddraw = drawable.colecci_n_green_rectangle_e_3


        var scoreVal = findViewById<TextView>(id.score_value)
        var timeVal = findViewById<TextView>(id.time_value)

        var nuCard1 = findViewById<ImageButton>(id.card1)
        var nuCard2 = findViewById<ImageButton>(id.card2)
        var nuCard3 = findViewById<ImageButton>(id.card3)
        var nuCard4 = findViewById<ImageButton>(id.card4)
        var nuCard5 = findViewById<ImageButton>(id.card5)
        var nuCard6 = findViewById<ImageButton>(id.card6)
        var nuCard7 = findViewById<ImageButton>(id.card7)
        var nuCard8 = findViewById<ImageButton>(id.card8)
        var nuCard9 = findViewById<ImageButton>(id.card9)
        var nuCard10 = findViewById<ImageButton>(id.card10)
        var nuCard11 = findViewById<ImageButton>(id.card11)
        var nuCard12 = findViewById<ImageButton>(id.card12)




        nuCard3.setBackgroundResource(ater1.image)
        nuCard4.setBackgroundResource(ater2.image)
        nuCard5.setBackgroundResource(ater3.image)

        nuCard6.setBackgroundResource(cord.image)
        nuCard7.setBackgroundResource(cords.image)
        nuCard8.setBackgroundResource(cordss.image)
        // nuCard9.setBackgroundResource(cord.image)
        nuCard10.setBackgroundResource(ddraw)
        nuCard11.setBackgroundResource(drawable.colecci_n_green_rectangle_2)


        nuCard10.setOnClickListener {

            val test6 = CheckMatch(ater1, ater2, ater3)
            val test7 = test6.matchCheck
            val test8 = test7.toString()

            timeVal.setText(test8)

        }

        nuCard11.setOnClickListener {
            finish()
        }

        nuCard12.setOnClickListener {
            val test222 = CheckMatch(cord, cords, cordss)
            val test333 = test222.matchCheck
            val test444 = test333.toString()

            scoreVal.setText(test444)


        }



    }
}



