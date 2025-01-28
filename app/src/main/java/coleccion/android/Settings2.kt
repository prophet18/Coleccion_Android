package coleccion.android

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import coleccion.android.R.*
import coleccion.android.R.id.*
import com.skydoves.powerspinner.SpinnerAnimation
import com.skydoves.powerspinner.SpinnerGravity
import com.skydoves.powerspinner.createPowerSpinnerView

class Settings2 : ComponentActivity() {

    lateinit var settingLayout: ConstraintLayout
    private lateinit var spinning : Spinner
    private lateinit var spinning2 : Spinner
    var bgChosen : ImageView? = null
    private var return2home : ImageButton? = null
    private lateinit var bSelect: TextView
    private lateinit var tSelect: TextView
    var backgrounds : Array<String> = emptyArray()
    var timeopts : Array<Int> = emptyArray()
    var bgSavings : String = ""
    var gameTime2 : Int = 0

    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.sscreen2)

        backgrounds = arrayOf("Aurora", "Boston", "Space", "Sunset", "Mountains", "Forest", "Coast", "Starry Night", "River Scene", "Ukraine")
        timeopts = arrayOf(60, 120, 180, 240, 300)

        spinning = findViewById(pspin1); settingLayout = findViewById(newSettingsLayout2)














        val adapting = ArrayAdapter(this, layout.spinner_item, backgrounds)
        adapting.setDropDownViewResource(layout.spinner_item)
        spinning.adapter = adapting

        val adapting2 = ArrayAdapter(this, layout.spinner_item, timeopts)
        adapting2.setDropDownViewResource(layout.spinner_item)
        spinning2.adapter = adapting2

        spinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                bgSavings = backgrounds[position]
                AllDatas.boardBGinfo = bgSavings
                when (position) {
                    0 -> { bgChosen?.setImageResource(drawable.aurora_over_canada_2016) ;                 AllDatas.boardBGdrawable = drawable.aurora_over_canada_2016 }
                    1 -> { bgChosen?.setImageResource(drawable.boston_financial_district_skyline) ;       AllDatas.boardBGdrawable = drawable.boston_financial_district_skyline }
                    2 -> { bgChosen?.setImageResource(drawable.dark_clouds_of_rho_ophiuchus) ;            AllDatas.boardBGdrawable = drawable.dark_clouds_of_rho_ophiuchus }
                    3 -> { bgChosen?.setImageResource(drawable.sunset_with_birds) ;                       AllDatas.boardBGdrawable = drawable.sunset_with_birds }
                    4 -> { bgChosen?.setImageResource(drawable.train_mountains_winter) ;                  AllDatas.boardBGdrawable = drawable.train_mountains_winter }
                    5 -> { bgChosen?.setImageResource(drawable.trees_and_mountains_and_clouds_and_sky) ;  AllDatas.boardBGdrawable = drawable.trees_and_mountains_and_clouds_and_sky }
                    6 -> { bgChosen?.setImageResource(drawable.south_oregon_coast_18499357) ;             AllDatas.boardBGdrawable = drawable.south_oregon_coast_18499357 }
                    7 -> { bgChosen?.setImageResource(drawable.van_gogh_starry_night) ;                   AllDatas.boardBGdrawable = drawable.van_gogh_starry_night }
                    8 -> { bgChosen?.setImageResource(drawable.swanscrollart) ;                           AllDatas.boardBGdrawable = drawable.swanscrollart }
                    9 -> { bgChosen?.setImageResource(drawable.ukrainelandscape2) ;                       AllDatas.boardBGdrawable = drawable.ukrainelandscape2 }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        spinning2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                gameTime2 = timeopts[position]
                AllDatas.timeRemaining = (gameTime2 * 1000).toLong()
                AllDatas.gameTimeForm = gameTime2
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        return2home!!.setOnClickListener { returningHome() }

        // Calculate text size based on the TextView dimensions
        AllDatas.textSizing(this, bSelect, 0.04)
        AllDatas.textSizing(this, tSelect, 0.04)

    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }

}