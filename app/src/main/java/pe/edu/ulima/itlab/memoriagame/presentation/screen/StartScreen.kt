package pe.edu.ulima.itlab.memoriagame.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartScreen(
    cambiarAMain : (nombre : String) -> Unit,
    cambiarABoard : (nombre : String) -> Unit
) {
    // Variable de estado
    val nombre = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = nombre.value,
            onValueChange = { nombre.value = it },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Button(
            onClick = {
                cambiarAMain(nombre.value)
            },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        ) {
            Text(text = "MainActivity")
        }
        Button(
            onClick = {
                cambiarABoard(nombre.value)
            },
            modifier = Modifier.fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        ) {
            Text(text = "BoardActivity")
        }
    }
}