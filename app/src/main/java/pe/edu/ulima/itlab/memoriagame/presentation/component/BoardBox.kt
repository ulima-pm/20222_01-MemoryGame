package pe.edu.ulima.itlab.memoriagame.presentation.component

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.edu.ulima.itlab.memoriagame.model.BoxData

@Composable
fun BoardBox(
    row : Int,
    col : Int,
    modifier : Modifier,
    boxData : MutableState<BoxData>,
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
        if (!boxData.value.isShown) {
            Text(text = "PM")
        }else {
            Text(
                text = String(
                    Character.toChars(
                        boxData.value.emoji.emojiValue
                    )
                )
            )
        }

    }
}