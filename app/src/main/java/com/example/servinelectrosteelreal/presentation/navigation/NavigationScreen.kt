package com.example.servinelectrosteelreal.presentation.navigation


sealed class NavigationScreen(
    val route: String
) {
    data object Splash : NavigationScreen("splash_screen")
    data object Main : NavigationScreen("main_screen")
    data object Login : NavigationScreen("login_screen")
}


