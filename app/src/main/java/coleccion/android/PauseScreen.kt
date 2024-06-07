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



    }

}


