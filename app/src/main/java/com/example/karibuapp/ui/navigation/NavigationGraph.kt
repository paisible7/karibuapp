package com.example.karibuapp.ui.navigation

import android.os.BaseBundle
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.karibuapp.HomeScreen
import com.example.karibuapp.KaribuApp
import com.example.karibuapp.KaribuApp
import kotlin.let
import kotlin.text.toIntOrNull

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("principal_screen") { backStackEntry ->
            KaribuApp(navController)
        }
    }
}