package pe.edu.ulima.itlab.memoriagame.presentation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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
                navController.navigate("board/${numRows}/${numCols}")
            }
        }
        composable(
            "board/{numRows}/{numCols}",
            arguments = listOf(
                navArgument("numRows") {
                    type = NavType.IntType
                },
                navArgument("numCols") {
                    type = NavType.IntType
                }
            )
        ) {
            BoardScreen(
                numCols = it.arguments!!.getInt("numCols"),
                numRows = it.arguments!!.getInt("numRows")
            )
        }
    }
}