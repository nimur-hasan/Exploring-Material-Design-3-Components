package com.nehalappstudio.materialdesign3components.UiComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderComponent(modifier: Modifier = Modifier) {
    var sliderPosition by remember { mutableStateOf(0f) }
    var selectedValue by remember { mutableStateOf(0f) }
    Column {
        Text("Value: $sliderPosition")
        Text("Selected: $selectedValue")
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..5f,
            steps = 4,
            onValueChangeFinished = {
                selectedValue = sliderPosition
            },
            thumb = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
            },

        )
    }
}