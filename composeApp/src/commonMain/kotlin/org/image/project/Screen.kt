package org.image.project

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {
    @Serializable
    data object Dashboard : Screen("Dashboard")
    @Serializable
    data object CaptureImage : Screen("CaptureImage")
    @Serializable
    data object ImageGallery : Screen("ImageGallery")
}