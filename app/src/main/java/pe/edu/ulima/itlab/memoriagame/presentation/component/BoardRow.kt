package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoardRow() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        BoardBox(
            modifier = Modifier.weight(1f)
                .height(100.dp)
        )
        BoardBox(
            modifier = Modifier.weight(1f)
                .height(100.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowBoardRow() {
    BoardRow()
}