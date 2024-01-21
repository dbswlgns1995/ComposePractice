package com.example.composeexample1.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun TextFieldExample() {
    var name by remember {
        mutableStateOf("Tom")
    }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = name,
            label = {
                    Text(text = "이름")
            },
            onValueChange = { name = it },
        )
    }
}

@Composable
fun OutLineTextFieldExample() {
    var name by remember {
        mutableStateOf("이름")
    }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = name,
            label = {
                Text(text = "이름")
            },
            onValueChange = { name = it },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultTextFieldPreview() {
    ComposeExample1Theme {
        OutLineTextFieldExample()
    }
}
