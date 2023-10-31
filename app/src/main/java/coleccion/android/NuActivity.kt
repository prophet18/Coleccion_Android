package coleccion.android

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity
import coleccion.android.R.*
import java.io.File

class NuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.board_layout)

        val deck = CardStack()
        var cord : Card = deck.peek()

        var ffdraw : Card = cord

        var ddraw : Int = drawable.colecci_n_green_rectangle_e_3



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

        nuCard9.setBackgroundResource(cord.image)
        nuCard10.setBackgroundResource(ddraw)
        nuCard11.setBackgroundResource(drawable.colecci_n_green_rectangle_2)
        nuCard12.setBackgroundResource(ffdraw.img)


        nuCard1.setOnClickListener {
            finish()
        }



    }
}



