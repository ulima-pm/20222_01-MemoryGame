package pe.edu.ulima.itlab.memoriagame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.ulima.itlab.memoriagame.model.Board

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val board = Board(2, 2)
        board.printBoard()
    }
}