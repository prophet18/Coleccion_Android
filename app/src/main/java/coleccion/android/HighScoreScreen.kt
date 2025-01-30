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
import coleccion.android.R.*
import com.opencsv.CSVReader
import java.io.FileReader
import java.io.IOException

class HighScoreScreen : ComponentActivity() {

    private lateinit var eButto4 : ImageButton
    var fileName = "/data/data/coleccion.android/files/coleccionHighScores.csv"

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.highscore_layout)

        val tableLayout: TableLayout = findViewById(id.highscoren_layout)
        val tableLayout2: TableLayout = findViewById(id.highscoren_layout2)
        eButto4 = findViewById(id.e_button4)
        eButto4.setOnClickListener { returningHome2() }

        try {
            val reader = CSVReader(FileReader(fileName))
            val header = reader.readNext() // Read the header row
            val rows = mutableListOf<Array<String>>()
            val topHead = arrayOf("Top\nScore", "Average\nScore", "Favorite\nBackground")
            // "Game Type\nMost Played"
            // "Cumulative\nGame Time\n(Minutes)"
            // "Number of\nGames Played"

            if (header != null) {
                addHeaderRow(tableLayout, header)
                addHeaderRow(tableLayout2, topHead)
            }

            var record: Array<String>?
            while (reader.readNext().also { record = it } != null) {
                addDataRow(tableLayout, record)
                rows.add(record!!)
            }

            val topRow = calculateStats(rows)
            addDataRow(tableLayout2, topRow)
            reader.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun addHeaderRow(tableLayout: TableLayout, header: Array<String>) {
        val headerRow = TableRow(this)
        for (column in header) {
            val headerTextView = createTextHeader(column)
            headerRow.addView(headerTextView)
        }
        headerRow.gravity = Gravity.CENTER
        headerRow.setBackgroundColor(getColor(color.black))
        tableLayout.addView(headerRow)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun addDataRow(tableLayout: TableLayout, record: Array<String>?) {
        val dataRow = TableRow(this)
        if (record != null) {
            for (cell in record) {
                val dataTextView = createTextView(cell)
                dataRow.addView(dataTextView)
            }
        }
        dataRow.gravity = Gravity.CENTER
        dataRow.setBackgroundColor(getColor(color.black))
        tableLayout.addView(dataRow)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun createTextView(text: String): TextView {
        val typeFont : Typeface = resources.getFont(font.ocraextended)
        val textView = TextView(this)
        textView.text = text
        textView.setPadding(5, 5, 5, 5)
        textView.gravity = Gravity.CENTER
        textView.textSize = 15.toFloat()
        AllDatas.textSizing(this, textView, 0.01)
        textView.setTypeface(typeFont)
        textView.setTextColor(getColor(color.white))
        return textView
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun createTextHeader(text: String): TextView {
        val typeFont : Typeface = resources.getFont(font.ocraextended)
        val textView = TextView(this)
        textView.text = text
        textView.setPadding(5, 5, 5, 5)
        textView.gravity = Gravity.CENTER
        textView.textSize = 18.toFloat()
        AllDatas.textSizing(this, textView, 0.015)
        textView.setTypeface(typeFont)
        textView.setTextColor(getColor(color.yellow))
        return textView
    }

    fun returningHome2() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}

fun calculateStats(rows: List<Array<String>>): Array<String> {
    var highScore = Int.MIN_VALUE
    var totalScore = 0
    var count = 0
    val frequencyMapBackground = mutableMapOf<String, Int>()

    val frequencyMapGType = mutableMapOf<String, Int>()
    var totalGameTime = 0

    for (row in rows) {
        try {
            val score = row[1].toInt()  // Assuming the score is in the second column (index 1)
            totalScore += score
            count++
            if (score > highScore) {
                highScore = score
            }
            frequencyMapBackground[row[3]] = frequencyMapBackground.getOrDefault(row[3], 0) + 1

            frequencyMapGType[row[4]] = frequencyMapGType.getOrDefault(row[4], 0) + 1
            val gameTime = row[2].toInt()
            totalGameTime += gameTime

        } catch (e: NumberFormatException) {
            e.printStackTrace()  // Handle invalid number format if needed
        }
    }

    val averageScore = if (count > 0) totalScore.toDouble() / count else 0.0

    val totalGameTimeMin = if (count > 0) totalGameTime.toDouble() / 60 else 0.0

    val sHighScore = highScore.toString()
    val sAverageScore = String.format("%.2f", averageScore)
    val bgFreq = frequencyMapBackground.maxByOrNull { it.value }!!.key

    val gtypeFreq = frequencyMapGType.maxByOrNull { it.value }!!.key
    val stotalGameTimeMin = totalGameTimeMin.toString()
    val scount = count.toString()

    return arrayOf(sHighScore, sAverageScore, bgFreq)
}
