package com.example.composeexample1.component2

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RadioButtonWithText(
    text: String,
    color: Color = Color.Black,
    selected: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier.selectable(
            selected = selected,
            onClick = onClick
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = onClick)
        Text(text = text, color = color)
    }
}

@Composable
fun Animation2Example() {
    var isDarkMode by remember { mutableStateOf(false) }

    val transition = updateTransition(targetState = isDarkMode, label = "Dark Mode Animation")

    val backgroundColor by transition.animateColor(label = "Dark Mode Background Color Animation") { state ->
        when (state) {
            false -> Color.White
            true -> Color.Black
        }
    }

    val textColor by transition.animateColor(label = "Dark Mode Background Color Animation") { state ->
        when (state) {
            false -> Color.Black
            true -> Color.White
        }
    }

    Column(
        modifier = Modifier.background(backgroundColor)
    ) {
        RadioButtonWithText(text = "일반 모드", selected = !isDarkMode, color = textColor) {
            isDarkMode = false
        }
        RadioButtonWithText(text = "다크 모드", selected = isDarkMode, color = textColor) {
            isDarkMode = true
        }



        Crossfade(targetState = isDarkMode) {state ->
            when(state) {
                false -> {
                    Row {
                        Box(
                            modifier = Modifier
                                .background(Color.Red)
                                .size(80.dp)
                        ) {
                            Text("1")
                        }
                        Box(
                            modifier = Modifier
                                .background(Color.Magenta)
                                .size(80.dp)
                        ) {
                            Text("2")
                        }
                        Box(
                            modifier = Modifier
                                .background(Color.Blue)
                                .size(80.dp)
                        ) {
                            Text("3")
                        }
                    }
                }
                true -> {
                    Column {
                        Box(
                            modifier = Modifier
                                .background(Color.Red)
                                .size(80.dp)
                        ) {
                            Text("1")
                        }
                        Box(
                            modifier = Modifier
                                .background(Color.Magenta)
                                .size(80.dp)
                        ) {
                            Text("2")
                        }
                        Box(
                            modifier = Modifier
                                .background(Color.Blue)
                                .size(80.dp)
                        ) {
                            Text("3")
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreView() {
    ComposeExample1Theme() {
        Animation2Example()
    }
}