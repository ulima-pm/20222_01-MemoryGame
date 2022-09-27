package pe.edu.ulima.itlab.memoriagame

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pe.edu.ulima.itlab.memoriagame.presentation.screen.StartScreen

class StartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            StartScreen(
                cambiarAMain = { nombre ->
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("NOMBRE", nombre)
                    startActivity(intent)
                },
                cambiarABoard = { nombre ->
                    val intent = Intent(this, BoardActivity::class.java)
                    intent.putExtra("NOMBRE", nombre)
                    startActivity(intent)
                }
            )
        }
    }
}