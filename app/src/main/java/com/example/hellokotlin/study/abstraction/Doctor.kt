package com.example.hellokotlin.study.abstraction

class Doctor(name: String): Human() {
    override fun displayGreetings() {
        println("Hello Doctor")
    }
}