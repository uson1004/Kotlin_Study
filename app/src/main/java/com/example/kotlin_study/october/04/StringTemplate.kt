package com.example.kotlin_Study.october.`04`

fun main() {
    val name = "yu-seob"
    val lastName = "Yoon!"

    println("my name is $name and I'm 17")

    // println("my name is $nameand I'm 17") // => '$nameand compile error
                                             // 띄어쓰기로 구분
    println("my name is${name + lastName}and I'm 17")  // '{ ... }' 띄어쓰기 구분 없음

    println("result: ${add(10, 20)}") // 함수도 가능
}

fun add(a: Int, b: Int): Int {
    return a + b
}

/*
결과
my name is yu-seob and I'm 17
my name isyu-seobYoon!and I'm 17
result: 30
 */