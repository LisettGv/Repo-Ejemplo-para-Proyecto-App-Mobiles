package cl.mjl.myejemplo10.ui.theme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment



@Composable
fun InicioScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(text="Es Viernes!!!")
        Text(text="Y tu cuerpo lo sabe")
        Text(text="Quiero comer y dormir")

        Spacer(modifier = Modifier.height(48.dp))

        Row{
            Button(onClick = {  }) {
                Text("Ir al Fiesta")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {  }) {
                Text("Ir a Mi Casa")
            }
        }
    }
}