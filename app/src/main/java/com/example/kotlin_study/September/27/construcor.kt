package com.example.kotlin_Study.september

fun main() {


}

class InitTestClass(name: String, age: Int) {
    val name: String = "kim"
    var age: Int = 17
    init {
        this.age = age // 호출할 때 받은 함수를 클래스 내의 변수에 저장
    }
}

class NoInitTestClass(var name: String, val age: Int) { // var, val 키워드 사용
    fun introduce() {
        println("Hi! my name is $name I'm $age years old") // 생상자 꼭 써야 작동되는 것은 아님
                                                           // $ 기호 사용하여 문자열을 변수에 대입
    }
}

class DefaultTestClass { // 기본 클래스 타입

}
class AddConstructorTestClass(name: String, age: Int) { // 매개변수(기본생성자 추가)

}

