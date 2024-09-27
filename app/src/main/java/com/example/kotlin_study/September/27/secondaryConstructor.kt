package com.example.kotlin_Study.september

fun main() {
    ExecutionOrder("윤유섭", 17)
}

class ScConstructor(val name: String) {
    private var age = 10
    private var height = 500

//    constructor(name: String, age: Int) { // 컴파일 에러 부 생성자를 사용할 때에는 주 생성자를 상속 받아야함
//
//    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
    }
}

class ExecutionOrder {
    var name = ""
    var age = 1
    var height = 2

    init {
        println("주 생성자 호출")
    }

    constructor(name: String) {
        this.name = name
        println("name 부 생성자 호출")
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("name, age 부 생성자 호출")
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
        println("name, age, height 부 생성자 호출")
    }
}
