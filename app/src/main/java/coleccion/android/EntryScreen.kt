package coleccion.android

/*
    Similar to Game in original collection - this serves as the entry screen for the game and major buttons functionality.
*/

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity


class EntryScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_screen)

        val ngButton = findViewById<ImageButton>(R.id.new_game_button)
        val hsButton = findViewById<ImageButton>(R.id.high_score_button)
        val setButton = findViewById<ImageButton>(R.id.settings_button)
        val helpButton = findViewById<ImageButton>(R.id.help_button)
        val exitButton = findViewById<Button>(R.id.exit_button)

        ngButton.setOnClickListener {
            val intent1 = Intent(this, CardArea::class.java)
            startActivity(intent1)
            finish()
        }
        hsButton.setOnClickListener {
            val intent2 = Intent(this, HighScoreScreen::class.java)
            startActivity(intent2)
            finish()
        }
        setButton.setOnClickListener {
            val intent3 = Intent(this, Settings::class.java)
            startActivity(intent3)
            finish()
        }
        helpButton.setOnClickListener {
            val intent4 = Intent(this, HelpScreen::class.java)
            startActivity(intent4)
            finish()
        }
        exitButton.setOnClickListener {
            finish()
        }


    }
}




/*
        for (GameButton in ibuttons) {
            if (cactivity == true) {
                cactivity = false
                nca--
                if (nca == 1) {
                    cardmap.remove(1)
                    buttonmap.remove(1)
                } else if (nca == 2) {
                    cardmap.remove(2)
            }  else {
                cactivity = true
                nca++
                if (nca == 1) {
                    cardmap.put(1, )
                } else if (nca == 2) {
                    cardmap.put(2, ibuttons.get(1)
                } else {
                    cardmap.put(3, buttons.get(crd).card)
                    buttonmap.put(3, buttons.get(crd))
                }
            }

        nuCard1.setImageDrawable()


        // Instatiate ImagBbutton object
        // val buttoning = view as ImageButton
        // Toggle the state of the button
        // buttoning.tag = if (buttoning.tag as Int == 1) 0 else 1

        if (cactivity == true) {
            cactivity = false
            nca--
            if (nca == 1) {
                cardmap.remove(1)
                buttonmap.remove(1)
            } else if (nca == 2) {
                cardmap.remove(2)
                buttonmap.remove(2)
            }
        } else {
            cactivity = true
            nca++
            if (nca == 1) {
                cardmap.put(1, ibuttons.get(0))
            } else if (nca == 2) {
                cardmap.put(2, ibuttons.get(1)
            } else {
                cardmap.put(3, buttons.get(crd).card)
                buttonmap.put(3, buttons.get(crd))
            }
        }


        if (nca == 3) {
            doTheCheck()
        }
    }
    fun doTheCheck() {
        var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)
        if (checkss != null) {
            if (checkss.matchCheck == true) {
                score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(cardmap.get(3))
                buttonmap.get(1)?.replace(cards.get(uu));
                buttonmap.get(2)?.replace(cards.get(uu + 1));
                buttonmap.get(3)?.replace(cards.get(uu + 2));

                uu = uu + 3;
                var scoreLabel = score.scoreFinal();
                // setResult.setText("Correct!");
            } else {
                System.out.println("Wrong");
            }
        }
        nca = 0;
        // scoreKeep.setText(scoreLabel);
        buttonmap.get(1)?.active = false; buttons.get(2)?.active = false; buttons.get(3)?.active = false;


    }


}


 */
