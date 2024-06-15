package coleccion.android

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
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileReader
import java.io.IOException
import java.io.InputStreamReader

class HighScoreScreen : ComponentActivity() {

    private lateinit var eButto4 : ImageButton
    var fileName = "/data/data/coleccion.android/files/coleccionHighScores.csv"
    var file = File(fileName)
    var fileInputStream = FileInputStream(file)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.highscore_screen)

        val tableLayout: TableLayout = findViewById(R.id.highscoren_layout)

        val reader2 = BufferedReader(InputStreamReader(fileInputStream))


        eButto4 = findViewById(R.id.e_button4)
        eButto4.setOnClickListener { returningHome2() }

        try {

            FileReader(fileName).use { fileReader ->

                val format = CSVFormat.DEFAULT.withFirstRecordAsHeader()
                val parser = CSVParser(fileReader, format)

                val csvRecords = parser.headerMap

                // Create header row
                val headerRow = TableRow(this)
                for (header in csvRecords.keys) {
                    val headerTextView = createTextHeader(header)
                    headerRow.addView(headerTextView)
                }
                tableLayout.addView(headerRow)

                // Create data rows
                for (record in parser) {
                    val dataRow = TableRow(this)
                    for (header in csvRecords.keys) {
                        val dataTextView = createTextView(header)
                        dataTextView.text = record[header]
                        dataRow.addView(dataTextView)
                    }
                    tableLayout.addView(dataRow)
                }







            }









        } catch (e: IOException) {
            e.printStackTrace()
        }
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
        textView.setTextColor(getColor(android.R.color.white))
        return textView
    }

    fun returningHome2() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }
}




/*
// Open the CSV file from the assets folder
            val inputStream2 = assets.open("/data/data/coleccion.android/files/coleccionHighScores.csv")
            val reader2 = BufferedReader(InputStreamReader(fileInputStream))

            // Read the header line to get column names
            val headerLine2 = reader2.readLine()
            val columnNames2 = headerLine2.split(",")

// Create a table row for the header
            val headerRow2 = TableRow(this)
            for (columnName in columnNames2) {
                val textView2 = createTextView(columnName)
                textView2.setBackgroundColor(getColor(android.R.color.black))
                textView2.setTextColor(getColor(android.R.color.white))
                textView2.textSize = 20.toFloat()
                textView2.setTypeface(typeFont)
                headerRow2.addView(textView2)
            }

  // Read data lines and create table rows
            var line2: String? = reader2.readLine()
            while (line2 != null) {
                val values2 = line2.split(",")
                val dataRow2 = TableRow(this)
                for (value in values2) {
                    val textView = createTextView(value)
                    dataRow2.addView(textView)
                }
                dataRow2.gravity = Gravity.CENTER
                tableLayout.addView(dataRow2)

                line2 = reader2.readLine()
            }

            // Close the reader
            reader2.close()
            fileInputStream.close()


 for (columnName in csvRecords) {
                    val textView2 = createTextHeader(columnName.get(0))
                    val textView3 = createTextHeader(columnName.get(1))
                    val textView4 = createTextHeader(columnName.get(2))
                    val textView5 = createTextHeader(columnName.get(3))
                    headerRow2.addView(textView2) ; headerRow2.addView(textView3)
                    headerRow2.addView(textView4) ; headerRow2.addView(textView5)
                }

                headerRow2.gravity = Gravity.CENTER
                headerRow2.setBackgroundColor(getColor(android.R.color.black))
                tableLayout.addView(headerRow2)
 */