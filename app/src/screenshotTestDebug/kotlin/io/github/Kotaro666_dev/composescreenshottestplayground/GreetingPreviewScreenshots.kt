package io.github.Kotaro666_dev.composescreenshottestplayground

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.kotaro666_dev.composescreenshottestplayground.Greeting
import io.github.kotaro666_dev.composescreenshottestplayground.ui.theme.ComposeScreenshotTestPlaygroundTheme

class GreetingPreviewScreenshots {

    @Preview(showBackground = true, device = "id:pixel_5")
    @Composable
    fun GreetingPreview() {
        ComposeScreenshotTestPlaygroundTheme {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Greeting(name = "Screenshot test")
            }

        }
    }
}
