package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TableLayout
import android.widget.Toast
import androidx.activity.ComponentActivity



class Settings : ComponentActivity() {

    lateinit var spinning : Spinner ; var bgChosen : ImageView? = null ; lateinit var timingtwo : EditText ; var timtwo : String? = null ;
    var backgrounds : Array<String> = emptyArray() ; var return2home : Button? = null ; var ppint : Int = 0 ; var ppppint : Int = 0

    lateinit var spinning2 : Spinner ; var timeopts : Array<Int> = emptyArray()

    var bgSavings : String = "" ; var gameTime2 : Int = 0



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_layout)



        backgrounds = arrayOf( "Aurora", "Boston", "Space", "Sunset", "Mountains", "Forest", "Coast" )
        timeopts = arrayOf( 30000, 60000, 90000, 120000, 150000, 180000, 210000 )

        spinning = findViewById(R.id.select_bg) ; bgChosen = findViewById(R.id.bg_selected) ; timingtwo = findViewById(R.id.enter_time) ; return2home = findViewById(R.id.returns)
        spinning2 = findViewById(R.id.select_datime)


        val adapting = ArrayAdapter(this, android.R.layout.simple_spinner_item, backgrounds)
        adapting.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinning.adapter = adapting

        val adapting2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, timeopts)
        adapting2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinning2.adapter = adapting2

        spinning.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                bgSavings = backgrounds[position]
                AllDatas.boardBGinfo = bgSavings
                when (position) {
                    0 -> { bgChosen?.setImageResource(R.drawable.aurora_over_canada_2016) ; AllDatas.bgrs9 = R.drawable.aurora_over_canada_2016 }
                    1 -> { bgChosen?.setImageResource(R.drawable.boston_financial_district_skyline) ; AllDatas.bgrs9 = R.drawable.boston_financial_district_skyline }
                    2 -> { bgChosen?.setImageResource(R.drawable.dark_clouds_of_rho_ophiuchus) ; AllDatas.bgrs9 = R.drawable.dark_clouds_of_rho_ophiuchus }
                    3 -> { bgChosen?.setImageResource(R.drawable.sunset_with_birds) ; AllDatas.bgrs9 = R.drawable.sunset_with_birds }
                    4 -> { bgChosen?.setImageResource(R.drawable.train_mountains_winter) ; AllDatas.bgrs9 = R.drawable.train_mountains_winter }
                    5 -> { bgChosen?.setImageResource(R.drawable.trees_and_mountains_and_clouds_and_sky) ; AllDatas.bgrs9 = R.drawable.trees_and_mountains_and_clouds_and_sky }
                    6 -> { bgChosen?.setImageResource(R.drawable.south_oregon_coast_18499357) ; AllDatas.bgrs9 = R.drawable.south_oregon_coast_18499357 }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        spinning2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                gameTime2 = timeopts[position]
                AllDatas.gameTimeInfo = gameTime2

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }


        timtwo = timingtwo.getText().toString()

        ppppint = ppint

        return2home!!.setOnClickListener { returningHome() }


    }



    fun returningHome() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        finish()
        startActivity(intent1)

    }

}
