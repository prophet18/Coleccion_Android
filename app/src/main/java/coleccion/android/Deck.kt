package coleccion.android

import android.media.Image
import android.widget.ImageView
import androidx.compose.ui.semantics.Role.Companion.Image
import java.io.File
import java.io.FileInputStream
import java.util.Stack


class Deck : Stack<Card?>() {
    init {
        val bP1 = Card(
            "Blue",
            1,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_1.png"
        )
        val bP2 = Card(
            "Blue",
            2,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_2.png"
        )
        val bP3 = Card(
            "Blue",
            3,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_3.png"
        )
        val bPE1 = Card(
            "Blue",
            1,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_1.png"
        )
        val bPE2 = Card(
            "Blue",
            2,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_2.png"
        )
        val bPE3 = Card(
            "Blue",
            3,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_3.png"
        )
        val bPS1 = Card(
            "Blue",
            1,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_1.png"
        )
        val bPS2 = Card(
            "Blue",
            2,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_2.png"
        )
        val bPS3 = Card(
            "Blue",
            3,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_3.png"
        )
        val gP1 = Card(
            "Green",
            1,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_1.png"
        )
        val gP2 = Card(
            "Green",
            2,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_2.png"
        )
        val gP3 = Card(
            "Green",
            3,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_3.png"
        )
        val gPE1 = Card(
            "Green",
            1,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_1.png"
        )
        val gPE2 = Card(
            "Green",
            2,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_2.png"
        )
        val gPE3 = Card(
            "Green",
            3,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_3.png"
        )
        val gPS1 = Card(
            "Green",
            1,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_1.png"
        )
        val gPS2 = Card(
            "Green",
            2,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_2.png"
        )
        val gPS3 = Card(
            "Green",
            3,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_3.png"
        )
        val oP1 = Card(
            "Orange",
            1,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_1.png"
        )
        val oP2 = Card(
            "Orange",
            2,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_2.png"
        )
        val oP3 = Card(
            "Orange",
            3,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_3.png"
        )
        val oPE1 = Card(
            "Orange",
            1,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_1.png"
        )
        val oPE2 = Card(
            "Orange",
            2,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_2.png"
        )
        val oPE3 = Card(
            "Orange",
            3,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_3.png"
        )
        val oPS1 = Card(
            "Orange",
            1,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_1.png"
        )
        val oPS2 = Card(
            "Orange",
            2,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_2.png"
        )
        val oPS3 = Card(
            "Orange",
            3,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_3.png"
        )
        val rP1 = Card(
            "Red",
            1,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_1.png"
        )
        val rP2 = Card(
            "Red",
            2,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_2.png"
        )
        val rP3 = Card(
            "Red",
            3,
            "Parallelogram",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_3.png"
        )
        val rPE1 = Card(
            "Red",
            1,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_1.png"
        )
        val rPE2 = Card(
            "Red",
            2,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_2.png"
        )
        val rPE3 = Card(
            "Red",
            3,
            "Parallelogram",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_3.png"
        )
        val rPS1 = Card(
            "Red",
            1,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_1.png"
        )
        val rPS2 = Card(
            "Red",
            2,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_2.png"
        )
        val rPS3 = Card(
            "Red",
            3,
            "Parallelogram",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_3.png"
        )
        val bR1 = Card(
            "Blue",
            1,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_1.png"
        )
        val bR2 = Card(
            "Blue",
            2,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_2.png"
        )
        val bR3 = Card(
            "Blue",
            3,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_3.png"
        )
        val bRE1 = Card(
            "Blue",
            1,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_1.png"
        )
        val bRE2 = Card(
            "Blue",
            2,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_2.png"
        )
        val bRE3 = Card(
            "Blue",
            3,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_3.png"
        )
        val bRS1 = Card(
            "Blue",
            1,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_1.png"
        )
        val bRS2 = Card(
            "Blue",
            2,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_2.png"
        )
        val bRS3 = Card(
            "Blue",
            3,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_3.png"
        )
        val gR1 = Card(
            "Green",
            1,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_1.png"
        )
        val gR2 = Card(
            "Green",
            2,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_2.png"
        )
        val gR3 = Card(
            "Green",
            3,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_3.png"
        )
        val gRE1 = Card(
            "Green",
            1,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_1.png"
        )
        val gRE2 = Card(
            "Green",
            2,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_2.png"
        )
        val gRE3 = Card(
            "Green",
            3,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_3.png"
        )
        val gRS1 = Card(
            "Green",
            1,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_1.png"
        )
        val gRS2 = Card(
            "Green",
            2,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_2.png"
        )
        val gRS3 = Card(
            "Green",
            3,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_3.png"
        )
        val oR1 = Card(
            "Orange",
            1,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_1.png"
        )
        val oR2 = Card(
            "Orange",
            2,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_2.png"
        )
        val oR3 = Card(
            "Orange",
            3,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_3.png"
        )
        val oRE1 = Card(
            "Orange",
            1,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_1.png"
        )
        val oRE2 = Card(
            "Orange",
            2,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_2.png"
        )
        val oRE3 = Card(
            "Orange",
            3,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_3.png"
        )
        val oRS1 = Card(
            "Orange",
            1,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_1.png"
        )
        val oRS2 = Card(
            "Orange",
            2,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_2.png"
        )
        val oRS3 = Card(
            "Orange",
            3,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_3.png"
        )
        val rR1 = Card(
            "Red",
            1,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_1.png"
        )
        val rR2 = Card(
            "Red",
            2,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_2.png"
        )
        val rR3 = Card(
            "Red",
            3,
            "Rectangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_3.png"
        )
        val rRE1 = Card(
            "Red",
            1,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_1.png"
        )
        val rRE2 = Card(
            "Red",
            2,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_2.png"
        )
        val rRE3 = Card(
            "Red",
            3,
            "Rectangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_3.png"
        )
        val rRS1 = Card(
            "Red",
            1,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_1.png"
        )
        val rRS2 = Card(
            "Red",
            2,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_2.png"
        )
        val rRS3 = Card(
            "Red",
            3,
            "Rectangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_3.png"
        )
        val bS1 = Card(
            "Blue",
            1,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_1.png"
        )
        val bS2 = Card(
            "Blue",
            2,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_2.png"
        )
        val bS3 = Card(
            "Blue",
            3,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_3.png"
        )
        val bSE1 = Card(
            "Blue",
            1,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_1.png"
        )
        val bSE2 = Card(
            "Blue",
            2,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_2.png"
        )
        val bSE3 = Card(
            "Blue",
            3,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_3.png"
        )
        val bSS1 = Card(
            "Blue",
            1,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_1.png"
        )
        val bSS2 = Card(
            "Blue",
            2,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_2.png"
        )
        val bSS3 = Card(
            "Blue",
            3,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_3.png"
        )
        val gS1 = Card(
            "Green",
            1,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_1.png"
        )
        val gS2 = Card(
            "Green",
            2,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_2.png"
        )
        val gS3 = Card(
            "Green",
            3,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_3.png"
        )
        val gSE1 = Card(
            "Green",
            1,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_1.png"
        )
        val gSE2 = Card(
            "Green",
            2,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_2.png"
        )
        val gSE3 = Card(
            "Green",
            3,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_3.png"
        )
        val gSS1 = Card(
            "Green",
            1,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_1.png"
        )
        val gSS2 = Card(
            "Green",
            2,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_2.png"
        )
        val gSS3 = Card(
            "Green",
            3,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_3.png"
        )
        val oS1 = Card(
            "Orange",
            1,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_1.png"
        )
        val oS2 = Card(
            "Orange",
            2,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_2.png"
        )
        val oS3 = Card(
            "Orange",
            3,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_3.png"
        )
        val oSE1 = Card(
            "Orange",
            1,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_1.png"
        )
        val oSE2 = Card(
            "Orange",
            2,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_2.png"
        )
        val oSE3 = Card(
            "Orange",
            3,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_3.png"
        )
        val oSS1 = Card(
            "Orange",
            1,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_1.png"
        )
        val oSS2 = Card(
            "Orange",
            2,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_2.png"
        )
        val oSS3 = Card(
            "Orange",
            3,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_3.png"
        )
        val rS1 = Card(
            "Red",
            1,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_1.png"
        )
        val rS2 = Card(
            "Red",
            2,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_2.png"
        )
        val rS3 = Card(
            "Red",
            3,
            "Semicircle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_3.png"
        )
        val rSE1 = Card(
            "Red",
            1,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_1.png"
        )
        val rSE2 = Card(
            "Red",
            2,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_2.png"
        )
        val rSE3 = Card(
            "Red",
            3,
            "Semicircle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_3.png"
        )
        val rSS1 = Card(
            "Red",
            1,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_1.png"
        )
        val rSS2 = Card(
            "Red",
            2,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_2.png"
        )
        val rSS3 = Card(
            "Red",
            3,
            "Semicircle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_3.png"
        )
        val bT1 = Card(
            "Blue",
            1,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_1.png"
        )
        val bT2 = Card(
            "Blue",
            2,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_2.png"
        )
        val bT3 = Card(
            "Blue",
            3,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_3.png"
        )
        val bTE1 = Card(
            "Blue",
            1,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_1.png"
        )
        val bTE2 = Card(
            "Blue",
            2,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_2.png"
        )
        val bTE3 = Card(
            "Blue",
            3,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_3.png"
        )
        val bTS1 = Card(
            "Blue",
            1,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_1.png"
        )
        val bTS2 = Card(
            "Blue",
            2,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_2.png"
        )
        val bTS3 = Card(
            "Blue",
            3,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_3.png"
        )
        val gT1 = Card(
            "Green",
            1,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_1.png"
        )
        val gT2 = Card(
            "Green",
            2,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_2.png"
        )
        val gT3 = Card(
            "Green",
            3,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_3.png"
        )
        val gTE1 = Card(
            "Green",
            1,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_1.png"
        )
        val gTE2 = Card(
            "Green",
            2,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_2.png"
        )
        val gTE3 = Card(
            "Green",
            3,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_3.png"
        )
        val gTS1 = Card(
            "Green",
            1,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_1.png"
        )
        val gTS2 = Card(
            "Green",
            2,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_2.png"
        )
        val gTS3 = Card(
            "Green",
            3,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_3.png"
        )
        val oT1 = Card(
            "Orange",
            1,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_1.png"
        )
        val oT2 = Card(
            "Orange",
            2,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_2.png"
        )
        val oT3 = Card(
            "Orange",
            3,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_3.png"
        )
        val oTE1 = Card(
            "Orange",
            1,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_1.png"
        )
        val oTE2 = Card(
            "Orange",
            2,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_2.png"
        )
        val oTE3 = Card(
            "Orange",
            3,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_3.png"
        )
        val oTS1 = Card(
            "Orange",
            1,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_1.png"
        )
        val oTS2 = Card(
            "Orange",
            2,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_2.png"
        )
        val oTS3 = Card(
            "Orange",
            3,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_3.png"
        )
        val rT1 = Card(
            "Red",
            1,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_1.png"
        )
        val rT2 = Card(
            "Red",
            2,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_2.png"
        )
        val rT3 = Card(
            "Red",
            3,
            "Triangle",
            "Solid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_3.png"
        )
        val rTE1 = Card(
            "Red",
            1,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_1.png"
        )
        val rTE2 = Card(
            "Red",
            2,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_2.png"
        )
        val rTE3 = Card(
            "Red",
            3,
            "Triangle",
            "Empty",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_3.png"
        )
        val rTS1 = Card(
            "Red",
            1,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_1.png"
        )
        val rTS2 = Card(
            "Red",
            2,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_2.png"
        )
        val rTS3 = Card(
            "Red",
            3,
            "Triangle",
            "Grid",
            "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_3.png"
        )
        val blueP1i = R.drawable.colecci_n_blue_parallelogram_1

        val blueP2i = ImageView(FileInputStream(bP2.path))
        val blueP3i = Image(FileInputStream(bP3.path))
        val blueP1ei = Image(FileInputStream(bPE1.path))
        val blueP2ei = Image(FileInputStream(bPE2.path))
        val blueP3ei = Image(FileInputStream(bPE3.path))
        val blueP1gi = Image(FileInputStream(bPS1.path))
        val blueP2gi = Image(FileInputStream(bPS2.path))
        val blueP3gi = Image(FileInputStream(bPS3.path))
        val greenP1i = Image(FileInputStream(gP1.path))
        val greenP2i = Image(FileInputStream(gP2.path))
        val greenP3i = Image(FileInputStream(gP3.path))
        val greenP1ei = Image(FileInputStream(gPE1.path))
        val greenP2ei = Image(FileInputStream(gPE2.path))
        val greenP3ei = Image(FileInputStream(gPE3.path))
        val greenP1gi = Image(FileInputStream(gPS1.path))
        val greenP2gi = Image(FileInputStream(gPS2.path))
        val greenP3gi = Image(FileInputStream(gPS3.path))
        val orangeP1i = Image(FileInputStream(oP1.path))
        val orangeP2i = Image(FileInputStream(oP2.path))
        val orangeP3i = Image(FileInputStream(oP3.path))
        val orangeP1ei = Image(FileInputStream(oPE1.path))
        val orangeP2ei = Image(FileInputStream(oPE2.path))
        val orangeP3ei = Image(FileInputStream(oPE3.path))
        val orangeP1gi = Image(FileInputStream(oPS1.path))
        val orangeP2gi = Image(FileInputStream(oPS2.path))
        val orangeP3gi = Image(FileInputStream(oPS3.path))
        val redP1i = Image(FileInputStream(rP1.path))
        val redP2i = Image(FileInputStream(rP2.path))
        val redP3i = Image(FileInputStream(rP3.path))
        val redP1ei = Image(FileInputStream(rPE1.path))
        val redP2ei = Image(FileInputStream(rPE2.path))
        val redP3ei = Image(FileInputStream(rPE3.path))
        val redP1gi = Image(FileInputStream(rPS1.path))
        val redP2gi = Image(FileInputStream(rPS2.path))
        val redP3gi = Image(FileInputStream(rPS3.path))
        val blueR1i = Image(FileInputStream(bR1.path))
        val blueR2i = Image(FileInputStream(bR2.path))
        val blueR3i = Image(FileInputStream(bR3.path))
        val blueR1ei = Image(FileInputStream(bRE1.path))
        val blueR2ei = Image(FileInputStream(bRE2.path))
        val blueR3ei = Image(FileInputStream(bRE3.path))
        val blueR1gi = Image(FileInputStream(bRS1.path))
        val blueR2gi = Image(FileInputStream(bRS2.path))
        val blueR3gi = Image(FileInputStream(bRS3.path))
        val greenR1i = Image(FileInputStream(gR1.path))
        val greenR2i = Image(FileInputStream(gR2.path))
        val greenR3i = Image(FileInputStream(gR3.path))
        val greenR1ei = Image(FileInputStream(gRE1.path))
        val greenR2ei = Image(FileInputStream(gRE2.path))
        val greenR3ei = Image(FileInputStream(gRE3.path))
        val greenR1gi = Image(FileInputStream(gRS1.path))
        val greenR2gi = Image(FileInputStream(gRS2.path))
        val greenR3gi = Image(FileInputStream(gRS3.path))
        val orangeR1i = Image(FileInputStream(oR1.path))
        val orangeR2i = Image(FileInputStream(oR2.path))
        val orangeR3i = Image(FileInputStream(oR3.path))
        val orangeR1ei = Image(FileInputStream(oRE1.path))
        val orangeR2ei = Image(FileInputStream(oRE2.path))
        val orangeR3ei = Image(FileInputStream(oRE3.path))
        val orangeR1gi = Image(FileInputStream(oRS1.path))
        val orangeR2gi = Image(FileInputStream(oRS2.path))
        val orangeR3gi = Image(FileInputStream(oRS3.path))
        val redR1i = Image(FileInputStream(rR1.path))
        val redR2i = Image(FileInputStream(rR2.path))
        val redR3i = Image(FileInputStream(rR3.path))
        val redR1ei = Image(FileInputStream(rRE1.path))
        val redR2ei = Image(FileInputStream(rRE2.path))
        val redR3ei = Image(FileInputStream(rRE3.path))
        val redR1gi = Image(FileInputStream(rRS1.path))
        val redR2gi = Image(FileInputStream(rRS2.path))
        val redR3gi = Image(FileInputStream(rRS3.path))
        val blueS1i = Image(FileInputStream(bS1.path))
        val blueS2i = Image(FileInputStream(bS2.path))
        val blueS3i = Image(FileInputStream(bS3.path))
        val blueS1ei = Image(FileInputStream(bSE1.path))
        val blueS2ei = Image(FileInputStream(bSE2.path))
        val blueS3ei = Image(FileInputStream(bSE3.path))
        val blueS1gi = Image(FileInputStream(bSS1.path))
        val blueS2gi = Image(FileInputStream(bSS2.path))
        val blueS3gi = Image(FileInputStream(bSS3.path))
        val greenS1i = Image(FileInputStream(gS1.path))
        val greenS2i = Image(FileInputStream(gS2.path))
        val greenS3i = Image(FileInputStream(gS3.path))
        val greenS1ei = Image(FileInputStream(gSE1.path))
        val greenS2ei = Image(FileInputStream(gSE2.path))
        val greenS3ei = Image(FileInputStream(gSE3.path))
        val greenS1gi = Image(FileInputStream(gSS1.path))
        val greenS2gi = Image(FileInputStream(gSS2.path))
        val greenS3gi = Image(FileInputStream(gSS3.path))
        val orangeS1i = Image(FileInputStream(oS1.path))
        val orangeS2i = Image(FileInputStream(oS2.path))
        val orangeS3i = Image(FileInputStream(oS3.path))
        val orangeS1ei = Image(FileInputStream(oSE1.path))
        val orangeS2ei = Image(FileInputStream(oSE2.path))
        val orangeS3ei = Image(FileInputStream(oSE3.path))
        val orangeS1gi = Image(FileInputStream(oSS1.path))
        val orangeS2gi = Image(FileInputStream(oSS2.path))
        val orangeS3gi = Image(FileInputStream(oSS3.path))
        val redS1i = Image(FileInputStream(rS1.path))
        val redS2i = Image(FileInputStream(rS2.path))
        val redS3i = Image(FileInputStream(rS3.path))
        val redS1ei = Image(FileInputStream(rSE1.path))
        val redS2ei = Image(FileInputStream(rSE2.path))
        val redS3ei = Image(FileInputStream(rSE3.path))
        val redS1gi = Image(FileInputStream(rSS1.path))
        val redS2gi = Image(FileInputStream(rSS2.path))
        val redS3gi = Image(FileInputStream(rSS3.path))
        val blueT1i = Image(FileInputStream(bT1.path))
        val blueT2i = Image(FileInputStream(bT2.path))
        val blueT3i = Image(FileInputStream(bT3.path))
        val blueT1ei = Image(FileInputStream(bTE1.path))
        val blueT2ei = Image(FileInputStream(bTE2.path))
        val blueT3ei = Image(FileInputStream(bTE3.path))
        val blueT1gi = Image(FileInputStream(bTS1.path))
        val blueT2gi = Image(FileInputStream(bTS2.path))
        val blueT3gi = Image(FileInputStream(bTS3.path))
        val greenT1i = Image(FileInputStream(gT1.path))
        val greenT2i = Image(FileInputStream(gT2.path))
        val greenT3i = Image(FileInputStream(gT3.path))
        val greenT1ei = Image(FileInputStream(gTE1.path))
        val greenT2ei = Image(FileInputStream(gTE2.path))
        val greenT3ei = Image(FileInputStream(gTE3.path))
        val greenT1gi = Image(FileInputStream(gTS1.path))
        val greenT2gi = Image(FileInputStream(gTS2.path))
        val greenT3gi = Image(FileInputStream(gTS3.path))
        val orangeT1i = Image(FileInputStream(oT1.path))
        val orangeT2i = Image(FileInputStream(oT2.path))
        val orangeT3i = Image(FileInputStream(oT3.path))
        val orangeT1ei = Image(FileInputStream(oTE1.path))
        val orangeT2ei = Image(FileInputStream(oTE2.path))
        val orangeT3ei = Image(FileInputStream(oTE3.path))
        val orangeT1gi = Image(FileInputStream(oTS1.path))
        val orangeT2gi = Image(FileInputStream(oTS2.path))
        val orangeT3gi = Image(FileInputStream(oTS3.path))
        val redT1i = Image(FileInputStream(rT1.path))
        val redT2i = Image(FileInputStream(rT2.path))
        val redT3i = Image(FileInputStream(rT3.path))
        val redT1ei = Image(FileInputStream(rTE1.path))
        val redT2ei = Image(FileInputStream(rTE2.path))
        val redT3ei = Image(FileInputStream(rTE3.path))
        val redT1gi = Image(FileInputStream(rTS1.path))
        val redT2gi = Image(FileInputStream(rTS2.path))
        val redT3gi = Image(FileInputStream(rTS3.path))
        bP1.imgAdd(blueP1i)
        val bbo: Int = bP1.image
        bP2.imgAdd(blueP2i)
        bP3.imgAdd(blueP3i)
        bPE1.imgAdd(blueP1ei)
        bPE2.imgAdd(blueP2ei)
        bPE3.imgAdd(blueP3ei)
        bPS1.imgAdd(blueP1gi)
        bPS2.imgAdd(blueP2gi)
        bPS3.imgAdd(blueP3gi)
        gP1.imgAdd(greenP1i)
        gP2.imgAdd(greenP2i)
        gP3.imgAdd(greenP3i)
        gPE1.imgAdd(greenP1ei)
        gPE2.imgAdd(greenP2ei)
        gPE3.imgAdd(greenP3ei)
        gPS1.imgAdd(greenP1gi)
        gPS2.imgAdd(greenP2gi)
        gPS3.imgAdd(greenP3gi)
        oP1.imgAdd(orangeP1i)
        oP2.imgAdd(orangeP2i)
        oP3.imgAdd(orangeP3i)
        oPE1.imgAdd(orangeP1ei)
        oPE2.imgAdd(orangeP2ei)
        oPE3.imgAdd(orangeP3ei)
        oPS1.imgAdd(orangeP1gi)
        oPS2.imgAdd(orangeP2gi)
        oPS3.imgAdd(orangeP3gi)
        rP1.imgAdd(redP1i)
        rP2.imgAdd(redP2i)
        rP3.imgAdd(redP3i)
        rPE1.imgAdd(redP1ei)
        rPE2.imgAdd(redP2ei)
        rPE3.imgAdd(redP3ei)
        rPS1.imgAdd(redP1gi)
        rPS2.imgAdd(redP2gi)
        rPS3.imgAdd(redP3gi)
        bR1.imgAdd(blueR1i)
        bR2.imgAdd(blueR2i)
        bR3.imgAdd(blueR3i)
        bRE1.imgAdd(blueR1ei)
        bRE2.imgAdd(blueR2ei)
        bRE3.imgAdd(blueR3ei)
        bRS1.imgAdd(blueR1gi)
        bRS2.imgAdd(blueR2gi)
        bRS3.imgAdd(blueR3gi)
        gR1.imgAdd(greenR1i)
        gR2.imgAdd(greenR2i)
        gR3.imgAdd(greenR3i)
        gRE1.imgAdd(greenR1ei)
        gRE2.imgAdd(greenR2ei)
        gRE3.imgAdd(greenR3ei)
        gRS1.imgAdd(greenR1gi)
        gRS2.imgAdd(greenR2gi)
        gRS3.imgAdd(greenR3gi)
        oR1.imgAdd(orangeR1i)
        oR2.imgAdd(orangeR2i)
        oR3.imgAdd(orangeR3i)
        oRE1.imgAdd(orangeR1ei)
        oRE2.imgAdd(orangeR2ei)
        oRE3.imgAdd(orangeR3ei)
        oRS1.imgAdd(orangeR1gi)
        oRS2.imgAdd(orangeR2gi)
        oRS3.imgAdd(orangeR3gi)
        rR1.imgAdd(redR1i)
        rR2.imgAdd(redR2i)
        rR3.imgAdd(redR3i)
        rRE1.imgAdd(redR1ei)
        rRE2.imgAdd(redR2ei)
        rRE3.imgAdd(redR3ei)
        rRS1.imgAdd(redR1gi)
        rRS2.imgAdd(redR2gi)
        rRS3.imgAdd(redR3gi)
        bS1.imgAdd(blueS1i)
        bS2.imgAdd(blueS2i)
        bS3.imgAdd(blueS3i)
        bSE1.imgAdd(blueS1ei)
        bSE2.imgAdd(blueS2ei)
        bSE3.imgAdd(blueS3ei)
        bSS1.imgAdd(blueS1gi)
        bSS2.imgAdd(blueS2gi)
        bSS3.imgAdd(blueS3gi)
        gS1.imgAdd(greenS1i)
        gS2.imgAdd(greenS2i)
        gS3.imgAdd(greenS3i)
        gSE1.imgAdd(greenS1ei)
        gSE2.imgAdd(greenS2ei)
        gSE3.imgAdd(greenS3ei)
        gSS1.imgAdd(greenS1gi)
        gSS2.imgAdd(greenS2gi)
        gSS3.imgAdd(greenS3gi)
        oS1.imgAdd(orangeS1i)
        oS2.imgAdd(orangeS2i)
        oS3.imgAdd(orangeS3i)
        oSE1.imgAdd(orangeS1ei)
        oSE2.imgAdd(orangeS2ei)
        oSE3.imgAdd(orangeS3ei)
        oSS1.imgAdd(orangeS1gi)
        oSS2.imgAdd(orangeS2gi)
        oSS3.imgAdd(orangeS3gi)
        rS1.imgAdd(redS1i)
        rS2.imgAdd(redS2i)
        rS3.imgAdd(redS3i)
        rSE1.imgAdd(redS1ei)
        rSE2.imgAdd(redS2ei)
        rSE3.imgAdd(redS3ei)
        rSS1.imgAdd(redS1gi)
        rSS2.imgAdd(redS2gi)
        rSS3.imgAdd(redS3gi)
        bT1.imgAdd(blueT1i)
        bT2.imgAdd(blueT2i)
        bT3.imgAdd(blueT3i)
        bTE1.imgAdd(blueT1ei)
        bTE2.imgAdd(blueT2ei)
        bTE3.imgAdd(blueT3ei)
        bTS1.imgAdd(blueT1gi)
        bTS2.imgAdd(blueT2gi)
        bTS3.imgAdd(blueT3gi)
        gT1.imgAdd(greenT1i)
        gT2.imgAdd(greenT2i)
        gT3.imgAdd(greenT3i)
        gTE1.imgAdd(greenT1ei)
        gTE2.imgAdd(greenT2ei)
        gTE3.imgAdd(greenT3ei)
        gTS1.imgAdd(greenT1gi)
        gTS2.imgAdd(greenT2gi)
        gTS3.imgAdd(greenT3gi)
        oT1.imgAdd(orangeT1i)
        oT2.imgAdd(orangeT2i)
        oT3.imgAdd(orangeT3i)
        oTE1.imgAdd(orangeT1ei)
        oTE2.imgAdd(orangeT2ei)
        oTE3.imgAdd(orangeT3ei)
        oTS1.imgAdd(orangeT1gi)
        oTS2.imgAdd(orangeT2gi)
        oTS3.imgAdd(orangeT3gi)
        rT1.imgAdd(redT1i)
        rT2.imgAdd(redT2i)
        rT3.imgAdd(redT3i)
        rTE1.imgAdd(redT1ei)
        rTE2.imgAdd(redT2ei)
        rTE3.imgAdd(redT3ei)
        rTS1.imgAdd(redT1gi)
        rTS2.imgAdd(redT2gi)
        rTS3.imgAdd(redT3gi)
        push(bP1)
        push(bP2)
        push(bP3)
        push(bPE1)
        push(bPE2)
        push(bPE3)
        push(bPS1)
        push(bPS2)
        push(bPS3)
        push(gP1)
        push(gP2)
        push(gP3)
        push(gPE1)
        push(gPE2)
        push(gPE3)
        push(gPS1)
        push(gPS2)
        push(gPS3)
        push(oP1)
        push(oP2)
        push(oP3)
        push(oPE1)
        push(oPE2)
        push(oPE3)
        push(oPS1)
        push(oPS2)
        push(oPS3)
        push(rP1)
        push(rP2)
        push(rP3)
        push(rPE1)
        push(rPE2)
        push(rPE3)
        push(rPS1)
        push(rPS2)
        push(rPS3)
        push(bR1)
        push(bR2)
        push(bR3)
        push(bRE1)
        push(bRE2)
        push(bRE3)
        push(bRS1)
        push(bRS2)
        push(bRS3)
        push(gR1)
        push(gR2)
        push(gR3)
        push(gRE1)
        push(gRE2)
        push(gRE3)
        push(gRS1)
        push(gRS2)
        push(gRS3)
        push(oR1)
        push(oR2)
        push(oR3)
        push(oRE1)
        push(oRE2)
        push(oRE3)
        push(oRS1)
        push(oRS2)
        push(oRS3)
        push(rR1)
        push(rR2)
        push(rR3)
        push(rRE1)
        push(rRE2)
        push(rRE3)
        push(rRS1)
        push(rRS2)
        push(rRS3)
        push(bS1)
        push(bS2)
        push(bS3)
        push(bSE1)
        push(bSE2)
        push(bSE3)
        push(bSS1)
        push(bSS2)
        push(bSS3)
        push(gS1)
        push(gS2)
        push(gS3)
        push(gSE1)
        push(gSE2)
        push(gSE3)
        push(gSS1)
        push(gSS2)
        push(gSS3)
        push(oS1)
        push(oS2)
        push(oS3)
        push(oSE1)
        push(oSE2)
        push(oSE3)
        push(oSS1)
        push(oSS2)
        push(oSS3)
        push(rS1)
        push(rS2)
        push(rS3)
        push(rSE1)
        push(rSE2)
        push(rSE3)
        push(rSS1)
        push(rSS2)
        push(rSS3)
        push(bT1)
        push(bT2)
        push(bT3)
        push(bTE1)
        push(bTE2)
        push(bTE3)
        push(bTS1)
        push(bTS2)
        push(bTS3)
        push(gT1)
        push(gT2)
        push(gT3)
        push(gTE1)
        push(gTE2)
        push(gTE3)
        push(gTS1)
        push(gTS2)
        push(gTS3)
        push(oT1)
        push(oT2)
        push(oT3)
        push(oTE1)
        push(oTE2)
        push(oTE3)
        push(oTS1)
        push(oTS2)
        push(oTS3)
        push(rT1)
        push(rT2)
        push(rT3)
        push(rTE1)
        push(rTE2)
        push(rTE3)
        push(rTS1)
        push(rTS2)
        push(rTS3)
    }
}