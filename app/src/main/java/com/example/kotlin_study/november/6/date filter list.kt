package com.example.kotlin_Study.november

import java.time.LocalDate

fun main() {
    val list = mutableListOf(11, 12, 39, 29, 1, 2, 4, 28, 21, 18, 15, 12, 38, 48, 27, 56)
    val now = LocalDate.now()

    println(list.filter { it >= 30 }) // result :: [39, 38, 48, 56]
}