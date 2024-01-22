package com.example.composeexample1.component2

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarExample() {


    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        bottomBar = {
            BottomAppBar(
                icons = {
                        Text(
                            "hello",
                            modifier = Modifier.padding(end = 16.dp)
                        )
                        Button(onClick = {
                            scope.launch {
                                snackBarHostState.showSnackbar(
                                    "Hello!"
                                )
                            }
                        }) {
                            Text("Say Hello")
                        }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* do something */ },
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )
        }
    ) {
        Text("")
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        BottomAppBarExample()
    }
}
