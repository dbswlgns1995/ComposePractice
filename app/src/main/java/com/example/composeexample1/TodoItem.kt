package com.example.composeexample1

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoItem(
    todoData: TodoData,
    onEdit: (key: Int, text: String) -> Unit = { _, _ -> },
    onToggle: (key: Int, checked: Boolean) -> Unit = { _, _ -> },
    onDelete: (key: Int) -> Unit = {}
) {
    var isEditing by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier.padding(4.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {

        Crossfade(targetState = isEditing) { state ->
            when(state) {
                false -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text(
                            text = todoData.text,
                            modifier = Modifier.
                            weight(1f)
                        )
                        Text(
                            text = "완료"
                        )
                        Checkbox(checked = todoData.done, onCheckedChange = { checked -> onToggle(todoData.key, checked) })
                        Button(onClick = {
                            isEditing = true
                        }) {
                            Text("수정")
                        }
                        Spacer(modifier = Modifier.size(4.dp))
                        Button(onClick = {
                            onDelete(todoData.key)
                        }) {
                            Text("삭제")
                        }
                    }
                }
                true -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(8.dp)
                    ) {
                        var (newText, setNewText) = remember {
                            mutableStateOf(todoData.text)
                        }
                        OutlinedTextField(
                            value = newText,
                            onValueChange = setNewText,
                            modifier = Modifier.weight(1f)
                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        Button(onClick = {
                            onEdit(todoData.key, newText)
                            isEditing = false
                        }) {
                            Text("완료")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TodoItemPreview() {
    ComposeExample1Theme {
        TodoItem(TodoData(1, "nice", true))
    }
}
