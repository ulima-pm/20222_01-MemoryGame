package pe.edu.ulima.itlab.memoriagame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import pe.edu.ulima.itlab.memoriagame.model.Board

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val board = Board(2, 2)

        val but0_0 = findViewById<Button>(R.id.but0_0)
        val but0_1 = findViewById<Button>(R.id.but0_1)
        val but1_0 = findViewById<Button>(R.id.but1_0)
        val but1_1 = findViewById<Button>(R.id.but1_1)

        val boxOnClickListener : (view : View) -> Unit = { view ->
            // Se va a ejecutar al hacer click

            val viewIdStr = view.resources.getResourceName(view.id)
                .split("/")[1]
            val cad = viewIdStr.substring(3) // ejm: 0_1
            val arrCoordenadas = cad.split("_")
            val row = arrCoordenadas[0].toInt()
            val col = arrCoordenadas[1].toInt()

            val data = board.getValue(row, col)
            if (data != null) {
                (view as Button).text =
                    String(Character.toChars(data.value.emoji.emojiValue))
            }

            Log.i("MainActivity", "Se hizo click: $viewIdStr")
        }

        but0_0.setOnClickListener(boxOnClickListener)
        but0_1.setOnClickListener(boxOnClickListener)
        but1_0.setOnClickListener(boxOnClickListener)
        but1_1.setOnClickListener(boxOnClickListener)

    }
}