package coleccion.android

import android.graphics.drawable.Drawable
import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import java.io.File
import android.content.Intent
import android.os.Handler

object AllDatas {
    var boardBGinfo : String = ""
    var gameTimeInfo : Int = 0
    var gameTimeForm : Int = 0
    var boardBGdrawable : Int = 0
    var gameScoreInfo : Int = 0
    var collectionHighScoring : Int = 0
    var collectionTotalTime : Int = 0
    var timers: CountDownTimer? = null
    var timeRemaining: Long = 0 ;
    var highScores = File("/data/data/coleccion.android/files/coleccionHighScores.txt")
    var csvHighScores = File("/data/data/coleccion.android/files/coleccionHighScores.csv")

    var handler: Handler? = null
    var runnable: Runnable? = null
    var isTimerRunning = true

    fun launchTime() {
        timers = object : CountDownTimer(gameTimeInfo.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeRemaining = millisUntilFinished / 1000
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                timeRemaining = 0
            }
        }
    }

    fun resumeTime() {
        handler?.postDelayed(runnable!!, 1000)
        isTimerRunning = true
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
                }
            }
        }

        // Start the timer
        handler?.postDelayed(runnable as Runnable, 1000)
        isTimerRunning = true
    }

}