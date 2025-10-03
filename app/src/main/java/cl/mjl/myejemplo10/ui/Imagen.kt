package cl.mjl.myejemplo10.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import cl.mjl.myejemplo10.R

@Composable
fun Imagen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Pagina Numero Uno")
        Text(text = "8 de agosto, dia del Gato")
        Image (
            painter = painterResource(id = R.drawable.gatitos),
            contentDescription = "Imagen de gatitos",
            contentScale = ContentScale.Crop
        )
    }
}