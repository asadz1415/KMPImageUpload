package org.image.project

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.image.project.mainScreen.DashboardScreenFlow
import org.image.project.mainScreen.ImageGalleryScreenFlow
import org.image.project.mainScreen.TakeImageScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi


@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Dashboard.route) {
        composable(Screen.Dashboard.route) {
            DashboardScreenFlow {
                navController.navigate(it)
            }
        }

        composable(route = Screen.CaptureImage.route) { backStackEntry ->
            TakeImageScreen() {
                navController.navigate(it)
            }
        }

        composable(route = Screen.ImageGallery.route) { backStackEntry ->
            ImageGalleryScreenFlow() {
                navController.navigate(it)
            }
        }
    }


}