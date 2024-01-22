package com.example.composeexample1.component2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun CanvasExample() {
    Canvas(modifier = Modifier.size(20.dp)) {
        drawLine(Color.Green, Offset(10f, 10f), Offset(50f, 10f))
        
        drawCircle(Color.Yellow, 10f, Offset(15f, 30f))

        drawRect(Color.Magenta, Offset(30f, 30f), Size(10f, 10f))

        Icons.Filled.Send


    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        CanvasExample()
    }
}
