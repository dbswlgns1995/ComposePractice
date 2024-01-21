package com.example.composeexample1.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun ColumnExample() {
    Column(
        modifier = Modifier
            .width(100.dp)
            .height(200.dp),
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier
        )
        Text(
            text = "두 번째!",
            modifier = Modifier
        )
        Text(
            text = "세 번째!",
            modifier = Modifier
        )
    }
}

@Composable
private fun ColumnVerticalAlignmentExample() {
    Column(
        modifier = Modifier
            .size(100.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier
        )
        Text(
            text = "두 번째!",
            modifier = Modifier
        )
        Text(
            text = "세 번째!",
            modifier = Modifier
        )
    }
}

@Composable
private fun ColumnTextAlignmentExample() {
    Column(
        modifier = Modifier
            .size(100.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier.
                    align(Alignment.Start)
        )
        Text(
            text = "두 번째!",
            modifier = Modifier
        )
        Text(
            text = "세 번째!",
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultColumnPreview() {
    ComposeExample1Theme {
        ColumnTextAlignmentExample()
    }
}
