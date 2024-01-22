package com.example.composeexample1.component2

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme


@Composable
fun StateExample() {

    var pyeong by rememberSaveable {
        mutableStateOf("")
    }
    var squareMeter by remember {
        mutableStateOf("")
    }

    StateHoistingExample(
        pyeong,
        squareMeter,
    ) {
        if (it.isBlank()) {
            pyeong = ""
            squareMeter = ""
            return@StateHoistingExample
        }

        val numericValue = it.toFloatOrNull() ?: return@StateHoistingExample
        pyeong = it
        squareMeter = (numericValue * 3.306).toString()
    }


//    Column(modifier = Modifier.padding(16.dp)) {
//        OutlinedTextField(
//            value = pyeong,
//            onValueChange = {
//                if(it.isBlank()) {
//                    pyeong = ""
//                    squareMeter = ""
//                    return@OutlinedTextField
//                }
//                val numericValue = it.toFloatOrNull() ?: return@OutlinedTextField
//                pyeong = it
//                squareMeter = (numericValue * 3.306).toString()
//            }, label = {
//                Text("평")
//            }
//
//        )
//        OutlinedTextField(
//            value = squaremeter,
//            onValueChange = {
//
//            },
//            label = {
//                Text("제곱미터")
//            }
//        )
//    }

}

@Composable
fun StateHoistingExample(
    pyeong: String,
    squareMeter: String,
    onPyeongChange: (String) -> Unit,
) {
    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = pyeong,
            onValueChange = onPyeongChange,
            label = {
                Text("평")
            }

        )
        OutlinedTextField(
            value = squareMeter,
            onValueChange = {
            },
            label = {
                Text("제곱미터")
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        StateExample()
    }
}
