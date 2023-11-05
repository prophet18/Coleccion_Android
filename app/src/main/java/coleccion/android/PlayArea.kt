package coleccion.android

import android.app.Activity
import android.text.method.Touch
import android.view.MotionEvent
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Motion
import com.google.firebase.events.EventHandler

/*
    Similar to CardArea in original collection - all 12 cards and major workings of game.
*/

class PlayArea {

    var buttons = ArrayList<GameButton>();      var cardmap = HashMap<Int, Card>();      var uu: Int = 13;                              var yy: Int = 0
    val deck = CardStack();                     var cards = ArrayList<Card>();           var score = ScorePile();                        var tt: Int = 0
    var nca: Int = 0;                           var ii: Int = 0;                         var buttonmap = HashMap<Int, GameButton>()

    init {
        var gamebutton: GameButton;
        var scoreLabel: String = ("0");
        var bord = Board()
        var card: Card
        deck.shuffle()

        while (yy < 144) {
            card = deck.peek()
            deck.pop()
            cards.add(card)
            yy++
        }

        while (ii < 12) {
            gamebutton = GameButton((ii + 1), cards.get(ii))
            buttons.add(gamebutton)
            ii++
        }





        fun mechanics() {
            for (GameButton in buttons) {
                if (GameButton.active == true) {
                    GameButton.active = false;
                    // GameButton.getStyleClass().remove("ActiveButton")
                    nca--
                    if (nca == 1) {
                        cardmap.remove(1)
                        buttonmap.remove(1)
                    } else if (nca == 2) {
                        cardmap.remove(2)
                        buttonmap.remove(2)
                    }
                } else {
                    GameButton.active = true;
                    nca++
                    // GameButton.getStyleClass().add("ActiveButton")
                    if (nca == 1) {
                        cardmap.put(1, GameButton.card)
                        buttonmap.put(1, GameButton)
                    } else if (nca == 2) {
                        cardmap.put(2, GameButton.card)
                        buttonmap.put(2, GameButton)
                    } else {
                        cardmap.put(3, GameButton.card)
                        buttonmap.put(3, GameButton)
                    }
                }

                if (nca == 3) {
                    var checkss = CheckMatch(cardmap.get(1)!!, cardmap.get(2)!!, cardmap.get(3)!!)

                    if (checkss != null) {
                        if (checkss.matchCheck == true) {
                            score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(
                                cardmap.get(3)
                            )

                            buttonmap.get(1)?.replace(cards.get(uu));
                            buttonmap.get(2)?.replace(cards.get(uu + 1));
                            buttonmap.get(3)?.replace(cards.get(uu + 2));

                            uu = uu + 3;
                            var scoreLabel = score.scoreFinal();
                            // setResult.setText("Correct!");
                        } else {
                            System.out.println("Wrong");
                            // setResult.setText("Wrong...");
                            // GameButton.getStyleClass().remove("ActiveButton");
                            // GameButton.getStyleClass().add("GameButton");
                        }
                    }
                    nca = 0;
                    // scoreKeep.setText(scoreLabel);
                    buttonmap.get(1)?.active = false; buttons.get(2)?.active =
                        false; buttons.get(3)?.active = false;

                    /*
                    buttons.get(1).getStyleClass().remove("ActiveButton"); buttons.get(2)
                        .getStyleClass().remove("ActiveButton"); buttons.get(3).getStyleClass()
                        .remove("ActiveButton");

                    cardmap.clear(); buttons.clear(); indexmap.clear();
                    check = null;

                     */
                }
            }


        }


    }


};




