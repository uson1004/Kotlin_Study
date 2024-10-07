package com.example.kotlin_Study.october

data class User(                    // 데이터 클래스의 특징
    val name: String,               // 상속을 받을 수 없다(abstract, open, sealed, inner 키워드도 불가)
    val profileImg: String,         // equals(), toString(), hashCode() 함수 구현 기능
    val age: Int
)

fun main() {
    val user1 = User("yuseob", "", 17)
    val user2 = user1.copy() // copy(name = ... ) 데이터 재정의 가능
    val user3 = user1.copy(name = "yoonyuseob")

    println(user1 == user2) // 값이 같음
    println(user1 === user2) // 다른 메모리를 참조함

    println(user1.hashCode() == user2.hashCode())
    //만약 값이 다르다면?
    println(user1.hashCode() == user3.hashCode())
    // hashcode는 데이터 클래스의 모든 프로퍼티로 계산한다.
    // 만약 프로퍼티의 값 중 하나라도 다르다면 hash값도 달라지게 된다.
}

/*
결과:
true
false

true
 */
