package coleccion.android

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.IBinder
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi

class PauseScreen : ComponentActivity()  {

    private lateinit var eButto : Button
    private lateinit var resButto : ImageButton
    var tService = TimerService()  ;                var isServiceBound : Boolean = false

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pause_layout)

        eButto = findViewById(R.id.e_button)
        resButto = findViewById(R.id.resume_button)

        eButto.setOnClickListener { backToMains() }

        resButto.setOnClickListener { tryTime() }

    }

    fun tryTime() {

        AllDatas.timers = object : CountDownTimer(AllDatas.timeRemaining, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                AllDatas.timeRemaining = millisUntilFinished
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onFinish() {
                finish()
            }
        }
        (AllDatas.timers as CountDownTimer).start()

        finish()
    }
    fun backToMains() {
        val intent8 = Intent(this, Entry_Screen::class.java)
        startActivity(intent8)
        finish()
    }
}


