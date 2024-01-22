package com.example.composeexample1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample1.component.*
import com.example.composeexample1.component2.*
import com.example.composeexample1.ui.theme.ComposeExample1Theme

/**
 * todoList with no DB
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExample1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopLevel()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopLevel() {
    val (text, setText) = remember { mutableStateOf("") }
    val toDoList = remember { mutableStateListOf<TodoData>() }
    val onSubmit: (String) -> Unit = { text ->
        val key = (toDoList.lastOrNull()?.key ?: 0) + 1
        toDoList.add(
            TodoData(key,text)
        )
        setText("")
    }
    val onToggle: (Int, Boolean) -> Unit = { key, checked ->
        val i = toDoList.indexOfFirst { it.key == key }
        toDoList[i] = toDoList[i].copy( done = checked )
    }
    val onDelete: (Int) -> Unit = { key ->
        val i = toDoList.indexOfFirst { it.key == key }
        toDoList.removeAt(i)
    }
    val onEdit: (Int, String) -> Unit = { key, text ->
        val i = toDoList.indexOfFirst { it.key == key }
        toDoList[i] = toDoList[i].copy( text = text )
    }

    Scaffold {
        Column {
            ToDoInput(
                text = text,
                onTextChange = setText,
                onSubmit = onSubmit,
            )

            LazyColumn {
                items(toDoList, key = { it.key }) {todoData ->
                    TodoItem(
                        todoData = todoData,
                        onToggle = onToggle,
                        onDelete = onDelete,
                        onEdit = onEdit
                    )
                }
            }
        }
    }
}

@Composable
fun ToDoInput(
    text: String,
    onTextChange: (String) -> Unit,
    onSubmit: (String) -> Unit
) {
    Row(modifier = Modifier.padding(8.dp)) {
        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {
            onSubmit(text)
        }) {
            Text("입력")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ToDoInputPreview() {
    ComposeExample1Theme() {
        ToDoInput("테스트", {}, {})
    }
}

