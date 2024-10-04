package com.example.kotlin_Study.october.`04`

fun main() {
    println(maxBy(2, 6))
    println(maxBy2(5, 7))

    maxBy3(8, 4)
    println(maxBy3(8, 4))

    println(maxBy4)

    println(typeCheck())
}

fun maxBy(a: Int, b: Int) : Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxBy2(a: Int, b: Int) = if (a>b) a else b

fun maxBy3(a: Int, b: Int) = println((if (a > b) a else b))

var maxBy4 = { a: Int, b: Int ->
    println((if (a > b) a else b))
}

fun typeCheck() { // 내부에 있는 println문은 내부의 타입을 추론해 반환한다.(고차함수(함수 내에 있는 함수)를 사용하여 원하는 출력값을 얻어낼 수 있다?)
    println(10)
}

/*
결과
6
10
8
8
kotlin.Unit
Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit>
10
kotlin.Unit
 */
