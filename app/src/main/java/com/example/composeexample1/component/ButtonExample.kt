package com.example.composeexample1.component

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
private fun ButtonSimple(onButtonClicked: () -> Unit) {
    Button(onClick = {  }) {
        Text(text = "Send")
    }
}

@Composable
private fun ButtonIconExample(onButtonClicked: () -> Unit) {
    Button(onClick = {  }) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Text(text = "Send")
    }
}

@Composable
private fun ButtonSpacerExample(onButtonClicked: () -> Unit) {
    Button(onClick = {  }) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Composable
private fun ButtonEnabledExample(onButtonClicked: () -> Unit) {
    Button(
        onClick = {  },
        enabled = false
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Composable
private fun ButtonBorderStrokeExample(onButtonClicked: () -> Unit) {
    Button(
        onClick = {  },
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Composable
private fun ButtonShapeExample(onButtonClicked: () -> Unit) {
    Button(
        onClick = {  },
        shape = RoundedCornerShape(10.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Composable
private fun ButtonContentPaddingExample(onButtonClicked: () -> Unit) {
    Button(
        onClick = {  },
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp),
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultButtonPreview() {
    ComposeExample1Theme {
        ButtonContentPaddingExample {
            Log.e("123", "Send Clicked")
        }
    }
}
