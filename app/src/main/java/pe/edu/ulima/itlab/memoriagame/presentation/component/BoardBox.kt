package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoardBox(
    modifier : Modifier
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier.padding(
            start = 8.dp,
            end = 8.dp
        )
    ) {
        Text(text = "PM")
    }
}