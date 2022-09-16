package pe.edu.ulima.itlab.memoriagame.presentation.component

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoardBox(
    row : Int,
    col : Int,
    modifier : Modifier,
    onClick : (Int, Int) -> Unit
) {
    Button(
        onClick = {
            onClick(row, col)
        },
        modifier = modifier.padding(
            start = 8.dp,
            end = 8.dp
        )
    ) {
        Text(text = "PM")
    }
}