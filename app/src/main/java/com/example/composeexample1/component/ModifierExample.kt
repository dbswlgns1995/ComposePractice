package com.example.composeexample1.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun ModifierExample() {
    Button(
        onClick = {},
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
           imageVector = Icons.Filled.Search,
           contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierHeightExample() {
    Button(
        onClick = {},
        modifier = Modifier.height(100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierWidthHeightExample() {
    Button(
        onClick = {},
        modifier = Modifier
            .width(200.dp)
            .height(100.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierSizeExample() {
    Button(
        onClick = {},
        modifier = Modifier
            .size(100.dp, 200.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierColorExample() {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        ),
        onClick = {},
        modifier = Modifier
            .size(200.dp, 200.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierPaddingExample() {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        ),
        onClick = {},
        modifier = Modifier
            .padding(100.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search")
    }
}

@Composable
fun ModifierClickableExample() {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        ),
        onClick = {},
        enabled = false,
        modifier = Modifier
            .padding(100.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search",
            modifier = Modifier.clickable {

            }
        )
    }
}

@Composable
fun ModifierOffsetExample() {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        ),
        onClick = {},
        modifier = Modifier
            .padding(100.dp),
        shape = RectangleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Search",
            modifier = Modifier.offset(
                x = 10.dp,
                y = 20.dp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultModifierPreview() {
    ComposeExample1Theme {
        ModifierOffsetExample()
    }
}
