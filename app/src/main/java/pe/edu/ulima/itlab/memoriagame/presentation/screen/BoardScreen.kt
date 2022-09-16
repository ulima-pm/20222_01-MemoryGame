package pe.edu.ulima.itlab.memoriagame.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.itlab.memoriagame.presentation.component.Board
import pe.edu.ulima.itlab.memoriagame.presentation.component.Header

@Composable
fun BoardScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Header()
        Board()
    }
}

@Composable
@Preview(showBackground = true)
fun ShowBoardScreen() {
    BoardScreen()
}