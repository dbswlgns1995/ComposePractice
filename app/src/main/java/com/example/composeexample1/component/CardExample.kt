package com.example.composeexample1.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composeexample1.ui.theme.ComposeExample1Theme

data class CardData(
    val imageUri: String,
    val imageDescription: String,
    val author: String,
    val description: String
)

val cardData = CardData(
    imageUri = "https://fastly.picsum.photos/id/742/200/300.jpg?hmac=sHIMP5dqRR6HpQIp-okFHEfCF2qUo8G3_cq7DuFoCRw",
    imageDescription = "이미지 설명",
    author = "작가작가작가",
    description = "설명설명설명설명설명설명설명설명"
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElevatedCardExample() {
    val placeHolderColor = Color(0x33000000)

    ElevatedCard(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(4.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            AsyncImage(model = cardData.imageUri,
                contentDescription = cardData.imageDescription,
                modifier = Modifier.size(32.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                placeholder = ColorPainter(placeHolderColor)

            )
            Spacer(modifier = Modifier.size(8.dp))
            Column {
                Text(text = cardData.author)
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = cardData.description)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultCardPreview() {
    ComposeExample1Theme {
        ElevatedCardExample()
    }
}
