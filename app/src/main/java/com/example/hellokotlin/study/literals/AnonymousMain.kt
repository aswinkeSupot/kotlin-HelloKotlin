package com.example.hellokotlin.study.literals

fun main(){

    /**
     * Anonymous function are a way to define a function without giving
     * it a name.They are often used for creating small, one off Functions that are passed as
     * arguments to another function, or used in local scope. Anonymous functions are similar
     * to lambda expressions, but they allow you to specify the return type explicitly,
     * whereas lambda expressions often infer the return type from the context.
     * **/

    // Basic Anonymous function:
    // val variableName : (DataType1, DataType2) -> ReturnType = fun(parameter1, parameter2): ReturnType { methodBody }
    // Eg:- val add: (Int, Int) -> Int = fun(a, b): Int { return a + b }
    // OR SHORTER
    // val variableName = fun(DataType1, DataType2): ReturnType { methodBody }
    // Eg:- val add = fun(a,b): Int {return a + b }


    // Eg 1 : get the square of list of numbers
    val numbers = listOf(1,2,3,4,5)
    println(numbers)

    // An anonymous Function that squares a number
    val squareAnonymousFunction = fun(x: Int): Int {
        return x * x
    }

    // get a list of squared number of "numbers" List and assign the list to new list "squaredNumbers"
    val squaredNumbers = numbers.map(squareAnonymousFunction)
    println(squaredNumbers)

    /** Types of Anonymous Function */
    //1. With Parameters and Return Value
    val multiply1 = fun(a: Int, b: Int): Int { return a * b }
    println(multiply1.invoke(5 , 6))

    //2. With Parameters and No Return Value
    val multiply2 = fun(a: Int, b: Int): Unit { println(a*b)}
    multiply2.invoke(2,10)

    //3. No Parameters and Return Value
    val message = fun(): String{ return "Hello Aswin" }
    println(message.invoke())

    //4. No Parameters and No Return Value
    val message2 = fun(): Unit { println("Hello Raj") }
    message2.invoke()

}