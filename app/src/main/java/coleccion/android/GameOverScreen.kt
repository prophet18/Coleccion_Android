package coleccion.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
<<<<<<< Updated upstream
import com.google.firebase.annotations.concurrent.Background
import java.io.FileInputStream
=======
import com.bumptech.glide.Glide
>>>>>>> Stashed changes


class GameOverScreen : ComponentActivity() {

    private lateinit var scoreReport: TextView
    private lateinit var timingReport: TextView
    private lateinit var backToEntry: Button
<<<<<<< Updated upstream
    lateinit var scoreReport2 : String
    lateinit var timeReport2 : String
    lateinit var dagos2 : VideoView

    @SuppressLint("MissingInflatedId")
=======
    private lateinit var scoreReport2 : String
    private lateinit var timeReport2 : String
    private lateinit var dagos2 : ImageView

>>>>>>> Stashed changes
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over_layout)

        scoreReport = findViewById(R.id.score_value2)
        timingReport = findViewById(R.id.time_value2)
        backToEntry = findViewById(R.id.exit_button2)
        dagos2 = findViewById(R.id.dags1)

        val videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.starfieldsimulation_rotate
        val uri2 = Uri.parse(videoPath1)
        dagos2.setVideoURI(uri2)
        dagos2.start()

        scoreReport2 = AllDatas.gameScoreInfo.toString()
        timeReport2 = AllDatas.gameTimeForm.toString()

        scoreReport.text = scoreReport2
        timingReport.text = timeReport2

        backToEntry.setOnClickListener { returningHome() }         
    }

    private fun returningHome() {
        val intent1 = Intent(this, EntryScreen::class.java)
        startActivity(intent1)
        finish()
        AllDatas.timeRemaining = 30000
    }

}
