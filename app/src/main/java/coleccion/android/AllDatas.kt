package coleccion.android

import android.graphics.drawable.Drawable
import android.os.Build
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import java.io.File
import android.content.Intent

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

}