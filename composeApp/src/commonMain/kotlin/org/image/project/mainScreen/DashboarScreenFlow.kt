package org.image.project.mainScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.image.project.Screen

@Composable
fun DashboardScreenFlow(newRoute: (String) -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            newRoute.invoke(Screen.CaptureImage.route)

        }, modifier = Modifier.fillMaxWidth(0.8f)) {
            Text(text = "Capture Image")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            newRoute.invoke(Screen.ImageGallery.route)
        }, modifier = Modifier.fillMaxWidth(0.8f)) {
            Text(text = "Image Gallery")
        }

    }

}