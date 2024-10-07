package com.example.kotlin_Study.october

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

fun main() {
    val currentDate = LocalDate.now()

    // "dd:EEEE" 형식을 적용 (EEEE는 요일을 나타냄)
    val formatter = DateTimeFormatter.ofPattern("dd:EEEE", Locale.ENGLISH)

    // 형식화된 날짜 출력
    println("current: ${currentDate.format(formatter)}")
}