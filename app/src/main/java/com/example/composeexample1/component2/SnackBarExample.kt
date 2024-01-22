package com.example.composeexample1.component2

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnackBarExample() {

    var counter by remember {
        mutableStateOf(0)
    }

    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()


    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) }
    ) {
        Button(onClick = {
            counter++

            scope.launch {
                val result = snackBarHostState.showSnackbar(
                    message = "카운터 : $counter",
                    actionLabel = "닫 기",
                    duration = SnackbarDuration.Short,
                    withDismissAction = false,
                )
                when (result) {
                    SnackbarResult.ActionPerformed -> {}
                    SnackbarResult.Dismissed -> {}
                }

            }
        }) {
            Text("Add")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        SnackBarExample()
    }
}
