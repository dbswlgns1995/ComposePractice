package com.example.composeexample1

data class TodoData(
    val key: Int,
    val text: String,
    val done: Boolean = false
)
