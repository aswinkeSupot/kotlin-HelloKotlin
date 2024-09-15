package com.example.hellokotlin.study.inheritance

class Teacher: Person {
    private var Name: String = ""
    private var Age: Int = 0
    constructor(name: String, age: Int): super(name, age){
        this.Name = name
        this.Age = age
    }

    fun Teach(subject: String){
        println("$Name can teach $subject")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}