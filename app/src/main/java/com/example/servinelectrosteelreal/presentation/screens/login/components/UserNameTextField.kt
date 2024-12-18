package com.example.servinelectrosteelreal.presentation.screens.login.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.servinelectrosteelreal.R

@Composable
fun UserNameTextField() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = stringResource(R.string.userName)) },
        placeholder = { Text(text = stringResource(R.string.userNameDescription)) },
        shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next,
            keyboardType = KeyboardType.Text
        ),
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(bottom = 8.dp)
    )
}