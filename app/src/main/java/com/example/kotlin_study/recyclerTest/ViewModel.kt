package com.example.kotlin_Study.recyclerTest

import androidx.lifecycle.ViewModel
import com.example.kotlin_Study.recyclerTest.data.ExampleItem

class MainViewModel : ViewModel() {
        val dummyList = listOf(
            ExampleItem("아무말1"),
            ExampleItem("아무말2"),
            ExampleItem("아무말3"),
            ExampleItem("아무말4"),
            ExampleItem("아무말5"),
        )
}