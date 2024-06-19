package coleccion.android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.ComponentActivity

class Settings : ComponentActivity() {

    private lateinit var spinning : Spinner
    var bgChosen : ImageView? = null
    var backgrounds : Array<String> = emptyArray()
    private var return2home : ImageButton? = null
    private lateinit var spinning2 : Spinner
    var timeopts : Array<Int> = emptyArray()
    var bgSavings : String = "" 
    var gameTime2 : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_layout)

        backgrounds = arrayOf("Aurora", "Boston", "Space", "Sunset", "Mountains", "Forest", "Coast", "Starry Night", "River Scene", "Ukraine")
        timeopts = arrayOf(30, 60, 90, 120, 150, 180, 210, 240, 270, 300)

        spinning = findViewById(R.id.select_bg) ;       bgChosen = findViewById(R.id.bg_selected)
        spinning2 = findViewById(R.id.select_datime);   return2home = findViewById(R.id.returns)

        val adapting = ArrayAdapter(this, R.layout.spinner_item, backgrounds)
        adapting.setDropDownViewResource(R.layout.spinner_item)
        spinning.adapter = adapting

        val adapting2 = ArrayAdapter(this, R.layout.spinner_item, timeopts)
        adapting2.setDropDownViewResource(R.layout.spinner_item)
        spinning2.adapter = adapting2

        spinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                bgSavings = backgrounds[position]
                AllDatas.boardBGinfo = bgSavings
                when (position) {
                    0 -> { bgChosen?.setImageResource(R.drawable.aurora_over_canada_2016) ;                 AllDatas.boardBGdrawable = R.drawable.aurora_over_canada_2016 }
                    1 -> { bgChosen?.setImageResource(R.drawable.boston_financial_district_skyline) ;       AllDatas.boardBGdrawable = R.drawable.boston_financial_district_skyline }
                    2 -> { bgChosen?.setImageResource(R.drawable.dark_clouds_of_rho_ophiuchus) ;            AllDatas.boardBGdrawable = R.drawable.dark_clouds_of_rho_ophiuchus }
                    3 -> { bgChosen?.setImageResource(R.drawable.sunset_with_birds) ;                       AllDatas.boardBGdrawable = R.drawable.sunset_with_birds }
                    4 -> { bgChosen?.setImageResource(R.drawable.train_mountains_winter) ;                  AllDatas.boardBGdrawable = R.drawable.train_mountains_winter }
                    5 -> { bgChosen?.setImageResource(R.drawable.trees_and_mountains_and_clouds_and_sky) ;  AllDatas.boardBGdrawable = R.drawable.trees_and_mountains_and_clouds_and_sky }
                    6 -> { bgChosen?.setImageResource(R.drawable.south_oregon_coast_18499357) ;             AllDatas.boardBGdrawable = R.drawable.south_oregon_coast_18499357 }
                    7 -> { bgChosen?.setImageResource(R.drawable.van_gogh_starry_night) ;                   AllDatas.boardBGdrawable = R.drawable.van_gogh_starry_night }
                    8 -> { bgChosen?.setImageResource(R.drawable.swanscrollart) ;                           AllDatas.boardBGdrawable = R.drawable.swanscrollart }
                    9 -> { bgChosen?.setImageResource(R.drawable.ukrainelandscape2) ;                       AllDatas.boardBGdrawable = R.drawable.ukrainelandscape2 }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        spinning2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                gameTime2 = timeopts[position]
                AllDatas.gameTimeInfo = gameTime2 * 1000
                AllDatas.timeRemaining = (gameTime2 * 1000).toLong()
                AllDatas.gameTimeForm = gameTime2
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        return2home!!.setOnClickListener { returningHome() }
    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}
