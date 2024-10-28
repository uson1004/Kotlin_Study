package com.example.kotlin_Study.october

import android.icu.util.Calendar
import java.time.DayOfWeek
import java.time.Instant
import java.time.LocalDate
import java.util.Date

private var count = 0L

fun main() {
    val weeks = LocalDate.now()
    var days = mutableListOf<Int>()

    repeat(2) {
        days = setNextWeek(weeks.plusDays(7 * count++))
        println(days)
    }
    for (count in 2 downTo 0) {
        days = setPreWeek(weeks.plusDays(7 * count.toLong()))
        println(days)
    }
}
fun setNextWeek(week: LocalDate): MutableList<Int> {
    var now = week
    val weeks = DayOfWeek.entries.toList()

    val days = mutableListOf<Int>()

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
    }

    return days
}

fun setPreWeek(week: LocalDate): MutableList<Int> {
    var now = week
    val weeks = DayOfWeek.entries.toList()

    val days = mutableListOf<Int>()

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
    }

    return days
}
