package com.example.kotlin_Study.november

import java.time.LocalDate


fun main() {
    val map1 = mapOf("key1" to 1, "key2" to 1, "key3" to 3)
    val map2 =  mapOf<String, Char>("key1" to '1', "key2" to '2', "key3" to '3')

    val mutableMap1 = map1.toMutableMap()

    println(map1) // result :: {key1=1, key2=1, key3=3}

    println(map1["key1"]) // result :: 1
    println(map1.get("key2"))
}