package coleccion.android.cards

/*
    Deck is a class which implements the Stack utility from Java, with the constituent objects being collection cards.
    Each card is created from the Card class, with the necessary parameters.
    The Deck is then initialized, with the Cards being pushed onto the Stack.
*/

import coleccion.android.R
import java.util.Stack

class Deck : Stack<Card>() {

    private val bP1 = Card("Blue", 1, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_1)
    private val bP2 = Card("Blue", 2, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_2)
    private val bP3 = Card("Blue", 3, "Parallelogram", "Solid", R.drawable.colecci_n_blue_parallelogram_3)
    private val bPE1 = Card("Blue", 1, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_1)
    private val bPE2 = Card("Blue", 2, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_2)
    private val bPE3 = Card("Blue", 3, "Parallelogram", "Empty", R.drawable.colecci_n_blue_parallelogram_e_3)
    private val bPS1 = Card("Blue", 1, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_1)
    private val bPS2 = Card("Blue", 2, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_2)
    private val bPS3 = Card("Blue", 3, "Parallelogram", "Grid", R.drawable.colecci_n_blue_parallelogram_s_3)
    private val gP1 = Card("Green", 1, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_1)
    private val gP2 = Card("Green", 2, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_2)
    private val gP3 = Card("Green", 3, "Parallelogram", "Solid", R.drawable.colecci_n_green_parallelogram_3)
    private val gPE1 = Card("Green", 1, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_1)
    private val gPE2 = Card("Green", 2, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_2)
    private val gPE3 = Card("Green", 3, "Parallelogram", "Empty", R.drawable.colecci_n_green_parallelogram_e_3)
    private val gPS1 = Card("Green", 1, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_1)
    private val gPS2 = Card("Green", 2, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_2)
    private val gPS3 = Card("Green", 3, "Parallelogram", "Grid", R.drawable.colecci_n_green_parallelogram_s_3)
    private val oP1 = Card("Orange", 1, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_1)
    private val oP2 = Card("Orange", 2, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_2)
    private val oP3 = Card("Orange", 3, "Parallelogram", "Solid", R.drawable.colecci_n_orange_parallelogram_3)
    private val oPE1 = Card("Orange", 1, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_1)
    private val oPE2 = Card("Orange", 2, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_2)
    private val oPE3 = Card("Orange", 3, "Parallelogram", "Empty", R.drawable.colecci_n_orange_parallelogram_e_3)
    private val oPS1 = Card("Orange", 1, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_1)
    private val oPS2 = Card("Orange", 2, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_2)
    private val oPS3 = Card("Orange", 3, "Parallelogram", "Grid", R.drawable.colecci_n_orange_parallelogram_s_3)
    private val rP1 = Card("Red", 1, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_1)
    private val rP2 = Card("Red", 2, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_2)
    private val rP3 = Card("Red", 3, "Parallelogram", "Solid", R.drawable.colecci_n_red_parallelogram_3)
    private val rPE1 = Card("Red", 1, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_1)
    private val rPE2 = Card("Red", 2, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_2)
    private val rPE3 = Card("Red", 3, "Parallelogram", "Empty", R.drawable.colecci_n_red_parallelogram_e_3)
    private val rPS1 = Card("Red", 1, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_1)
    private val rPS2 = Card("Red", 2, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_2)
    private val rPS3 = Card("Red", 3, "Parallelogram", "Grid", R.drawable.colecci_n_red_parallelogram_s_3)
    private val bR1 = Card("Blue", 1, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_1)
    private val bR2 = Card("Blue", 2, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_2)
    private val bR3 = Card("Blue", 3, "Rectangle", "Solid", R.drawable.colecci_n_blue_rectangle_3)
    private val bRE1 = Card("Blue", 1, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_1)
    private val bRE2 = Card("Blue", 2, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_2)
    private val bRE3 = Card("Blue", 3, "Rectangle", "Empty", R.drawable.colecci_n_blue_rectangle_e_3)
    private val bRS1 = Card("Blue", 1, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_1)
    private val bRS2 = Card("Blue", 2, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_2)
    private val bRS3 = Card("Blue", 3, "Rectangle", "Grid", R.drawable.colecci_n_blue_rectangle_s_3)
    private val gR1 = Card("Green", 1, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_1)
    private val gR2 = Card("Green", 2, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_2)
    private val gR3 = Card("Green", 3, "Rectangle", "Solid", R.drawable.colecci_n_green_rectangle_3)
    private val gRE1 = Card("Green", 1, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_1)
    private val gRE2 = Card("Green", 2, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_2)
    private val gRE3 = Card("Green", 3, "Rectangle", "Empty", R.drawable.colecci_n_green_rectangle_e_3)
    private val gRS1 = Card("Green", 1, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_1)
    private val gRS2 = Card("Green", 2, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_2)
    private val gRS3 = Card("Green", 3, "Rectangle", "Grid", R.drawable.colecci_n_green_rectangle_s_3)
    private val oR1 = Card("Orange", 1, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_1)
    private val oR2 = Card("Orange", 2, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_2)
    private val oR3 = Card("Orange", 3, "Rectangle", "Solid", R.drawable.colecci_n_orange_rectangle_3)
    private val oRE1 = Card("Orange", 1, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_1)
    private val oRE2 = Card("Orange", 2, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_2)
    private val oRE3 = Card("Orange", 3, "Rectangle", "Empty", R.drawable.colecci_n_orange_rectangle_e_3)
    private val oRS1 = Card("Orange", 1, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_1)
    private val oRS2 = Card("Orange", 2, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_2)
    private val oRS3 = Card("Orange", 3, "Rectangle", "Grid", R.drawable.colecci_n_orange_rectangle_s_3)
    private val rR1 = Card("Red", 1, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_1)
    private val rR2 = Card("Red", 2, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_2)
    private val rR3 = Card("Red", 3, "Rectangle", "Solid", R.drawable.colecci_n_red_rectangle_3)
    private val rRE1 = Card("Red", 1, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_1)
    private val rRE2 = Card("Red", 2, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_2)
    private val rRE3 = Card("Red", 3, "Rectangle", "Empty", R.drawable.colecci_n_red_rectangle_e_3)
    private val rRS1 = Card("Red", 1, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_1)
    private val rRS2 = Card("Red", 2, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_2)
    private val rRS3 = Card("Red", 3, "Rectangle", "Grid", R.drawable.colecci_n_red_rectangle_s_3)
    private val bS1 = Card("Blue", 1, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_1)
    private val bS2 = Card("Blue", 2, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_2)
    private val bS3 = Card("Blue", 3, "Semicircle", "Solid", R.drawable.colecci_n_blue_semicircle_3)
    private val bSE1 = Card("Blue", 1, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_1)
    private val bSE2 = Card("Blue", 2, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_2)
    private val bSE3 = Card("Blue", 3, "Semicircle", "Empty", R.drawable.colecci_n_blue_semicircle_e_3)
    private val bSS1 = Card("Blue", 1, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_1)
    private val bSS2 = Card("Blue", 2, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_2)
    private val bSS3 = Card("Blue", 3, "Semicircle", "Grid", R.drawable.colecci_n_blue_semicircle_s_3)
    private val gS1 = Card("Green", 1, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_1)
    private val gS2 = Card("Green", 2, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_2)
    private val gS3 = Card("Green", 3, "Semicircle", "Solid", R.drawable.colecci_n_green_semicircle_3)
    private val gSE1 = Card("Green", 1, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_1)
    private val gSE2 = Card("Green", 2, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_2)
    private val gSE3 = Card("Green", 3, "Semicircle", "Empty", R.drawable.colecci_n_green_semicircle_e_3)
    private val gSS1 = Card("Green", 1, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_1)
    private val gSS2 = Card("Green", 2, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_2)
    private val gSS3 = Card("Green", 3, "Semicircle", "Grid", R.drawable.colecci_n_green_semicircle_s_3)
    private val oS1 = Card("Orange", 1, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_1)
    private val oS2 = Card("Orange", 2, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_2)
    private val oS3 = Card("Orange", 3, "Semicircle", "Solid", R.drawable.colecci_n_orange_semicircle_3)
    private val oSE1 = Card("Orange", 1, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_1)
    private val oSE2 = Card("Orange", 2, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_2)
    private val oSE3 = Card("Orange", 3, "Semicircle", "Empty", R.drawable.colecci_n_orange_semicircle_e_3)
    private val oSS1 = Card("Orange", 1, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_1)
    private val oSS2 = Card("Orange", 2, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_2)
    private val oSS3 = Card("Orange", 3, "Semicircle", "Grid", R.drawable.colecci_n_orange_semicircle_s_3)
    private val rS1 = Card("Red", 1, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_1)
    private val rS2 = Card("Red", 2, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_2)
    private val rS3 = Card("Red", 3, "Semicircle", "Solid", R.drawable.colecci_n_red_semicircle_3)
    private val rSE1 = Card("Red", 1, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_1)
    private val rSE2 = Card("Red", 2, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_2)
    private val rSE3 = Card("Red", 3, "Semicircle", "Empty", R.drawable.colecci_n_red_semicircle_e_3)
    private val rSS1 = Card("Red", 1, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_1)
    private val rSS2 = Card("Red", 2, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_2)
    private val rSS3 = Card("Red", 3, "Semicircle", "Grid", R.drawable.colecci_n_red_semicircle_s_3)
    private val bT1 = Card("Blue", 1, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_1)
    private val bT2 = Card("Blue", 2, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_2)
    private val bT3 = Card("Blue", 3, "Triangle", "Solid", R.drawable.colecci_n_blue_triangle_3)
    private val bTE1 = Card("Blue", 1, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_1)
    private val bTE2 = Card("Blue", 2, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_2)
    private val bTE3 = Card("Blue", 3, "Triangle", "Empty", R.drawable.colecci_n_blue_triangle_e_3)
    private val bTS1 = Card("Blue", 1, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_1)
    private val bTS2 = Card("Blue", 2, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_2)
    private val bTS3 = Card("Blue", 3, "Triangle", "Grid", R.drawable.colecci_n_blue_triangle_s_3)
    private val gT1 = Card("Green", 1, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_1)
    private val gT2 = Card("Green", 2, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_2)
    private val gT3 = Card("Green", 3, "Triangle", "Solid", R.drawable.colecci_n_green_triangle_3)
    private val gTE1 = Card("Green", 1, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_1)
    private val gTE2 = Card("Green", 2, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_2)
    private val gTE3 = Card("Green", 3, "Triangle", "Empty", R.drawable.colecci_n_green_triangle_e_3)
    private val gTS1 = Card("Green", 1, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_1)
    private val gTS2 = Card("Green", 2, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_2)
    private val gTS3 = Card("Green", 3, "Triangle", "Grid", R.drawable.colecci_n_green_triangle_s_3)
    private val oT1 = Card("Orange", 1, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_1)
    private val oT2 = Card("Orange", 2, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_2)
    private val oT3 = Card("Orange", 3, "Triangle", "Solid", R.drawable.colecci_n_orange_triangle_3)
    private val oTE1 = Card("Orange", 1, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_1)
    private val oTE2 = Card("Orange", 2, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_2)
    private val oTE3 = Card("Orange", 3, "Triangle", "Empty", R.drawable.colecci_n_orange_triangle_e_3)
    private val oTS1 = Card("Orange", 1, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_1)
    private val oTS2 = Card("Orange", 2, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_2)
    private val oTS3 = Card("Orange", 3, "Triangle", "Grid", R.drawable.colecci_n_orange_triangle_s_3)
    private val rT1 = Card("Red", 1, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_1)
    private val rT2 = Card("Red", 2, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_2)
    private val rT3 = Card("Red", 3, "Triangle", "Solid", R.drawable.colecci_n_red_triangle_3)
    private val rTE1 = Card("Red", 1, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_1)
    private val rTE2 = Card("Red", 2, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_2)
    private val rTE3 = Card("Red", 3, "Triangle", "Empty", R.drawable.colecci_n_red_triangle_e_3)
    private val rTS1 = Card("Red", 1, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_1)
    private val rTS2 = Card("Red", 2, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_2)
    private val rTS3 = Card("Red", 3, "Triangle", "Grid", R.drawable.colecci_n_red_triangle_s_3)

    init {
        this.push(bP1);         this.push(bP2);         this.push(bP3);         this.push(bPE1)
        this.push(bPE2);        this.push(bPE3);        this.push(bPS1);        this.push(bPS2)
        this.push(bPS3);        this.push(gP1);         this.push(gP2);         this.push(gP3)
        this.push(gPE1);        this.push(gPE2);        this.push(gPE3);        this.push(gPS1)
        this.push(gPS2);        this.push(gPS3);        this.push(oP1);         this.push(oP2)
        this.push(oP3);         this.push(oPE1);        this.push(oPE2);        this.push(oPE3)
        this.push(oPS1);        this.push(oPS2);        this.push(oPS3);        this.push(rP1)
        this.push(rP2);         this.push(rP3);         this.push(rPE1);        this.push(rPE2)
        this.push(rPE3);        this.push(rPS1);        this.push(rPS2);        this.push(rPS3)
        this.push(bR1);         this.push(bR2);         this.push(bR3);         this.push(bRE1)
        this.push(bRE2);        this.push(bRE3);        this.push(bRS1);        this.push(bRS2)
        this.push(bRS3);        this.push(gR1);         this.push(gR2);         this.push(gR3)
        this.push(gRE1);        this.push(gRE2);        this.push(gRE3);        this.push(gRS1)
        this.push(gRS2);        this.push(gRS3);        this.push(oR1);         this.push(oR2)
        this.push(oR3);         this.push(oRE1);        this.push(oRE2);        this.push(oRE3)
        this.push(oRS1);        this.push(oRS2);        this.push(oRS3);        this.push(rR1)
        this.push(rR2);         this.push(rR3);         this.push(rRE1);        this.push(rRE2)
        this.push(rRE3);        this.push(rRS1);        this.push(rRS2);        this.push(rRS3)
        this.push(bS1);         this.push(bS2);         this.push(bS3);         this.push(bSE1)
        this.push(bSE2);        this.push(bSE3);        this.push(bSS1);        this.push(bSS2)
        this.push(bSS3);        this.push(gS1);         this.push(gS2);         this.push(gS3)
        this.push(gSE1);        this.push(gSE2);        this.push(gSE3);        this.push(gSS1)
        this.push(gSS2);        this.push(gSS3);        this.push(oS1);         this.push(oS2)
        this.push(oS3);         this.push(oSE1);        this.push(oSE2);        this.push(oSE3)
        this.push(oSS1);        this.push(oSS2);        this.push(oSS3);        this.push(rS1)
        this.push(rS2);         this.push(rS3);         this.push(rSE1);        this.push(rSE2)
        this.push(rSE3);        this.push(rSS1);        this.push(rSS2);        this.push(rSS3)
        this.push(bT1);         this.push(bT2);         this.push(bT3);         this.push(bTE1)
        this.push(bTE2);        this.push(bTE3);        this.push(bTS1);        this.push(bTS2)
        this.push(bTS3);        this.push(gT1);         this.push(gT2);         this.push(gT3)
        this.push(gTE1);        this.push(gTE2);        this.push(gTE3);        this.push(gTS1)
        this.push(gTS2);        this.push(gTS3);        this.push(oT1);         this.push(oT2)
        this.push(oT3);         this.push(oTE1);        this.push(oTE2);        this.push(oTE3)
        this.push(oTS1);        this.push(oTS2);        this.push(oTS3);        this.push(rT1)
        this.push(rT2);         this.push(rT3);         this.push(rTE1);        this.push(rTE2)
        this.push(rTE3);        this.push(rTS1);        this.push(rTS2);        this.push(rTS3)
    }
}
   