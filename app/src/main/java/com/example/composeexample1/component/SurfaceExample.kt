package com.example.composeexample1.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun SurfaceExample() {
    Surface(
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp
    ) {
        Text(
            text = "hello",
            modifier = Modifier.padding(5.dp),
        )
    }
}

@Composable
private fun SurfaceBorderExample() {
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta,
        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp
    ) {
        Text(
            text = "hello",
            modifier = Modifier.padding(5.dp),
        )
    }
}

@Composable
private fun SurfaceShapeExample() {
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta,
        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp,
        shape = CircleShape
    ) {
        Text(
            text = "hello",
            modifier = Modifier.padding(5.dp),
        )
    }
}

@Composable
private fun SurfaceColorExample() {
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta,
        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp,
        shape = CircleShape,
        color = MaterialTheme.colorScheme.primary
    ) {
        Text(
            text = "hello",
            modifier = Modifier.padding(5.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultTextPreview() {
    ComposeExample1Theme {
        SurfaceColorExample()
    }
}
