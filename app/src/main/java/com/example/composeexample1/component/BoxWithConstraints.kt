package com.example.composeexample1.component

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun Outer() {
    Column {
        Inner(
            modifier = Modifier
                .widthIn(
                    min = 100.dp,
                    max = 350.dp
                )
                .heightIn(
                    min = 50.dp
                )
        )
    }
}

@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier) {
        Text("maxW: $maxWidth maxH: $maxHeight minW: $minWidth minH: $minHeight")
    }
}

// BoxWithConstraints
// 길이에 맞춰 유동적으로 width 가 얼마 이상일 때 무엇을 넣겠다. 등에 사용
@Preview(showBackground = true)
@Composable
private fun DefaultBoxWithConstraintsPreview() {
    ComposeExample1Theme {
        Outer()
    }
}
