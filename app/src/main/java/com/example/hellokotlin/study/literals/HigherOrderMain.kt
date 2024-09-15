package com.example.hellokotlin.study.literals

fun operateOnNumbers(a:Int, b:Int, operation:(Int, Int)-> Int) : Int{
    return operation(a,b)
}

fun main(){
    /**
     * Higher order function is a function that accepts one or more functions as parameters,
     * or it can return a function as its result.
     * **/

    val addResult = operateOnNumbers(5,3) {x, y -> x+y}
    println("sum = $addResult")
    val multiplyResult = operateOnNumbers(5, 2) {x,y ->x*y}
    println("multiply = $multiplyResult")

    /**
     * "it" keyword :-  implicit name for a single parameter name for a single parameter
     * in a lambda expression or anonymous function when that lambda or fun takes
     * only one parameter
     * **/

    //Example .1
    val numbers = listOf(1,2,3,4,5)
    println(numbers)

    // Using it keyword to square every number
    val squareNumberIt = numbers.map {it * it}
    println("square numbers using it = $squareNumberIt")

    // Using Lambda expression to square every number
    val squaredNumbersLambda = numbers.map {x:Int -> x*x}
    println("Lambda Expression square = $squaredNumbersLambda")

    //Using anonymous function to square every number
    val squaredNumberAnonymous = fun(x: Int): Int{
        return x*x
    }
    println("Anonymous function square = ${numbers.map(squaredNumberAnonymous)}")


    //Example .2
    // Getting the even numbers from the list
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers = $evenNumbers")

}

