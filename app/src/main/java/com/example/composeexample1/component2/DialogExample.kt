package com.example.composeexample1.component2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun DialogExample() {

    var openDialog by remember { mutableStateOf(false) }
    var counter by remember { mutableStateOf(0) }

    Column {
        Button(onClick = { openDialog = !openDialog }) {
            Text("다이얼로그 열기")
        }
        Text("카운터: $counter")
    }

    if (openDialog) {
        AlertDialog(onDismissRequest = {
            openDialog = false
        }, confirmButton = {
            Button(onClick = {
                counter++
                openDialog = false
            }) {
                Text("Add")
            }
        }, dismissButton = {
            Button(onClick = {
                openDialog = false
            }) {
                Text("Cancel")
            }
        }, title = {
            Text("Title")
        }, text = {
            Text("Description")
        })
    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        DialogExample()
    }
}
