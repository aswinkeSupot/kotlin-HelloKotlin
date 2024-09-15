package com.example.hellokotlin.study.abstraction

abstract class Human {
    var age : Int = 30

    fun displayAge(){
        println("My age is : $age")
    }

    abstract  fun displayGreetings()
}