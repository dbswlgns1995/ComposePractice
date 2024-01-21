package com.example.composeexample1.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.R
import com.example.composeexample1.ui.theme.ComposeExample1Theme


@Composable
private fun ImageExample() {
    Column {
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)

        Image(imageVector = Icons.Filled.Settings, contentDescription = null)
    }   
    
}

@Preview(showBackground = true)
@Composable
private fun DefaultImagePreview() {
    ComposeExample1Theme {
        ImageExample()
    }
}
