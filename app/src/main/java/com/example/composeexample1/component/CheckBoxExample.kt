package com.example.composeexample1.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxExample() {
    Row(verticalAlignment = Alignment.CenterVertically) {

        val checked = remember {
            mutableStateOf(false)
        }
        Checkbox(checked = checked.value, onCheckedChange = {
            checked.value = !checked.value
        })

        Text(text = "체크 박스?")
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxDelegatedPropertiesExample() {
    Row(verticalAlignment = Alignment.CenterVertically) {

        var checked by remember { mutableStateOf(true) }


        Checkbox(checked = checked, onCheckedChange = {
            checked = !checked
        })

        Text(text = "프로그래머입니까?")
    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultCheckBoxPreview() {
    ComposeExample1Theme {
        CheckBoxDelegatedPropertiesExample()
    }
}
