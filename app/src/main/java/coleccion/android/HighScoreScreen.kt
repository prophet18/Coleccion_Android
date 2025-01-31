package coleccion.android

/*
    HighScoreScreen is the class which displays the high score layout (highscore_screen).
    The functions contained within the class are responsible for building the TableLayout which displays scores,
    time, and background info.
*/

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.view.Gravity
import android.widget.ImageButton
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import coleccion.android.R.*
import com.opencsv.CSVReader
import java.io.File
import java.io.FileReader
import java.io.IOException

class HighScoreScreen : ComponentActivity() {

    private lateinit var hsExit1 : ImageButton
    private lateinit var hsExit2 : ImageButton
    private lateinit var statsButton : ImageButton
    private lateinit var hsbButton : ImageButton
    private lateinit var dDownload : ImageButton
    private lateinit var dUpload : ImageButton
    private lateinit var viewFlip : ViewFlipper
    val fileName = "/data/data/coleccion.android/files/coleccionHighScores.csv"

    private val openDocumentLauncher =
        registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
            // This callback is invoked after the user picks a file (or cancels)
            if (uri != null) { replaceInternalCsvWithDownloaded(uri) }
        }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.high_score_more)

        val tableLayout: TableLayout = findViewById(id.highscoren_layout)
        val tableLayout2: TableLayout = findViewById(id.highscoren_layout2)
        val tableLayout3: TableLayout = findViewById(id.highscoren_layout3)

        hsExit1 = findViewById(id.e_button4)
        hsExit1.setOnClickListener { returningHome2() }
        hsExit2 = findViewById(id.e_button6)
        hsExit2.setOnClickListener { returningHome2() }

        statsButton = findViewById(id.statsnmore)
        statsButton.setOnClickListener { viewFlip.showNext() }
        hsbButton = findViewById(id.hsback)
        hsbButton.setOnClickListener { viewFlip.showPrevious() }

        dDownload = findViewById(id.dataDownload)
        dDownload.setOnClickListener { exportData() }
        dUpload = findViewById(id.dataUpload)
        dUpload.setOnClickListener { openFilePicker() }

        try {
            val reader = CSVReader(FileReader(fileName))
            val header = reader.readNext() // Read the header row
            val rows = mutableListOf<Array<String>>()
            val topHead = arrayOf("Top\nScore", "Average\nScore", "Favorite\nBackground")
            val bottomHead = arrayOf("Number of\nGames Played", "Cumulative\nGame Time\n(Minutes)",
                "Game Type\nMost Played")

            if (header != null) {
                addHeaderRow(tableLayout, header)
                addHeaderRow(tableLayout2, topHead)
                addHeaderRow(tableLayout3, bottomHead)
            }

            var record: Array<String>?
            while (reader.readNext().also { record = it } != null) {
                addDataRow(tableLayout, record)
                rows.add(record!!)
            }

            val topRow = calculateStats1(rows)
            addDataRow(tableLayout2, topRow)

            val bottomRow = calculateStats2(rows)
            addDataRow(tableLayout3, bottomRow)

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

    fun calculateStats1(rows: List<Array<String>>): Array<String> {
        var highScore = Int.MIN_VALUE
        var totalScore = 0
        var count = 0
        val frequencyMapBackground = mutableMapOf<String, Int>()

        for (row in rows) {
            try {
                val score = row[1].toInt()  // Assuming the score is in the second column (index 1)
                totalScore += score
                count++
                if (score > highScore) {
                    highScore = score
                }
                frequencyMapBackground[row[3]] = frequencyMapBackground.getOrDefault(row[3], 0) + 1

            } catch (e: NumberFormatException) {
                e.printStackTrace()  // Handle invalid number format if needed
            }
        }

        val averageScore = if (count > 0) totalScore.toDouble() / count else 0.0
        val sHighScore = highScore.toString()
        val sAverageScore = String.format("%.2f", averageScore)
        val bgFreq = frequencyMapBackground.maxByOrNull { it.value }!!.key

        return arrayOf(sHighScore, sAverageScore, bgFreq)
    }

    fun calculateStats2(rows: List<Array<String>>): Array<String> {
        var count = 0
        val frequencyMapGType = mutableMapOf<String, Int>()
        var totalGameTime = 0

        for (row in rows) {
            try {
                count++
                frequencyMapGType[row[4]] = frequencyMapGType.getOrDefault(row[4], 0) + 1
                val gameTime = row[2].toInt()
                totalGameTime += gameTime

            } catch (e: NumberFormatException) {
                e.printStackTrace()  // Handle invalid number format if needed
            }
        }

        val totalGameTimeMin = if (count > 0) totalGameTime.toDouble() / 60 else 0.0
        val gtypeFreq = frequencyMapGType.maxByOrNull { it.value }!!.key
        val stotalGameTimeMin = totalGameTimeMin.toString()
        val scount = count.toString()

        return arrayOf(scount, stotalGameTimeMin, gtypeFreq)
    }

    private fun exportData() {
        val internalFile = File(filesDir, "coleccionHighScores.csv")
        val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val file = File(downloadsDir, "coleccion_scores.csv")
        internalFile.copyTo(file, overwrite = true)
    }

    // 2) Launch the file picker allowing only text/csv or any text file
    private fun openFilePicker() {
        openDocumentLauncher.launch(arrayOf("text/csv", "text/plain"))
    }

    private fun replaceInternalCsvWithDownloaded(csvUri: Uri) {
        // 1) Delete the old file if it exists
        val internalFileName = "coleccionHighScores.csv"
        val internalFile = File(filesDir, internalFileName)
        if (internalFile.exists()) {
            val deleted = internalFile.delete()
            if (!deleted) {
                println("No file deletion for you!")
            }
        }

        // 2) Open the downloaded file (from Downloads or elsewhere) and copy it into internal storage
        try {
            contentResolver.openInputStream(csvUri)?.use { inputStream ->
                // Create a new file or overwrite in internal storage
                File(filesDir, internalFileName).outputStream().use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }    // Now you have replaced the old internal CSV with the new one from downloads
        } catch (e: IOException) {
            e.printStackTrace()
            // Handle read/write errors
        }
    }

}


