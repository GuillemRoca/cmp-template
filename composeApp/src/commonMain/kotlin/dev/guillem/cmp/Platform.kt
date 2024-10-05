package dev.guillem.cmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform