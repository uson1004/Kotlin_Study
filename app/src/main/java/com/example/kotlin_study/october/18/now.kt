package com.example.kotlin_Study.october

import java.time.DayOfWeek
import java.time.LocalDate

fun main() {
    var now = LocalDate.now()
    val weeks = DayOfWeek.entries.toList()

    var days = mutableListOf<Int>()

    when (now.dayOfWeek) {
        in DayOfWeek.MONDAY..DayOfWeek.FRIDAY -> {
            now = now.minusDays(weeks.indexOf(now.dayOfWeek).toLong())
        }

        DayOfWeek.SATURDAY -> {
            now = now.plusDays(2)
        }

        DayOfWeek.SUNDAY -> {
            now = now.plusDays(1)
        }

        else -> {}
    }

    repeat(5) {
        now = now.plusDays(1)
        days.add(now.dayOfMonth - 1)
        println(now)
    }
}