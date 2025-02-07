package org.image.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform