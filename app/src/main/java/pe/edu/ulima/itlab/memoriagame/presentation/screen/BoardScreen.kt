package pe.edu.ulima.itlab.memoriagame.presentation.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.itlab.memoriagame.presentation.component.Board
import pe.edu.ulima.itlab.memoriagame.presentation.component.Header

@Composable
fun BoardScreen(
    numCols : Int,
    numRows : Int
) {
    // Variable de estado
    val board = remember {
        mutableStateOf(pe.edu.ulima.itlab.memoriagame.model.Board(
            numRows = numRows,
            numCols = numCols
        ))
    }

    val boxOnClick : (Int, Int) -> Unit = { row, col ->
        Log.i("BoardScreen", "($row,$col")
        board.value.rows[row][col].value =
            board.value.rows[row][col].value.copy(isShown = true)
    }


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Header()
        Board(
            numRows = numRows,
            numCols = numCols,
            rowsData = board.value.rows,
            boxOnClick
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowBoardScreen() {
    BoardScreen(4, 4)
}