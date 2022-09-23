package pe.edu.ulima.itlab.memoriagame.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class Board(numRows : Int, numCols : Int) {
    var rows : Array<Array<MutableState<BoxData>>>

    init {
        rows = Array<Array<MutableState<BoxData>>>(numRows) { _ ->
            arrayOf()
        }

        for (i in 0..(numRows - 1)) {
            rows[i] = Array<MutableState<BoxData>>(numCols){
                mutableStateOf(BoxData(Emoji.ALIEN, false))
            }
        }
    }

    fun printBoard() {
        rows.forEach {
            it.forEach {
                print("${it.value.emoji} ")
            }
            println()
        }
    }

    fun getValue(posRow : Int,
                 posCol : Int) : MutableState<BoxData>? {
        if (posRow >= rows.size) return null
        if (posCol >= rows[0].size) return null
        if (posRow < 0) return null
        if (posCol < 0) return null

        return rows[posRow][posCol]
    }
}