package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import pe.edu.ulima.itlab.memoriagame.model.BoxData

@Composable
fun Board(
    numRows : Int,
    numCols : Int,
    rowsData : Array<Array<MutableState<BoxData>>>,
    boxOnClick : (Int, Int) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        (0 until numRows).mapIndexed { index, _ ->
            BoardRow(
                numCols = numCols,
                modifier = Modifier.weight(1f),
                onClick = boxOnClick,
                row = index,
                listBoxData = rowsData[index]
            )
        }
    }
}






