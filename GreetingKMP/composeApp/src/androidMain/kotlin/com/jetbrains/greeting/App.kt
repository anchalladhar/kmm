package com.jetbrains.greeting

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import greetingkmp.composeapp.generated.resources.Res

@Composable
@Preview
fun App() {
    MaterialTheme {
        val greeting = remember { Greeting().greet() }

        Column(
            modifier = Modifier.padding(12.dp), // Set padding to 12dp
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            // Iterate through the greeting list using forEach
            greeting.forEach { greeting ->
                Text(
                    text = greeting,
                    modifier = Modifier.graphicsLayer { blurRadius = 1f }, // Apply blur effect
                    fontWeight = FontWeight.Bold // Set fontWeight to bold
                )
                Divider()
            }
        }
    }
}
