package com.example.servinelectrosteelreal.presentation.screens.login

import androidx.compose.runtime.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

import com.example.servinelectrosteelreal.presentation.screens.login.components.LayoutProvider
import com.example.servinelectrosteelreal.presentation.screens.login.components.LocaleManager
import com.example.servinelectrosteelreal.presentation.screens.login.components.LoginForm
import com.example.servinelectrosteelreal.presentation.screens.login.components.LoginHeader

@Composable
fun LoginScreen(navController: NavController) {

    val context = LocalContext.current
    val currentLanguage = LocaleManager.getCurrentLanguage(context)
    var isRtl by remember { mutableStateOf(currentLanguage == "fa") }
    LayoutProvider(isRtl = isRtl) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginHeader(
                isRtl = isRtl,
                onLanguageChange = { isRtl = it }
            )
            Spacer(modifier = Modifier.height(30.dp))
            LoginForm(navController)
        }
    }
}



