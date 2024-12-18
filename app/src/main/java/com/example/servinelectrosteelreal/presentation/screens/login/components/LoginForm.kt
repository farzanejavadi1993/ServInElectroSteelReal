package com.example.servinelectrosteelreal.presentation.screens.login.components



import androidx.compose.foundation.layout.*
import androidx.compose.material3.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.servinelectrosteelreal.R


@Composable
fun LoginForm(navController: NavController) {
    Text(
        text = stringResource(R.string.signIn),
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(8.dp))

    UserNameTextField()

    Spacer(modifier = Modifier.height(8.dp))

    PasswordTextField()

    Spacer(modifier = Modifier.height(16.dp))

    GradientButton(
        navController = navController,
        gradientColors = listOf(
            androidx.compose.material3.MaterialTheme.colorScheme.tertiary,
            androidx.compose.material3.MaterialTheme.colorScheme.secondary
        ),
        nameButton = stringResource(R.string.login),
        roundedCornerShape = androidx.compose.foundation.shape.RoundedCornerShape(
            topStart = 30.dp, bottomEnd = 30.dp
        )
    )

    Spacer(modifier = Modifier.height(10.dp))

    TextButton(onClick = {
        navController.navigate("reset_page") {
            popUpTo(navController.graph.startDestinationId)
            launchSingleTop = true
        }
    }) {
        Text(text = stringResource(R.string.forgetPassword))
    }
}
