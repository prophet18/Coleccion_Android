package coleccion.android

import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object AllDatas {

    var boardBGinfo : String = ""
    var gameTimeInfo : Int = 30000
    var gameTimeForm : Int = 0
    var boardBGdrawable : Int = 0
    var gameScoreInfo : Int = 0
    var collectionHighScoring : Int = 0
    var collectionTotalTime : Int = 0
    var timeRemaining : Long = 30000
    var highScores = File("/data/data/coleccion.android/files/coleccionHighScores.txt")
    var csvHighScores = File("/data/data/coleccion.android/files/coleccionHighScores.csv")
    lateinit var finalTimer : CountDownTimer

    @RequiresApi(Build.VERSION_CODES.O)
    fun CreateFile() {
        val currentDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm")
        val formattedDateTime = currentDateTime.format(formatter)

        try {
            if (highScores.createNewFile() && csvHighScores.createNewFile()) {
                println("Files created ")
                val addHS = BufferedWriter(FileWriter(highScores, true))
                val csvHS = BufferedWriter(FileWriter(csvHighScores, true))

                csvHS.write(formattedDateTime + "," + gameScoreInfo.toString() + "," + gameTimeForm + "," + boardBGinfo)
                csvHS.newLine()
                csvHS.close()

                addHS.write(formattedDateTime + " " + gameScoreInfo + " " + gameTimeForm + " " + boardBGinfo)
                addHS.newLine()
                addHS.close()
            } else {
                println("Files already exists.")
            }
        } catch (e: IOException) {
            println("An error occurred.")
            e.printStackTrace()
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun AddHighScore() {
        val currentDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm")
        val formattedDateTime = currentDateTime.format(formatter)

        try {
            val addHS = BufferedWriter(FileWriter(highScores, true))
            val csvHS = BufferedWriter(FileWriter(csvHighScores, true))

            addHS.write(formattedDateTime + " " + gameScoreInfo + " " + gameTimeForm + " " + boardBGinfo)
            addHS.newLine()
            addHS.close()

            csvHS.write(formattedDateTime + "," + gameScoreInfo.toString() + "," + gameTimeForm + "," + boardBGinfo)
            csvHS.newLine()
            csvHS.close()

            println("Successfully wrote to the file: " + highScores)
        } catch (e: IOException) {
            println("An error occurred.")
            e.printStackTrace()
        }
    }
}
