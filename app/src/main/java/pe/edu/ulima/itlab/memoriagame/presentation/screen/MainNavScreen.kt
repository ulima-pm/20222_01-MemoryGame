package pe.edu.ulima.itlab.memoriagame.presentation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavScreen(
    navController : NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "settings"
    ){
        composable("settings") {
            SettingsScreen { numRows, numCols ->
                navController.navigate("board")
            }
        }
        composable("board") {
            BoardScreen(numCols = 4, numRows = 6 )
        }
    }
}