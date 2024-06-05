package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.media.audiofx.DynamicsProcessing
import android.net.Uri
import android.os.Bundle
import android.transition.Scene
import android.view.TextureView
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView
import androidx.activity.ComponentActivity
import com.google.firebase.annotations.concurrent.Background
import java.io.FileInputStream


class GameOverScreen : ComponentActivity() {

    private lateinit var scoreReport: TextView
    private lateinit var timingReport: TextView
    private lateinit var backToEntry: Button
    lateinit var scoreReport2 : String
    lateinit var timeReport2 : String
    lateinit var dagos2 : VideoView

    @SuppressLint("MissingInflatedId")
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

        scoreReport.setText(scoreReport2)
        timingReport.setText(timeReport2)

        backToEntry.setOnClickListener { returningHome() }
    }

    fun returningHome() {
        val intent1 = Intent(this, Entry_Screen::class.java)
        finish()
        startActivity(intent1)
    }

}
