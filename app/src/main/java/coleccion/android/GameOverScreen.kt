package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.request.ImageRequest
import coil.disk.DiskCache

class GameOverScreen : ComponentActivity() {

    private lateinit var scoreReport: TextView
    private lateinit var timingReport: TextView
    private lateinit var backToEntry: ImageButton
    lateinit var scoreReport2 : String
    lateinit var timeReport2 : String
    lateinit var bgView : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over_layout)

        scoreReport = findViewById(R.id.score_value2)
        timingReport = findViewById(R.id.time_value2)
        backToEntry = findViewById(R.id.exit_button2)
        bgView = findViewById(R.id.gifImageView)

        scoreReport2 = AllDatas.gameScoreInfo.toString()
        timeReport2 = AllDatas.gameTimeForm.toString()

        scoreReport.text = scoreReport2
        timingReport.text = timeReport2

        backToEntry.setOnClickListener { returningHome() }

        gifWorkings()
    }

    fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        AllDatas.timeRemaining = 30000
        finish()
        startActivity(intent1)
    }

    fun gifWorkings() {
        val imageLoader = ImageLoader.Builder(this)
            .components {
                add(GifDecoder.Factory())
            }
            .diskCache {
                DiskCache.Builder()
                    .directory(cacheDir.resolve("image_cache"))
                    .maxSizePercent(0.02) // Use 2% of the app's available space
                    .build()
            }
            .build()

        val request = ImageRequest.Builder(this)
            .data(R.drawable.digital_rain) // or use URI/URL to load the gif from internet
            .target(bgView)
            .build()

        imageLoader.enqueue(request)
    }

}
