package com.example.hellokotlin.study.abstraction

interface Vehicle {
    val speedValue : Int

    fun startEngine(): String

    fun accelerate(){
        println("Acceleration...")
    }
}