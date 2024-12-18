package com.example.servinelectrosteelreal.presentation.screens.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.unit.sp

@Composable
fun GradientButton(
    navController: NavController,
    gradientColors: List<Color>,
    nameButton: String,
    roundedCornerShape: androidx.compose.foundation.shape.RoundedCornerShape
) {
    Button(
        onClick = {
            navController.popBackStack()
            navController.navigate("main_screen") {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        contentPadding = PaddingValues(),
        shape = roundedCornerShape
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(colors = gradientColors),
                    shape = roundedCornerShape
                )
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = nameButton, fontSize = 18.sp, color = Color.White)
        }
    }
}




