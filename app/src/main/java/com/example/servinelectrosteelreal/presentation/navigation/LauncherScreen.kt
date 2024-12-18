package com.example.servinelectrosteelreal.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.servinelectrosteelreal.R

sealed class LauncherScreen(
    val route: String,
    @StringRes
    val title: Int = R.string.app_name,
    val navIcon: (@Composable () -> Unit) = {
        Icon(
            Icons.Filled.Home, contentDescription = "home"
        )
    },
    val objectName: String = "",
    val objectPath: String = ""
) {

   data object Requests : LauncherScreen("requests_screen")
   data object AssignRequests : LauncherScreen("assign_requests_screen")

   data object DetailRequest :
        LauncherScreen("detail_request_screen", objectName = "requestId", objectPath = "/{requestId}")


    // Bottom Navigation
   data object RequestsNav :
        LauncherScreen("requests_screen", title = R.string.requests, navIcon = {
            Icon(
                Icons.Filled.List,
                contentDescription = stringResource(R.string.requests),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .offset(x = 10.dp)
            )
        })
    data object AssignRequestNav :
        LauncherScreen("assign_requests_screen", title = R.string.assignRequests, navIcon = {
            Icon(
                Icons.Filled.Send,
                contentDescription = stringResource(R.string.assignRequests),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .offset(x = 10.dp)
            )
        })
}