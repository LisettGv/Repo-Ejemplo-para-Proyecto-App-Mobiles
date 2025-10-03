package cl.mjl.myejemplo10
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.mjl.myejemplo10.ui.theme.Imagen
import cl.mjl.myejemplo10.ui.theme.Navegacion
import cl.mjl.myejemplo10.ui.theme.Formulario
import cl.mjl.myejemplo10.ui.theme.MyEjemplo10Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEjemplo10Theme {
                Navegacion()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyEjemplo10Theme {
        Greeting("Android")
    }
}