package com.example.hellokotlin.study.inheritance

abstract class Person (val name:String,val age: Int): PersonActions {

//    constructor(name:String, age: Int){
//        println("Person Class Secondary Constructor")
//    }

//    abstract fun start()

    init {
        println("A new person is created with name: $name")
    }

    fun talk(){
        println("$name can talking")
    }

    fun walk(){
        println("$name can walking")
    }

    fun eat(){
        print("$name can eating")
    }
}