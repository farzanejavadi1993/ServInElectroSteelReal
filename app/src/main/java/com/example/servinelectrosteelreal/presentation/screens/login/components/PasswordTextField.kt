package com.example.servinelectrosteelreal.presentation.screens.login.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import com.example.servinelectrosteelreal.R
@Composable
fun PasswordTextField() {
    var password by remember { mutableStateOf("") }
    var passwordHidden by remember { mutableStateOf(true) }

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text(text = stringResource(R.string.passWord)) },
        placeholder = { Text(text = stringResource(R.string.passWordDescription)) },
        shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
        visualTransformation =
        if (passwordHidden)
            PasswordVisualTransformation()
        else
            VisualTransformation.None,

        trailingIcon = {
            IconButton(onClick = { passwordHidden = !passwordHidden }) {
                Icon(
                    imageVector = if (passwordHidden) Icons.Default.Clear
                    else Icons.Default.Done,
                    contentDescription = if (passwordHidden) "Show password" else "Hide password"
                )
            }
        },

        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Password
        ),

        modifier = Modifier
            .fillMaxWidth(0.8f)
    )
}
