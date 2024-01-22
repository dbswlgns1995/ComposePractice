package com.example.composeexample1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.component.*
import com.example.composeexample1.component2.*
import com.example.composeexample1.ui.theme.ComposeExample1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Animation2Example()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeExample1Theme {
        Greeting("Android")
    }
}
