package com.example.composeexample1.component2

import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import coil.compose.AsyncImage
import com.example.composeexample1.component.cardData
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ConstraintLayout2Example() {

    val placeHolderColor = Color(0x33000000)

    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(4.dp),
    ) {

        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {

            val (profileImage, author, description) = createRefs()

            AsyncImage(
                model = cardData.imageUri,
                contentDescription = cardData.imageDescription,
                contentScale = ContentScale.Crop,
                placeholder = ColorPainter(color = placeHolderColor),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp)
                    .constrainAs(profileImage) {
                        centerVerticallyTo(parent)
                        start.linkTo(parent.start, 8.dp)
                    }
            )

            Text(
                text = cardData.author,
                modifier = Modifier
                    .constrainAs(author) {
                        linkTo(profileImage.end, parent.end, startMargin = 8.dp, endMargin = 8.dp)
                        width = Dimension.fillToConstraints
                    }
            )

            Text(
                text = cardData.description,
                modifier = Modifier
                    .constrainAs(description) {
                        linkTo(profileImage.end, parent.end, startMargin = 8.dp, endMargin = 8.dp)
                        width = Dimension.fillToConstraints
                    }
            )

            val chain = createVerticalChain(author, description, chainStyle = ChainStyle.Packed)

            constrain(chain) {
                top.linkTo(parent.top, margin = 8.dp)
                bottom.linkTo(parent.bottom, margin = 8.dp)
            }
        }

    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultConstraintSetPreview() {
    ComposeExample1Theme {
        ConstraintLayout2Example()
    }
}
