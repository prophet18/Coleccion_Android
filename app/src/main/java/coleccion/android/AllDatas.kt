package coleccion.android

import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import coleccion.android.cards.ScorePile
import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object AllDatas {

    var boardBGinfo : String = "Aurora"
    var gameTimeInfo : Int = 30000
    var gameTimeForm : Int = 30
    var boardBGdrawable : Int = R.drawable.aurora_over_canada_2016
    var gameScoreInfo : Int = 0
    var collectionHighScoring : Int = 0
    var collectionTotalTime : Int = 0
    var timeRemaining : Long = 30000
    var highScores = File("/data/data/coleccion.android/files/coleccionHighScores.txt")
    var csvHighScores = File("/data/data/coleccion.android/files/coleccionHighScores.csv")
    lateinit var finalTimer : CountDownTimer

    var scoreTrack = ScorePile()

    fun createFile() {
        val dAndTime = "Date &\nTime" ;     val scoreString = "Score"
        val gDuration = "Game\nDuration" ;  val bgStrins = "Background"
        try {
            if (highScores.createNewFile() && csvHighScores.createNewFile()) {
                println("Files created ")
                val addHS = BufferedWriter(FileWriter(highScores, true))
                val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
                // csvHS.write("$dAndTime,$scoreString,$gDuration,$bgStrins")
                csvHS.write(escapeCsvCell(dAndTime) + "," + escapeCsvCell(scoreString) + "," +
                        escapeCsvCell(gDuration) + "," + escapeCsvCell(bgStrins))
                csvHS.newLine()
                csvHS.close()
                addHS.write("Date &\nTime" + " " + "Score" + " " + "Game\nDuration" + " " + "Background")
                addHS.newLine()
                addHS.close()
            } else {
                println("Files already exist.")
            }
        } catch (e: IOException) {
            println("An error occurred.")
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addHighScore() {
        try {
            val addHS = BufferedWriter(FileWriter(highScores, true))
            val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
            val currentDateTime = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy\nHH:mm")
            val formattedDateTime = currentDateTime.format(formatter)
            addHS.write("$formattedDateTime $gameScoreInfo $gameTimeForm $boardBGinfo")
            addHS.newLine()
            addHS.close()
            // csvHS.write("$formattedDateTime,$gameScoreInfo,$gameTimeForm,$boardBGinfo")
            csvHS.write(escapeCsvCell(formattedDateTime) + "," + escapeCsvCell(gameScoreInfo.toString()) + "," +
                    escapeCsvCell(gameTimeForm.toString()) + "," + escapeCsvCell(boardBGinfo))
            csvHS.newLine()
            csvHS.close()

            println("Successfully wrote to the files: " + highScores)
        } catch (e: IOException) {
            println("An error occurred.")
            e.printStackTrace()
        }
    }

    fun escapeCsvCell(cell: String): String {
        // Escape double quotes by replacing " with ""
        val escapedCell = cell.replace("\"", "\"\"")
        // Enclose the cell content in double quotes if it contains special characters
        return "\"$escapedCell\""
    }
}
