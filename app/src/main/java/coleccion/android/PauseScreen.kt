package coleccion.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi

class PauseScreen : ComponentActivity()  {

    private lateinit var eButto : Button
    private lateinit var resButto : ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pause_layout)

        eButto = findViewById(R.id.e_button)
        resButto = findViewById(R.id.resume_button)

        eButto.setOnClickListener { finish() }

        resButto.setOnClickListener { tryTime() }

    }

    fun tryTime() {
        AllDatas.timers = object : CountDownTimer(AllDatas.timeRemaining, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                AllDatas.timeRemaining = millisUntilFinished
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                AllDatas.timeRemaining = 0
                finish()
            }
        }
        (AllDatas.timers as CountDownTimer).start()

        val intent6 = Intent(this, CardArea::class.java)
        startActivity(intent6)
        finish()
    }
}
