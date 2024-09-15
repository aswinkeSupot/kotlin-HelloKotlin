package com.example.hellokotlin.study

import com.example.hellokotlin.study.Car

fun main (){
    println("Hello Kotlin Test Class")

//    for (numb in 1..20){
//        if(numb == 10){
//            continue
//        }
//        println(numb)
//    }

//    helloFunction("Aswin",33)

//    var result = addNumbers(5,6)
//    println(result)

    var ford = Car("Ford",2023,"Red")
    ford.color
}

fun addNumbers(x : Int, y : Int) = (x + y)

fun addTwoNumbers(x : Int, y : Int) : Int {
    return (x + y)
}

fun helloFunction(name : String, age : Int){
    println("Hello Iam $name and my age is $age")
}