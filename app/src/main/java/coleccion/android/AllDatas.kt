package coleccion.android

<<<<<<< Updated upstream
import android.graphics.drawable.Drawable
=======
>>>>>>> Stashed changes
import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import java.io.File
<<<<<<< Updated upstream
import android.content.Intent
import android.os.Handler
import android.widget.TextView
=======
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream


    fun launchTime(launchtimes : Long) {
        timers = object : CountDownTimer(launchtimes, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeRemaining = millisUntilFinished
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                timeRemaining = 0
            }
        }.start()
    }

    fun resumeTime(launchtimes : Long) {
        timers = object : CountDownTimer(launchtimes, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeRemaining = millisUntilFinished
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                timeRemaining = 0
            }
        }.start()
    }

    fun startingTimer() {
        runnable = object : Runnable {
            override fun run() {
                if (isTimerRunning) {
                    // Update your UI or perform tasks here based on the elapsed time
                    // For example, update a TextView with the elapsed time

                    // Increment the elapsed time (assuming you are measuring in milliseconds)
                    timeRemaining += 1000

                    // Repeat the task after a delay (1 second in this case)
                    handler?.postDelayed(this, 1000)
=======
    fun CreateFile() {
        try {
            if (highScores.createNewFile() && csvHighScores.createNewFile()) {
                System.out.println("Files created ")
                val addHS = BufferedWriter(FileWriter(highScores, true))
                val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
                csvHS.write(" Date & Time " + "," + " Score " + "," + " Game Duration " + "," + " Background " )
                csvHS.newLine()
                csvHS.close()
                addHS.write(" Date & Time " + " " + " Score " + " " + " Game Duration " + " " + " Background " )
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
            // addHS.write("Total # of collections found: " + collectionHighScoring.toString() + ". Total amount of time playing: " + collectionTotalTime)
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

    /*
    fun createCountDownTimer() {
        finalTimer = object : CountDownTimer(timeRemaining, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                if (isPaused) {
                    timeRemaining = millisUntilFinished
>>>>>>> Stashed changes
                }
            }
            override fun onFinish() {
            }
        }
    }

    fun start() {
        if (isPaused) {
            isPaused = false
            createCountDownTimer()
            finalTimer.start()
        }
    }

    fun pause() {
        isPaused = true
        finalTimer.cancel()
    }

     */

}