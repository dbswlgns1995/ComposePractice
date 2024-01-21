package com.example.composeexample1.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun TextSimple(name: String) {
    Text(text = "hello $name")
}

@Composable
private fun TextRed(name: String) {
    Text(color = Color.Red, text = "hello $name")
}

@Composable
private fun TextFontSize(name: String) {
    Text(color = Color.Red, fontSize = 30.sp, text = "hello $name")
}

@Composable
private fun TextFontWeight(name: String) {
    Text(color = Color.Red,
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        text = "hello $name"
    )
}

@Composable
private fun TextFontFamily(name: String) {
    Text(color = Color.Red,
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        text = "hello $name",
        fontFamily = FontFamily.Serif
    )
}

@Composable
private fun TextMaxLines(name: String) {
    Text(color = Color.Red,
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        text = "hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name",
        fontFamily = FontFamily.Serif,
        maxLines = 3
    )
}

@Composable
private fun TextDecorationExample(name: String) {
    Text(color = Color.Red,
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        text = "hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name",
        fontFamily = FontFamily.Serif,
        maxLines = 3,
        textDecoration = TextDecoration.Underline
    )
}

@Composable
private fun TextAlignExample(name: String) {
    Text(color = Color.Red,
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        text = "hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name hello $name",
        fontFamily = FontFamily.Serif,
        maxLines = 3,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultTextPreview() {
    ComposeExample1Theme {
        TextAlignExample(name = "zz")
    }
}
