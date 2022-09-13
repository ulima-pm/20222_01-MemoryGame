package pe.edu.ulima.itlab.memoriagame

import android.os.Bundle
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
import pe.edu.ulima.itlab.memoriagame.ui.theme.MemoriaGameTheme

class BoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Texto()
        }
    }
}

@Composable
fun Texto() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Hola Android Compose",
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Hola Android Compose",
            modifier = Modifier.weight(1f)
        )
        Row(
            modifier = Modifier.fillMaxWidth()
                .weight(2f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
            ) {
                Text("Boton1")
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f)
            ) {
                Text("Boton2")
            }
        }
    }

}

@Composable
@Preview(showBackground = true)
fun ShowTexto() {
    Texto()
}
