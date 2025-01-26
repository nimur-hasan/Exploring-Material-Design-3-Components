package com.nehalappstudio.materialdesign3components.UiComponents

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SwitchComponent() {

    var isChecked by remember { mutableStateOf(false) }

    val icons = if (isChecked) Icons.Default.Check else Icons.Default.Close
    val iconColor = if(isChecked) Color.Green else Color.Red

    Switch(
        checked = isChecked,
        onCheckedChange = {
            isChecked = it
        },
        thumbContent = {
            Icon(
               imageVector = icons,
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize),
                tint = iconColor
            )
        },


    )
}