package com.example.servinelectrosteelreal.presentation.screens.login.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalLayoutDirection

@Composable
fun LayoutProvider(isRtl: Boolean, content: @Composable () -> Unit) {
    val context = LocalContext.current
    val layoutDirection = if (isRtl) LayoutDirection.Rtl else LayoutDirection.Ltr

    CompositionLocalProvider(LocalLayoutDirection provides layoutDirection) {

        content()

        LaunchedEffect(isRtl) {
            LocaleManager.toggleLocaleAndRestart(context, if (isRtl) "fa" else "en")
        }
    }


}
