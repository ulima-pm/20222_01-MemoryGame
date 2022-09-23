package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun SettingsForm(
    numRowsValue : String,
    numColsValue : String,
    onNumRowsValueChange : (String) -> Unit,
    onNumColsValueChange : (String) -> Unit,
    onGuardarClick : () -> Unit
){


    Column() {
        OutlinedTextField(
            value = numRowsValue,
            onValueChange = onNumRowsValueChange,
            label = {
                Text(text = "Número de filas")
            }
        )
        OutlinedTextField(
            value = numColsValue,
            onValueChange = onNumColsValueChange,
            label = {
                Text(text = "Número de columnas")
            }
        )
        Button(
            onClick = onGuardarClick
        ) {
            Text(text = "Guardar")
        }
    }
}