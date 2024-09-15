package com.example.hellokotlin.study

class Car(var brand: String,var year: Int,var color: String) {

    // Functions - behaviours
    fun drive(){
        println("Driving...")
    }
    fun brake(){
        println("Breaking...")
    }
}