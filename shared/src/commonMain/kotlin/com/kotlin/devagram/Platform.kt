package com.kotlin.devagram

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform