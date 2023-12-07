package coleccion.android

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class BoardLink : ComponentActivity() {

    lateinit var ltlt2: LinearLayout

    var settings = Settings();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board_layout)

        ltlt2.findViewById<LinearLayout>(R.id.board_layout2)

        when (settings.dabgint) {
            1 -> { ltlt2.setBackgroundResource(R.drawable.aurora_over_canada_2016) }
            2 -> { ltlt2.setBackgroundResource(R.drawable.boston_financial_district_skyline) }
            3 -> { ltlt2.setBackgroundResource(R.drawable.dark_clouds_of_rho_ophiuchus) }
            4 -> { ltlt2.setBackgroundResource(R.drawable.sunset_with_birds) }
            5 -> { ltlt2.setBackgroundResource(R.drawable.train_mountains_winter) }
            6 -> { ltlt2.setBackgroundResource(R.drawable.trees_and_mountains_and_clouds_and_sky) }
            7 -> { ltlt2.setBackgroundResource(R.drawable.south_oregon_coast_18499357) }


        }
    }
}