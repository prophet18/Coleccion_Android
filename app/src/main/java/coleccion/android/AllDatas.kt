package coleccion.android

import android.graphics.drawable.Drawable
import java.io.File

object AllDatas {
    var boardBGinfo : String = ""
    var gameTimeInfo : Int = 0
    var gameTimeForm : Int = 0
    var boardBGdrawable : Int = 0
    var gameScoreInfo : Int = 0
    var collectionHighScoring : Int = 0
    var collectionTotalTime : Int = 0
    lateinit var highScores : File
    lateinit var csvHighScores : File
}