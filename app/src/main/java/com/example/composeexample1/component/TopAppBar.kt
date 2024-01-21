package com.example.composeexample1.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun TopAppBarExample() {
    Column {
        SmallTopAppBar(
            title = { Text("TopAppBar") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = null)
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = null)
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.AccountBox, contentDescription = null)
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultTopAppBarPreview() {
    ComposeExample1Theme {
        TopAppBarExample()
    }
}
