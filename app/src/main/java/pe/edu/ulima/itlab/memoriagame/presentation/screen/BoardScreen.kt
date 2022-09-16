package pe.edu.ulima.itlab.memoriagame.presentation.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.itlab.memoriagame.presentation.component.Board
import pe.edu.ulima.itlab.memoriagame.presentation.component.Header

val boxOnClick : (Int, Int) -> Unit = { row, col ->
    Log.i("BoardScreen", "($row,$col")
}

@Composable
fun BoardScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Header()
        Board(
            6,
            4,
            boxOnClick
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowBoardScreen() {
    BoardScreen()
}