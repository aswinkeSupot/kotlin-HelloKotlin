package com.example.hellokotlin.study.abstraction

class Car() : Vehicle {
    //override val speedValue: Int get() = 25
    //Both Above and below code is correct.
    override val speedValue: Int = 25

    override fun startEngine(): String {
        return "Starting the Engine..."
    }
}