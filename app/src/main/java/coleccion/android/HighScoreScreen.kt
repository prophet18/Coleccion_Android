package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStreamReader


class HighScoreScreen : ComponentActivity() {

    var maxScores: Int = 0
    private lateinit var eButto4 : ImageButton

    var fileName = "/data/data/coleccion.android/files/coleccionHighScores.csv"
    var file = File(fileName)
    var fileInputStream = FileInputStream(file)


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.highscore_screen)

        val tableLayout: TableLayout = findViewById(R.id.highscoren_layout)

        eButto4 = findViewById(R.id.e_button4)
        eButto4.setOnClickListener { returningHome2() }



        try {
            // Open the CSV file from the assets folder
            // val inputStream2 = assets.open("/data/data/coleccion.android/files/coleccionHighScores.csv")
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
                textView2.gravity = android.view.Gravity.CENTER
                textView2.textSize = 20.toFloat()
                headerRow2.addView(textView2)
            }
            headerRow2.gravity = android.view.Gravity.CENTER
            tableLayout.addView(headerRow2)

            // Read data lines and create table rows
            var line2: String? = reader2.readLine()
            while (line2 != null) {
                val values2 = line2.split(",")
                val dataRow2 = TableRow(this)
                for (value in values2) {
                    val textView = createTextView(value)
                    dataRow2.addView(textView)
                }
                dataRow2.gravity = android.view.Gravity.CENTER
                tableLayout.addView(dataRow2)

                line2 = reader2.readLine()
            }

            // Close the reader
            reader2.close()
            fileInputStream.close()

        } catch (e: IOException) {
            e.printStackTrace()
        }


    }

    private fun createTextView(text: String): TextView {
        val textView = TextView(this)
        textView.text = text
        textView.setPadding(10, 10, 10, 10)
        textView.gravity = android.view.Gravity.CENTER
        textView.textSize = 15.toFloat()
        return textView
    }

    fun returningHome2() {
        val intent1 = Intent(this, EntryScreen::class.java)
        finish()
        startActivity(intent1)
    }



/*
    fun readAndFindMax(context: Context, fileName: String): Int? {


        try {
            // Open the file in the assets folder
            val inputStream = context.assets.open(AllDatas.highScores.toString())

            // Create a BufferedReader to read the file
            val reader = BufferedReader(InputStreamReader(inputStream))

            // Read each line from the file
            var line: String? = reader.readLine()
            while (line != null) {
                // Parse the line as an integer
                val value = line.toInt()

                // Update max if it's null or the current value is greater
                if (maxScores == null || value > maxScores) {
                    maxScores = value
                }

                // Read the next line
                line = reader.readLine()
            }

            // Close the reader
            reader.close()

            // Close the input stream
            inputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: NumberFormatException) {
            // Handle the case where a line in the file is not a valid integer
            e.printStackTrace()
        }

        return maxScores
    }
*/

}
