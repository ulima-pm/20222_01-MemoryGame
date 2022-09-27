package pe.edu.ulima.itlab.memoriagame

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.itlab.memoriagame.presentation.screen.BoardScreen
import pe.edu.ulima.itlab.memoriagame.presentation.screen.MainNavScreen
import pe.edu.ulima.itlab.memoriagame.presentation.screen.SettingsScreen
import pe.edu.ulima.itlab.memoriagame.ui.theme.MemoriaGameTheme

class BoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nombre = intent.getStringExtra("NOMBRE")
        Log.i("BoardActivity", nombre!!)

        setContent {
            MainNavScreen()
        }
    }
}


