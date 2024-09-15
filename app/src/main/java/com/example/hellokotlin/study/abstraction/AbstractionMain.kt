package com.example.hellokotlin.study.abstraction

fun main(){
    //Abstract Class
    var p1 = Doctor("Ram")
    p1.displayGreetings()
    p1.displayAge()

    //Interface
    var ford = Car()
    println(ford.startEngine())
    ford.accelerate()

    // Nested Class
    var o1 = Outer()
    o1.age
    // Creating Nested Class Object from Outer Class
    var nested = Outer.Nested()
    nested.length
}