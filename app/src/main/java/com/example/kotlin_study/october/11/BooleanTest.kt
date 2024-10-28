package com.example.kotlin_Study.october

private var buttonState: Boolean = false

fun main() {
    println(isStateCheck())
    println(isStateCheck())
    println(isStateCheck())
    println(isStateCheck())
}

private fun isStateCheck(): Boolean {
    if (buttonState)
        buttonState = false
    else
        buttonState = true

    return buttonState
}