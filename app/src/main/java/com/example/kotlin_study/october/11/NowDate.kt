package com.example.kotlin_Study.october

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters

fun main() {
    //getDate()
    var now = LocalDate.now()
    val weeks = DayOfWeek.entries.toList()

    val days = mutableListOf<Int>()

    when (now.dayOfWeek) {
        in DayOfWeek.MONDAY..DayOfWeek.FRIDAY -> {
            now = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)) //now.minusDays(weeks.indexOf(now.dayOfWeek).toLong())
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
        days.add(0, now.dayOfMonth - 1)
    }

    now = now.plusWeeks(1)

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
        days[it] = now.dayOfMonth - 1
    }
}

private fun getDate() {
    var now = LocalDate.now()
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
}

private fun addDateIntoText() {

}