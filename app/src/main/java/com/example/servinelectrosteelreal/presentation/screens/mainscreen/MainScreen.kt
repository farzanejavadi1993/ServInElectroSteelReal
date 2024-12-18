package com.example.servinelectrosteelreal.presentation.screens.mainscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.material3.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.servinelectrosteelreal.R
import com.example.servinelectrosteelreal.presentation.navigation.LauncherScreen
import com.example.servinelectrosteelreal.presentation.screens.detailscreen.DetailScreen
import com.example.servinelectrosteelreal.presentation.screens.requestscreen.RequestsScreen
import com.example.servinelectrosteelreal.presentation.screens.assignrequestscreen.AssignRequestScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {

                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = stringResource(R.string.requests)) },
                    label = { Text(stringResource(R.string.requests)) },
                    selected = false,
                    onClick = {
                        navController.navigate(LauncherScreen.Requests.route) {
                            launchSingleTop = true
                        }
                    }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = stringResource(R.string.assignRequests)) },
                    label = { Text(stringResource(R.string.assignRequests)) },
                    selected = false,
                    onClick = {
                        navController.navigate(LauncherScreen.AssignRequests.route) {
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = LauncherScreen.Requests.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(LauncherScreen.Requests.route) {
                RequestsScreen(navController = navController)
            }
            composable(LauncherScreen.AssignRequests.route) {
                AssignRequestScreen()
            }
            composable(LauncherScreen.DetailRequest.route) {
                DetailScreen()
            }
        }
    }
}
