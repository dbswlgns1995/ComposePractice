package com.example.composeexample1.component2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import com.example.composeexample1.ui.theme.ComposeExample1Theme

@Composable
fun ConstraintSetExample() {

    val constraintSet = ConstraintSet {
        val redBox = createRefFor("redBox")
        val magentaBox = createRefFor("magentaBox")
        val greenBox = createRefFor("greenBox")
        val yellowBox = createRefFor("yellowBox")

        constrain(redBox) {
            bottom.linkTo(parent.bottom, margin = 8.dp)
            end.linkTo(parent.end, margin = 4.dp)
        }

        constrain(magentaBox) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            end.linkTo(redBox.start)
        }

        constrain(greenBox) {
            centerHorizontallyTo(parent)
            centerVerticallyTo(parent)
        }

        constrain(yellowBox) {
            start.linkTo(parent.start, margin = 8.dp)
        }
    }

    ConstraintLayout(
        constraintSet,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Red)
                .layoutId("redBox")
        )
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Magenta)
                .layoutId("magentaBox")
        )
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Green)
                .layoutId("greenBox")
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Yellow)
                .layoutId("yellowBox")
        )
    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultConstraintSetPreview() {
    ComposeExample1Theme {
        ConstraintSetExample()
    }
}
