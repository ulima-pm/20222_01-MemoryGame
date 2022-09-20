package pe.edu.ulima.itlab.memoriagame.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.ulima.itlab.memoriagame.model.BoxData

@Composable
fun BoardRow(
    numCols : Int,
    row : Int,
    modifier : Modifier,
    listBoxData : Array<BoxData>,
    onClick : (Int, Int) -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        (0 until numCols).mapIndexed { index, _ ->
            BoardBox(
                modifier = Modifier.weight(1f)
                    .fillMaxHeight(),
                onClick = onClick,
                row = row,
                col = index,
                boxData = listBoxData[index]
            )
        }
    }
}