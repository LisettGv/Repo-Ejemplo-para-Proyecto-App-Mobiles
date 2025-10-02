package cl.mjl.myejemplo10.ui.theme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun InicioScreen(){

    Column(){
        Text(text="Es Viernes !!!")
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAligment = AlignmentLine.CenterHorizontaly,
        Text(text="Y tu cuerpo lo sabe")
        Text(text="Quiero comer y dormir")

        Spacer(mofifier = Modifier.height(48.dp))

        Row{
            Button(onClick = {  }) {Text("Ir al Fiesta")}
            Spacer(mofifier = Modifier.width(16.dp))
            Button(onClick = {  }) {Text("Ir a Mi Casa")}
        }
    }
}