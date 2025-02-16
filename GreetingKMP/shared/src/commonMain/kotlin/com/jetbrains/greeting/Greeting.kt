package com.jetbrains.greeting

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    // Function to return a list of course codes
    fun getCourseCodes(): List<String> {
        return listOf("CS101", "MATH202", "ENG303")
    }

    // Greeting function to return a greeting string
    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"
        return "$firstWord Guess what this is! > ${platform.name.reversed()}!"
    }
}
