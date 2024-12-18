package com.example.servinelectrosteelreal.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.servinelectrosteelreal.presentation.screens.mainscreen.MainScreen
import com.example.servinelectrosteelreal.presentation.screens.login.LoginScreen
import com.example.servinelectrosteelreal.presentation.screens.splashscreen.SplashScreen


@Composable
fun Navigation(
    navController: NavHostController, modifier: Modifier = Modifier
) {
    NavHost(navController, startDestination = NavigationScreen.Splash.route, modifier) {
        composable(NavigationScreen.Splash.route) {
            SplashScreen(navController)
        }
        composable(NavigationScreen.Login.route) {
            LoginScreen(navController)
        }

        composable(NavigationScreen.Main.route) {
            MainScreen()
        }

    }
}