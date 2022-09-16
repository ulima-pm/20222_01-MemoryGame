package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Board() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        BoardRow()
        BoardRow()
    }
}