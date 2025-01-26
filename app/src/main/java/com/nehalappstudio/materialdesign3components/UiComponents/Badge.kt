package com.nehalappstudio.materialdesign3components.UiComponents

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BadgeComponent(modifier: Modifier = Modifier) {
    BadgedBox(badge = {
        Badge(containerColor = Color.Red, contentColor = Color.White) {
            Text("99+")
        }
    }) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            tint = Color.Red
        )
    }
}