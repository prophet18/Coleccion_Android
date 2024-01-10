package coleccion.android;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.widget.TextView;

public class TimerService extends Service {

    private final IBinder binder = new LocalBinder();

    public TextView timerTextView;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    private boolean timerRunning;

    public class LocalBinder extends Binder {
        TimerService getService() {
            return TimerService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public void startTimer(long millisInFuture) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        countDownTimer = new CountDownTimer(millisInFuture, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimerText();
            }

            @Override
            public void onFinish() {
                timerRunning = false;
            }
        };

        countDownTimer.start();
        timerRunning = true;
    }

    public void pauseTimer() {
        if (timerRunning) {
            countDownTimer.cancel();
            timerRunning = false;
        }
    }

    public void resumeTimer() {
        if (!timerRunning) {
            startTimer(timeLeftInMillis);
        }
    }

    public boolean isTimerRunning() {
        return timerRunning;
    }

    public long getTimeLeftInMillis() {
        return timeLeftInMillis;
    }

    private void updateTimerText() {
        // Update your timer TextView with the timeLeftInMillis
        long minutes = timeLeftInMillis / 1000 / 60;
        long seconds = timeLeftInMillis / 1000 % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        timerTextView.setText(timeLeftFormatted);
    }
}

