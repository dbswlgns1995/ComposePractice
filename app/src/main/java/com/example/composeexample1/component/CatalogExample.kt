package com.example.composeexample1.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Item(itemData: ItemData) {
    // 스텝 1: catalog1.png를 참고해 카드 레이아웃을 완성하세요.
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            AsyncImage(model = itemData.imageUri, contentDescription = null)

            Spacer(modifier = Modifier.size(8.dp))

            Text(
                text = itemData.title,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.size(8.dp))

            Text(
                text = itemData.description,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

data class ItemData(
    val imageUri: String,
    val title: String,
    val description: String,
)

@Composable
fun CatalogExample(itemList: List<ItemData>) {
    LazyColumn {
        items(itemList) { item ->
            Item(item)
        }
    }
}

val items = listOf(
    ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    ),
    ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    ),
    ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    ),ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    ),
    ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    ),
    ItemData(
        imageUri = cardData.imageUri,
        title = "이미지",
        description = "설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명"
    )
)


@Preview(showBackground = true)
@Composable
private fun DefaultCatalogPreview() {
    ComposeExample1Theme {
        CatalogExample(items)
    }
}
