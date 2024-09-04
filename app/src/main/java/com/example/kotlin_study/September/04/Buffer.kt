package com.example.Kotlin_Study.september

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toString() // 한 줄 입력받기
    //val n = br.readLine()
    val arr = ArrayList<IntArray>(n.toInt())

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write("hello") // 일반 문자열 출력
    bw.write(n + "\n") // 외부 출력 + 줄바꿈
    bw.flush() // 남아있는 출력 비우기
    bw.write("코틀린입니다!")
    bw.flush() // "hello1234"\n"코틀린입니다!"
    bw.close() // 스트림 종료 - 출력
}