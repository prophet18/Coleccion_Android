package coleccion.android

import java.util.Stack

class Deck {

    var numNum = 0
    val decks = arrayOf<Card>()
    val decking = ArrayDeque<Card>()

    val bP1 = Card("Blue", 1, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_1)
    val bP2 = Card("Blue", 2, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_2)
    val bP3 = Card("Blue", 3, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_3)
    val bPE1 =
        Card("Blue", 1, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_1)
    val bPE2 =
        Card("Blue", 2, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_2)
    val bPE3 =
        Card("Blue", 3, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_3)
    val bPS1 = Card("Blue", 1, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_1)
    val bPS2 = Card("Blue", 2, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_2)
    val bPS3 = Card("Blue", 3, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_3)
    val gP1 = Card("Green", 1, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_1)
    val gP2 = Card("Green", 2, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_2)
    val gP3 = Card("Green", 3, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_3)
    val gPE1 =
        Card("Green", 1, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_1)
    val gPE2 =
        Card("Green", 2, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_2)
    val gPE3 =
        Card("Green", 3, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_3)
    val gPS1 =
        Card("Green", 1, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_1)
    val gPS2 =
        Card("Green", 2, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_2)
    val gPS3 =
        Card("Green", 3, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_3)
    val oP1 =
        Card("Orange", 1, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_1)
    val oP2 =
        Card("Orange", 2, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_2)
    val oP3 =
        Card("Orange", 3, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_3)
    val oPE1 =
        Card("Orange", 1, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_1)
    val oPE2 =
        Card("Orange", 2, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_2)
    val oPE3 =
        Card("Orange", 3, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_3)
    val oPS1 =
        Card("Orange", 1, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_1)
    val oPS2 =
        Card("Orange", 2, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_2)
    val oPS3 =
        Card("Orange", 3, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_3)
    val rP1 = Card("Red", 1, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_1)
    val rP2 = Card("Red", 2, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_2)
    val rP3 = Card("Red", 3, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_3)
    val rPE1 = Card("Red", 1, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_1)
    val rPE2 = Card("Red", 2, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_2)
    val rPE3 = Card("Red", 3, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_3)
    val rPS1 = Card("Red", 1, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_1)
    val rPS2 = Card("Red", 2, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_2)
    val rPS3 = Card("Red", 3, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_3)
    val bR1 = Card("Blue", 1, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_1)
    val bR2 = Card("Blue", 2, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_2)
    val bR3 = Card("Blue", 3, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_3)
    val bRE1 = Card("Blue", 1, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_1)
    val bRE2 = Card("Blue", 2, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_2)
    val bRE3 = Card("Blue", 3, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_3)
    val bRS1 = Card("Blue", 1, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_1)
    val bRS2 = Card("Blue", 2, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_2)
    val bRS3 = Card("Blue", 3, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_3)
    val gR1 = Card("Green", 1, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_1)
    val gR2 = Card("Green", 2, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_2)
    val gR3 = Card("Green", 3, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_3)
    val gRE1 = Card("Green", 1, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_1)
    val gRE2 = Card("Green", 2, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_2)
    val gRE3 = Card("Green", 3, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_3)
    val gRS1 = Card("Green", 1, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_1)
    val gRS2 = Card("Green", 2, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_2)
    val gRS3 = Card("Green", 3, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_3)
    val oR1 = Card("Orange", 1, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_1)
    val oR2 = Card("Orange", 2, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_2)
    val oR3 = Card("Orange", 3, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_3)
    val oRE1 = Card("Orange", 1, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_1)
    val oRE2 = Card("Orange", 2, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_2)
    val oRE3 = Card("Orange", 3, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_3)
    val oRS1 = Card("Orange", 1, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_1)
    val oRS2 = Card("Orange", 2, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_2)
    val oRS3 = Card("Orange", 3, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_3)
    val rR1 = Card("Red", 1, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_1)
    val rR2 = Card("Red", 2, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_2)
    val rR3 = Card("Red", 3, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_3)
    val rRE1 = Card("Red", 1, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_1)
    val rRE2 = Card("Red", 2, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_2)
    val rRE3 = Card("Red", 3, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_3)
    val rRS1 = Card("Red", 1, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_1)
    val rRS2 = Card("Red", 2, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_2)
    val rRS3 = Card("Red", 3, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_3)
    val bS1 = Card("Blue", 1, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_1)
    val bS2 = Card("Blue", 2, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_2)
    val bS3 = Card("Blue", 3, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_3)
    val bSE1 = Card("Blue", 1, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_1)
    val bSE2 = Card("Blue", 2, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_2)
    val bSE3 = Card("Blue", 3, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_3)
    val bSS1 = Card("Blue", 1, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_1)
    val bSS2 = Card("Blue", 2, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_2)
    val bSS3 = Card("Blue", 3, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_3)
    val gS1 = Card("Green", 1, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_1)
    val gS2 = Card("Green", 2, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_2)
    val gS3 = Card("Green", 3, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_3)
    val gSE1 = Card("Green", 1, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_1)
    val gSE2 = Card("Green", 2, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_2)
    val gSE3 = Card("Green", 3, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_3)
    val gSS1 = Card("Green", 1, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_1)
    val gSS2 = Card("Green", 2, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_2)
    val gSS3 = Card("Green", 3, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_3)
    val oS1 = Card("Orange", 1, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_1)
    val oS2 = Card("Orange", 2, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_2)
    val oS3 = Card("Orange", 3, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_3)
    val oSE1 = Card("Orange", 1, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_1)
    val oSE2 = Card("Orange", 2, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_2)
    val oSE3 = Card("Orange", 3, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_3)
    val oSS1 = Card("Orange", 1, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_1)
    val oSS2 = Card("Orange", 2, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_2)
    val oSS3 = Card("Orange", 3, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_3)
    val rS1 = Card("Red", 1, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_1)
    val rS2 = Card("Red", 2, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_2)
    val rS3 = Card("Red", 3, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_3)
    val rSE1 = Card("Red", 1, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_1)
    val rSE2 = Card("Red", 2, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_2)
    val rSE3 = Card("Red", 3, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_3)
    val rSS1 = Card("Red", 1, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_1)
    val rSS2 = Card("Red", 2, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_2)
    val rSS3 = Card("Red", 3, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_3)
    val bT1 = Card("Blue", 1, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_1)
    val bT2 = Card("Blue", 2, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_2)
    val bT3 = Card("Blue", 3, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_3)
    val bTE1 = Card("Blue", 1, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_1)
    val bTE2 = Card("Blue", 2, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_2)
    val bTE3 = Card("Blue", 3, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_3)
    val bTS1 = Card("Blue", 1, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_1)
    val bTS2 = Card("Blue", 2, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_2)
    val bTS3 = Card("Blue", 3, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_3)
    val gT1 = Card("Green", 1, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_1)
    val gT2 = Card("Green", 2, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_2)
    val gT3 = Card("Green", 3, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_3)
    val gTE1 = Card("Green", 1, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_1)
    val gTE2 = Card("Green", 2, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_2)
    val gTE3 = Card("Green", 3, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_3)
    val gTS1 = Card("Green", 1, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_1)
    val gTS2 = Card("Green", 2, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_2)
    val gTS3 = Card("Green", 3, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_3)
    val oT1 = Card("Orange", 1, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_1)
    val oT2 = Card("Orange", 2, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_2)
    val oT3 = Card("Orange", 3, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_3)
    val oTE1 = Card("Orange", 1, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_1)
    val oTE2 = Card("Orange", 2, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_2)
    val oTE3 = Card("Orange", 3, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_3)
    val oTS1 = Card("Orange", 1, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_1)
    val oTS2 = Card("Orange", 2, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_2)
    val oTS3 = Card("Orange", 3, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_3)
    val rT1 = Card("Red", 1, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_1)
    val rT2 = Card("Red", 2, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_2)
    val rT3 = Card("Red", 3, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_3)
    val rTE1 = Card("Red", 1, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_1)
    val rTE2 = Card("Red", 2, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_2)
    val rTE3 = Card("Red", 3, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_3)
    val rTS1 = Card("Red", 1, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_1)
    val rTS2 = Card("Red", 2, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_2)
    val rTS3 = Card("Red", 3, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_3)

    init {
        val deck = arrayOf(
            bP1,
            bP2,
            bP3,
            bPE1,
            bPE2,
            bPE3,
            bPS1,
            bPS2,
            bPS3,
            gP1,
            gP2,
            gP3,
            gPE1,
            gPE2,
            gPE3,
            gPS1,
            gPS2,
            gPS3,
            oP1,
            oP2,
            oP3,
            oPE1,
            oPE2,
            oPE3,
            oPS1,
            oPS2,
            oPS3,
            rP1,
            rP2,
            rP3,
            rPE1,
            rPE2,
            rPE3,
            rPS1,
            rPS2,
            rPS3,
            bR1,
            bR2,
            bR3,
            bRE1,
            bRE2,
            bRE3,
            bRS1,
            bRS2,
            bRS3,
            gR1,
            gR2,
            gR3,
            gRE1,
            gRE2,
            gRE3,
            gRS1,
            gRS2,
            gRS3,
            oR1,
            oR2,
            oR3,
            oRE1,
            oRE2,
            oRE3,
            oRS1,
            oRS2,
            oRS3,
            rR1,
            rR2,
            rR3,
            rRE1,
            rRE2,
            rRE3,
            rRS1,
            rRS2,
            rRS3,
            bS1,
            bS2,
            bS3,
            bSE1,
            bSE2,
            bSE3,
            bSS1,
            bSS2,
            bSS3,
            gS1,
            gS2,
            gS3,
            gSE1,
            gSE2,
            gSE3,
            gSS1,
            gSS2,
            gSS3,
            oS1,
            oS2,
            oS3,
            oSE1,
            oSE2,
            oSE3,
            oSS1,
            oSS2,
            oSS3,
            rS1,
            rS2,
            rS3,
            rSE1,
            rSE2,
            rSE3,
            rSS1,
            rSS2,
            rSS3,
            bT1,
            bT2,
            bT3,
            bTE1,
            bTE2,
            bTE3,
            bTS1,
            bTS2,
            bTS3,
            gT1,
            gT2,
            gT3,
            gTE1,
            gTE2,
            gTE3,
            gTS1,
            gTS2,
            gTS3,
            oT1,
            oT2,
            oT3,
            oTE1,
            oTE2,
            oTE3,
            oTS1,
            oTS2,
            oTS3,
            rT1,
            rT2,
            rT3,
            rTE1,
            rTE2,
            rTE3,
            rTS1,
            rTS2,
            rTS3
        )

        for (card in deck) {
            decking.addFirst(card)
        }
        deck.shuffle()
    }
}

    // constructor (iV : Int) {}


fun getCard2(): Card {
    val deck = Deck()
    val decking = deck.decking
    var card = decking.first()
    decking.removeFirst()
    return card
}



