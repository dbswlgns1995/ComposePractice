package com.example.composeexample1.component2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun DropDownMenuExample() {
    var expandDropDownMenu by remember { mutableStateOf(false) }
    var counter by remember { mutableStateOf(0) }

    Column {
        Button(onClick = { expandDropDownMenu = true }) {
            Text("드롭다운 메뉴 열기")
        }
        Text("카운터: $counter")
    }
    
    DropdownMenu(expanded = expandDropDownMenu, onDismissRequest = { 
        expandDropDownMenu = false
    }) {
        DropdownMenuItem(text = { Text("+1") }, onClick = { counter++ })
        DropdownMenuItem(text = { Text("-1") }, onClick = { counter-- })
    }


}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeExample1Theme {
        DropDownMenuExample()
    }
}
