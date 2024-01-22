package com.example.composeexample1.component2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun CustomDialogExample() {

    var openDialog by remember { mutableStateOf(false) }
    var counter by remember { mutableStateOf(0) }

    Column {
        Button(onClick = { openDialog = !openDialog }) {
            Text("다이얼로그 열기")
        }
        Text("카운터: $counter")
    }

    if (openDialog) {
        Dialog(onDismissRequest = {
            openDialog = false
        }) {
            Surface {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text("Title")

                    Row(modifier = Modifier.align(Alignment.End)) {
                        Button(onClick = { openDialog = false }) {
                            Text("취소")
                        }

                        Button(onClick = {
                            openDialog = false
                            counter++
                        }) {
                            Text("+1")
                        }

                        Button(onClick = {
                            openDialog = false
                            counter--
                        }) {
                            Text("-1")
                        }


                    }

                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        CustomDialogExample()
    }
}
