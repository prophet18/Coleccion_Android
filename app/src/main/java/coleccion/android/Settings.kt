package coleccion.android

/*
    Settings controls the options available to the player.
    Using Spinners, players can select the background and game duration they desire.
*/

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class Settings : ComponentActivity() {

    lateinit var settingLayout: ConstraintLayout
    private lateinit var bgSpinning : Spinner
    private lateinit var timeSpinning : Spinner
    private lateinit var gtSpinning : Spinner
    var bgChosen : ImageView? = null
    private var return2home : ImageButton? = null
    private lateinit var bSelect: TextView
    private lateinit var tSelect: TextView
    private lateinit var gTimeSelect: TextView
    var backgrounds : Array<String> = emptyArray()
    var timeopts : Array<Int> = emptyArray()
    var bgSavings : String = "" 
    var gameTime2 : Int = 0
    var typeGame : Array<String> = emptyArray()
    var typeGame2 : String = ""

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_screen)

        backgrounds = arrayOf("Aurora", "Boston", "Space", "Sunset", "Mountains", "Forest",
            "Coast", "Starry Night", "River Scene", "Ukraine")
        timeopts = arrayOf(60, 120, 180, 240, 300)
        typeGame = arrayOf("Regular", "Easy", "Hard")

        bgSpinning = findViewById(R.id.select_bg);   bgChosen = findViewById(R.id.bg_selected)
        bSelect = findViewById(R.id.bg_select);      timeSpinning = findViewById(R.id.select_datime)
        tSelect = findViewById(R.id.time2_select);   gtSpinning = findViewById(R.id.select_dagt)
        gTimeSelect = findViewById(R.id.gt2_select); return2home = findViewById(R.id.returns)
        settingLayout = findViewById(R.id.newSettingsLayout)

        val bgAdapting = ArrayAdapter(this, R.layout.spinner_item, backgrounds)
        bgAdapting.setDropDownViewResource(R.layout.spinner_item)
        bgSpinning.adapter = bgAdapting

        val timeAdapting = ArrayAdapter(this, R.layout.spinner_item, timeopts)
        timeAdapting.setDropDownViewResource(R.layout.spinner_item)
        timeSpinning.adapter = timeAdapting

        val gameAdapting = ArrayAdapter(this, R.layout.spinner_item, typeGame)
        gameAdapting.setDropDownViewResource(R.layout.spinner_item)
        gtSpinning.adapter = gameAdapting

        bgSpinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        timeSpinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                gameTime2 = timeopts[position]
                AllDatas.timeRemaining = (gameTime2 * 1000).toLong()
                AllDatas.gameTimeForm = gameTime2
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        gtSpinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                typeGame2 = typeGame[position]
                AllDatas.gameType = typeGame2
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        return2home!!.setOnClickListener { returningHome() }

        // Calculate text size based on the TextView dimensions
        AllDatas.textSizing(this, bSelect, 0.03)
        AllDatas.textSizing(this, tSelect, 0.03)

    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }

}
