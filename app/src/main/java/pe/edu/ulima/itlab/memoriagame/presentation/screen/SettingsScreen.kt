package pe.edu.ulima.itlab.memoriagame.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import pe.edu.ulima.itlab.memoriagame.presentation.component.Header
import pe.edu.ulima.itlab.memoriagame.presentation.component.SettingsForm

@Composable
fun SettingsScreen() {
    // Variable de estado
    val numRows = remember {
        mutableStateOf("")
    }

    val numCols = remember {
        mutableStateOf("")
    }

    Column {
        Header()
        SettingsForm(
            numRowsValue = numRows.value,
            numColsValue = numCols.value,
            onNumRowsValueChange = {
                numRows.value = it
            },
            onNumColsValueChange = {
                numCols.value = it
            },
            onGuardarClick = {
                // Cambiar a nueva pantalla
            }
        )
    }

}