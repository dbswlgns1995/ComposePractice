package com.example.composeexample1.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxWithText(
    checked: MutableState<Boolean>,
    content: @Composable () -> Unit,
) {

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                checked.value = !checked.value
            }
        ) {
            Checkbox(
                checked = checked.value,
                onCheckedChange = { checked.value = it }
            )
            content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxWithSlot(
    checked: MutableState<Boolean>,
    content: @Composable RowScope.() -> Unit,
) {

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                checked.value = !checked.value
            }
        ) {
            Checkbox(
                checked = checked.value,
                onCheckedChange = { checked.value = it }
            )
            content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxWithSlotState(
    checked: Boolean,
    onCheckedChange: () -> Unit,
    content: @Composable RowScope.() -> Unit,
) {

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                onCheckedChange()
            }
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { onCheckedChange() }
            )
            content()
        }
    }
}

@Composable
fun SlotApiExample() {
    val checked = remember {
        mutableStateOf(false)
    }
    var checked2 by remember {
        mutableStateOf(false)
    }

    Column {
        CheckBoxWithSlot(checked = checked) {
            Text(
                text = "체크 박스",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        CheckBoxWithSlotState(
            checked = checked2,
            onCheckedChange = {checked2 = !checked2}
        )  {
            Text(
                text = "체크 박스2",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultSlotApiPreview() {
    ComposeExample1Theme {
        SlotApiExample()
    }
}
