package cl.mjl.myejemplo10.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Formulario(){

    var username by remember { mutableStateOf( "") }
    var pass by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Nombre")
        OutlinedTextField(
            value = username,
            onValueChange = {
                nuevotexto ->
                username = nuevotexto
            },
            label = { Text(text = "Introduce tu nombre")}
            )
        Text(text = "Contraseña")
        OutlinedTextField(
            value = pass,
            onValueChange = { nuevotexto ->
                pass = nuevotexto
            },
            label = { Text(text = "Introduce tu contraseña")}
        )
        Button(onClick = { }) {
            Text(text = "Enviar")
        }
    }

    AlertDialog(
        onDismissRequest = { },
        title = { Text(text = "ggggggggggggg")},
        text = { Text(text = "kmlkxfdklvlkjfv")},
        confirmButton = {
            TextButton(onClick = { }) {
                Text(text = "OK")
            }
        }
    )

}

