package coleccion.android

import android.graphics.drawable.Drawable
import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import java.io.File
import android.content.Intent
import android.os.Handler
import android.widget.TextView
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

    fun CreateFile() {
        try {
            if (highScores!!.createNewFile() && csvHighScores!!.createNewFile()) {
                System.out.println("Files created ")
                val addHS = BufferedWriter(FileWriter(highScores, true))
                val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
                csvHS.write(" Score " + "," + " Date & Time " + "," + " Game Duration " )
                csvHS.newLine()
                csvHS.close()
                addHS.write(" Score " + " " + " Date & Time " + " " + " Game Duration " )
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
        try {
            val addHS = BufferedWriter(FileWriter(highScores, true))
            val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
            val currentDateTime = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm")
            val formattedDateTime = currentDateTime.format(formatter)
            addHS.write(formattedDateTime + " " + gameScoreInfo + " " + gameTimeForm + " " + boardBGinfo)
            addHS.newLine()
            // addHS.write("Total # of collections found: " + AllDatas.collectionHighScoring.toString() + ". Total amount of time playing: " + AllDatas.collectionTotalTime)
            // addHS.newLine()
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