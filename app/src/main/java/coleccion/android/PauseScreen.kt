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
<<<<<<< Updated upstream
    private lateinit var resButto : ImageButton
    var tService = TimerService()  ;                var isServiceBound : Boolean = false
=======
    private lateinit var eButto2 : Button
    lateinit var timer : GameTimer

    private lateinit var timeValu3 : TextView
>>>>>>> Stashed changes

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pause_layout)

<<<<<<< Updated upstream
=======
        timeValu3 = findViewById(R.id.time_valuing)


        resButto = findViewById(R.id.resume_button)
>>>>>>> Stashed changes
        eButto = findViewById(R.id.e_button)
        resButto = findViewById(R.id.resume_button)

        eButto.setOnClickListener { backToMains() }

        resButto.setOnClickListener { tryTime() }

    }

<<<<<<< Updated upstream
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
=======

>>>>>>> Stashed changes
    fun backToMains() {
        val intent8 = Intent(this, EntryScreen::class.java)
        startActivity(intent8)
        finish()
    }
}


