package com.example.composeexample1.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.composeexample1.ui.theme.ComposeExample1Theme

private val imageUrl = "https://fastly.picsum.photos/id/742/200/300.jpg?hmac=sHIMP5dqRR6HpQIp-okFHEfCF2qUo8G3_cq7DuFoCRw"

@Composable
fun NetworkImageExample() {
    val painter = rememberImagePainter(data = imageUrl)
    Image(painter = painter, contentDescription = null)
}

@Composable
fun CoilExample() {
    AsyncImage(
        model = imageUrl,
        contentDescription = null
    )

}

@Preview(showBackground = true)
@Composable
private fun DefaultNetworkImagePreview() {
    ComposeExample1Theme {
        NetworkImageExample()
    }
}
