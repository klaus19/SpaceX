package com.example.spacex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform