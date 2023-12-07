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


class Settings : ComponentActivity(), AdapterView.OnItemSelectedListener {

    lateinit var spinning : Spinner ; var bgChosen : ImageView? = null ; lateinit var timingtwo : EditText ; var timtwo : String? = null ; var timethree : Int = 0
    var backgrounds : Array<String> = emptyArray() ; var return2home : Button? = null ; var dabgint : Int = 0 ; var ppint : Int = 0 ; var ppppint : Int = 0

    val tim4 : Int = 200000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_layout)



        backgrounds = arrayOf( "Aurora", "Boston", "Space", "Sunset", "Mountains", "Forest", "Coast" )

        spinning = findViewById(R.id.select_bg) ; bgChosen = findViewById(R.id.bg_selected) ; timingtwo = findViewById(R.id.enter_time) ; return2home = findViewById(R.id.returns)

        val adapting: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, backgrounds)
        adapting.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinning.setAdapter(adapting)
        spinning.setOnItemSelectedListener(this)

        timtwo = timingtwo.getText().toString()

        ppppint = ppint

        return2home!!.setOnClickListener { returningHome() }


    }


    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        // Toast.makeText(getApplicationContext(), "Selected Background: " + backgrounds[p2] ,Toast.LENGTH_SHORT).show();
        // Toast.makeText(this, p2.toString(), Toast.LENGTH_SHORT).show()
        ppint = p2

        when (p2) {
            0 -> { bgChosen?.setImageResource(R.drawable.aurora_over_canada_2016) ; dabgint = 1 }
            1 -> { bgChosen?.setImageResource(R.drawable.boston_financial_district_skyline) ; dabgint = 2 }
            2 -> { bgChosen?.setImageResource(R.drawable.dark_clouds_of_rho_ophiuchus) ; dabgint = 3 }
            3 -> { bgChosen?.setImageResource(R.drawable.sunset_with_birds) ; dabgint = 4 }
            4 -> { bgChosen?.setImageResource(R.drawable.train_mountains_winter) ; dabgint = 5 }
            5 -> { bgChosen?.setImageResource(R.drawable.trees_and_mountains_and_clouds_and_sky) ; dabgint = 6 }
            6 -> { bgChosen?.setImageResource(R.drawable.south_oregon_coast_18499357) ; dabgint = 7 }
        }

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    fun returningHome() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        finish()
        startActivity(intent1)

    }

}
