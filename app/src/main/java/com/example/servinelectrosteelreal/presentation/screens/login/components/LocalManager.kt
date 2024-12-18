package com.example.servinelectrosteelreal.presentation.screens.login.components

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import java.util.Locale




object LocaleManager {

    private const val LANGUAGE_KEY = "selected_language"

    fun toggleLocale(context: Context, languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)

        context.resources.updateConfiguration(config, context.resources.displayMetrics)

        // Save the selected language to SharedPreferences
        val sharedPreferences = context.getSharedPreferences("AppPreferences", Context.MODE_PRIVATE)
        sharedPreferences.edit().putString(LANGUAGE_KEY, languageCode).apply()
    }

    fun getCurrentLanguage(context: Context): String {
        val sharedPreferences = context.getSharedPreferences("AppPreferences", Context.MODE_PRIVATE)
        return sharedPreferences.getString(LANGUAGE_KEY, Locale.getDefault().language) ?: Locale.getDefault().language
    }

    fun restartActivity(context: Context) {
        val intent = (context as Activity).intent
        context.finish()
        context.startActivity(intent)
    }

    fun toggleLocaleAndRestart(context: Context, languageCode: String) {
        val currentLanguage = getCurrentLanguage(context)

        // Only restart if the selected language is different
        if (currentLanguage != languageCode) {
            toggleLocale(context, languageCode)
            restartActivity(context)
        }
    }
}
