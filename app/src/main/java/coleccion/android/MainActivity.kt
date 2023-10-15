package coleccion.android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.Text as Text1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var ngButton = (Button(findViewById (R.id.es_layout)))
       // ngButton.setOnClickListener(thi)

        setContent {
            CStuff()
            // var ngButton = (Button(findViewById (R.id.es_layout)))
            // ngButton.setOnClickListener(this)

        }




        }

    fun newGame (view: View?) {
        // do stuff
    }

    @Composable
    fun SimpleComposable() {
        val oneS = (ImageView(findViewById(R.id.collection_logo)))
        val doView = (View(findViewById(R.id.es_layout)))
    }

    @Composable
    @Preview
    fun CStuff() {
        SimpleComposable()
    }






        /*
            Coleccion_AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                }
            }
        */



}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )


}



 */


