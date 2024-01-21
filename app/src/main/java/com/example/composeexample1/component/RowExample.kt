package com.example.composeexample1.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun RowExample() {
    Row(modifier = Modifier.height(60.dp)) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
        Text(text = "세 번째!", modifier = Modifier.align(Alignment.Bottom))
    }
}

@Composable
private fun RowVerticallyAlignmentExample() {
    Row(
        modifier = Modifier
            .width(200.dp)
            .height(60.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End
    ) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
        Text(text = "세 번째!")
    }
}

@Composable
private fun RowWeightExample() {
    Row(
        modifier = Modifier
            .width(200.dp)
            .height(60.dp),
        verticalAlignment = Alignment.Bottom,
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier
                .align(Alignment.Top)
                .weight(3f)
        )
        Icon(
            imageVector = Icons.Filled.ThumbUp,
            contentDescription = "추가"
        )
        Text(
            text = "두 번째!",
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(2f)
        )
        Text(
            text = "세 번째!",
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultRowPreview() {
    ComposeExample1Theme {
        RowWeightExample()
    }
}
