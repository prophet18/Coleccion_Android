package coleccion.android

/*
    HighScoreScreen is the class which displays the high score layout (highscore_screen).
    The functions contained within the class are responsible for building the TableLayout which displays scores,
    time, and background info.
*/

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageButton
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import com.opencsv.CSVReader
import java.io.FileReader
import java.io.IOException

class HighScoreScreen : ComponentActivity() {

    private lateinit var eButto4 : ImageButton
    var fileName = "/data/data/coleccion.android/files/coleccionHighScores.csv"

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.highscore_screen)

        val tableLayout: TableLayout = findViewById(R.id.highscoren_layout)

        eButto4 = findViewById(R.id.e_button4)
        eButto4.setOnClickListener { returningHome2() }

        try {
            val reader = CSVReader(FileReader(fileName))
            val header = reader.readNext() // Read the header row
            if (header != null) {
                addHeaderRow(tableLayout, header)
            }
            var record: Array<String>?
            while (reader.readNext().also { record = it } != null) {
                addDataRow(tableLayout, record)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun addHeaderRow(tableLayout: TableLayout, header: Array<String>) {
        val headerRow = TableRow(this)
        for (column in header) {
            val headerTextView = createTextHeader(column)
            headerRow.addView(headerTextView)
        }
        headerRow.gravity = Gravity.CENTER
        headerRow.setBackgroundColor(getColor(R.color.black))
        tableLayout.addView(headerRow)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun addDataRow(tableLayout: TableLayout, record: Array<String>?) {
        val dataRow = TableRow(this)
        if (record != null) {
            for (cell in record) {
                val dataTextView = createTextView(cell)
                dataRow.addView(dataTextView)
            }
        }
        dataRow.gravity = Gravity.CENTER
        dataRow.setBackgroundColor(getColor(R.color.black))
        tableLayout.addView(dataRow)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createTextView(text: String): TextView {
        val typeFont : Typeface = resources.getFont(R.font.ocraextended)
        val textView = TextView(this)
        textView.text = text
        textView.setPadding(10, 10, 10, 10)
        textView.gravity = Gravity.CENTER
        textView.textSize = 15.toFloat()
        textView.setTypeface(typeFont)
        textView.setTextColor(getColor(R.color.white))
        return textView
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createTextHeader(text: String): TextView {
        val typeFont : Typeface = resources.getFont(R.font.ocraextended)
        val textView = TextView(this)
        textView.text = text
        textView.setPadding(10, 10, 10, 10)
        textView.gravity = Gravity.CENTER
        textView.textSize = 18.toFloat()
        textView.setTypeface(typeFont)
        textView.setTextColor(getColor(R.color.yellow))
        return textView
    }

    fun returningHome2() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}
