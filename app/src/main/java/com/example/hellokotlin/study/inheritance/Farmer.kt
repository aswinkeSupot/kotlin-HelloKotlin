package com.example.hellokotlin.study.inheritance

class Farmer(name: String, age: Int) : Person(name, age) {
    fun cultivate(item :String){
        print("$name can cultivate $item")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}