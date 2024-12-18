package com.example.servinelectrosteelreal.presentation.screens.splashscreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.servinelectrosteelreal.presentation.navigation.NavigationScreen
@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(50)
        navController.navigate(NavigationScreen.Login.route) {
            popUpTo(NavigationScreen.Splash.route) { inclusive = true }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hallo Auf SplashScreen")
    }
}


