package coleccion.android

class Card (var col: String, var num: Int, var sha: String, var fil: String, var pat: String) {

        var color: String = ""
        var number: Int = 0
        var shape: String = ""
        var fill: String = ""
        var path: String = ""
        var image: Int = 0

        init {
            col = color
            num = number
            sha = shape
            fil = fill
            pat = path
            image = R.drawable.colecci_n_blue_parallelogram_e_1

        }

        fun imgAdd (iimg: Int) {
            this.image = iimg
        }


}