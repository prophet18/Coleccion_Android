if (nca == 3) {




fun solves() {

}
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
    */

    cardmap.clear(); buttons.clear();






    /*

        nuCard4.setBackgroundResource(buttons.get(3).card.image)
        nuCard5.setBackgroundResource(buttons.get(4).card.image)
        nuCard6.setBackgroundResource(buttons.get(5).card.image)
        nuCard7.setBackgroundResource(buttons.get(6).card.image)
        nuCard8.setBackgroundResource(buttons.get(7).card.image)
        nuCard9.setBackgroundResource(buttons.get(8).card.image)
        nuCard10.setBackgroundResource(buttons.get(9).card.image)
        nuCard11.setBackgroundResource(buttons.get(10).card.image)
        nuCard12.setBackgroundResource(buttons.get(11).card.image)
*/
        /*
        // nuCard1.setOnClickListener { mechanics(nuCard1) }
        // nuCard2.setOnClickListener { mechanics(nuCard2) }
        nuCard3.setOnClickListener { mechanics(nuCard3) }
        nuCard4.setOnClickListener { mechanics(nuCard4) }
        nuCard5.setOnClickListener { mechanics(nuCard5) }
        nuCard6.setOnClickListener { mechanics(nuCard6) }
        nuCard7.setOnClickListener { mechanics(nuCard7) }
        nuCard8.setOnClickListener { mechanics(nuCard8) }
        nuCard9.setOnClickListener { mechanics(nuCard9) }
        nuCard10.setOnClickListener { mechanics(nuCard10) }
        nuCard11.setOnClickListener { mechanics(nuCard11) }
        nuCard12.setOnClickListener { Toast.makeText(this, "fuckoff", Toast.LENGTH_SHORT).show() }

    }
*/
        /*
    fun mechanics(imbb: ImageButton) {
        for (GameButton in buttons) {

            imbb.setBackgroundResource(GameButton.card.image)

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
                */

                cardmap.clear(); buttons.clear();


            }
        }
    }
*/



 /*
        var nuB1 = buttons.get(0).card?.let { GBnu2(it, nuCard1) }
        var nuB2 = buttons.get(1).card?.let { GBnu2(it, nuCard2) }
        var nuB3 = buttons.get(2).card?.let { GBnu2(it, nuCard3) }
        var nuB4 = buttons.get(3).card?.let { GBnu2(it, nuCard4) }
        var nuB5 = buttons.get(4).card?.let { GBnu2(it, nuCard5) }
        var nuB6 = buttons.get(5).card?.let { GBnu2(it, nuCard6) }
        var nuB7 = buttons.get(6).card?.let { GBnu2(it, nuCard7) }
        var nuB8 = buttons.get(7).card?.let { GBnu2(it, nuCard8) }
        var nuB9 = buttons.get(8).card?.let { GBnu2(it, nuCard9) }
        var nuB10 = buttons.get(9).card?.let { GBnu2(it, nuCard10) }
        var nuB11 = buttons.get(10).card?.let { GBnu2(it, nuCard11) }
        var nuB12 = buttons.get(11).card?.let { GBnu2(it, nuCard12) }

        if (nuB1 != null) {
            nuB1.imTwo.setOnClickListener(nuB1.)
        }

     */




    /*
    fun makeButtons() {
        makeDeck()



        for (ImageButton in daImgButtons) {
            ImageButton.setBackgroundResource()
        }

        nuCard1.setBackgroundResource()

    }

    private fun onCardClicked(iimmgg: ImageButton) {
        val clickedCard = (iimmgg as ImageButton).card

        // Toggle the selection state
        view.toggleSelection()

        // Check for a valid set
        if (isSetSelected()) {
            // Handle a valid set
            handleSetSelection()
        }
    }
*/

if (checkss.matchCheck == true) {
    /*
    score.push(cardmap.get(1)); score.push(cardmap.get(2)); score.push(
        cardmap.get(3)
    )

    buttonmap.get(1)!!.replace(cards.get(uu));
    buttonmap.get(2)!!.replace(cards.get(uu + 1));
    buttonmap.get(3)!!.replace(cards.get(uu + 2));

    uu = uu + 3;
    var scoreLabel = score.scoreFinal();
    // setResult.setText("Correct!");
} else {
    System.out.println("Wrong");
    // setResult.setText("Wrong...");
    // GameButton.getStyleClass().remove("ActiveButton");
    // GameButton.getStyleClass().add("GameButton");
}
nca = 0
cardmap.clear(); buttonmap.clear();
}






<TableRow
            android:gravity="center"
            android:layout_margin="1dp"
            android:padding="1dp"
            android:layout_width="fill_parent">

            <ImageButton
                android:id="@+id/card1"
                android:contentDescription="Card One"

                android:src="@drawable/colecci_n_blue_parallelogram_1"

                />

            <ImageButton
                android:id="@+id/card2"
                android:contentDescription="Card Two"
                android:layout_height="200dp"
                android:layout_width="fill_parent"
                android:src="@drawable/colecci_n_blue_parallelogram_1"

                />

            <ImageButton
                android:id="@+id/card3"
                android:contentDescription="Card Three"
                android:layout_height="200dp"
                android:layout_width="fill_parent"
                android:src="@drawable/colecci_n_blue_parallelogram_1"

                />

            <ImageButton
                android:id="@+id/card4"
                android:contentDescription="Card Four"
                android:layout_height="200dp"
                android:layout_width="fill_parent"
                android:src="@drawable/colecci_n_blue_parallelogram_1"

                 />

        </TableRow>

        <TableRow
            android:gravity="center"
            android:layout_margin="1dp"
            android:padding="1dp">

            <ImageButton
                android:id="@+id/card5"
                android:contentDescription="Card Five"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

            <ImageButton
                android:id="@+id/card6"
                android:contentDescription="Card Six"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

            <ImageButton
                android:id="@+id/card7"
                android:contentDescription="Card Seven"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

            <ImageButton
                android:id="@+id/card8"
                android:contentDescription="Card Eight"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

        </TableRow>

        <TableRow
            android:gravity="center"
            android:layout_margin="1dp"
            android:padding="1dp">

            <ImageButton
                android:id="@+id/card9"
                android:contentDescription="Card Nine"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"

                 />

            <ImageButton
                android:id="@+id/card10"
                android:contentDescription="Card Ten"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

            <ImageButton
                android:id="@+id/card11"
                android:contentDescription="Card Eleven"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

            <ImageButton
                android:id="@+id/card12"
                android:contentDescription="Card Twelve"
                android:layout_width="180dp"
                android:layout_height="60dp"
                android:scaleType="fitXY"
                android:src="@drawable/colecci_n_blue_parallelogram_1"
                
                 />

        </TableRow>
