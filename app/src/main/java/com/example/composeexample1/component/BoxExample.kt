package com.example.composeexample1.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun BoxExample() {
    Box(modifier = Modifier.size(100.dp)) {
        Text(text = "Hello world1", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "Hello world2", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "Hello world3", modifier = Modifier.align(Alignment.TopEnd))
    }
}

@Composable
private fun BoxInnerBoxExample() {
    Box(modifier = Modifier.size(100.dp)) {
        Box(modifier = Modifier
            .size(70.dp)
            .background(Color.Cyan)
            .align(Alignment.CenterStart))
        Box(modifier = Modifier
            .size(70.dp)
            .background(Color.Yellow)
            .align(Alignment.BottomEnd))
    }
}

@Composable
private fun BoxMatchParent() {
    Box {
        Box(modifier = Modifier.fillMaxSize().background(Color.Cyan).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.Center))
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultBoxPreview() {
    ComposeExample1Theme {
        BoxMatchParent()
    }
}
