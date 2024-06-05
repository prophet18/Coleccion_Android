package coleccion.android

import android.os.CountDownTimer

open class GameTimer (millisInFuture : Long, countInterval: Long) {

    private var millisRemaining : Long = millisInFuture
    private var countDownInterval : Long = countInterval
    private var countDownTimer : CountDownTimer? = null
    private var isPaused : Boolean = true

    init {
        createCountDownTimer()
    }

    private fun createCountDownTimer() {
        countDownTimer = object : CountDownTimer(millisRemaining, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                if (!isPaused) {
                    millisRemaining = millisUntilFinished
                    onTimerTick(millisRemaining)
                }
            }

            override fun onFinish() {
                onTimerFinish()
            }
        }
    }

    fun start() {
        if (isPaused) {
            isPaused = false
            createCountDownTimer()
            countDownTimer?.start()
        }
    }

    fun pause() {
        isPaused = true
        countDownTimer?.cancel()
    }

    fun resume() {
        if (isPaused) {
            isPaused = false
            createCountDownTimer()
            countDownTimer?.start()
        }
    }

    open fun onTimerTick(millisUntilFinished: Long) {
        // Override to handle tick updates
    }

    open fun onTimerFinish() {
        // Override to handle timer finish
    }
}