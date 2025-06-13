package com.example.cmpdemo.cmpdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform