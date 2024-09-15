package com.example.hellokotlin.study.literals

fun main(){

    //Normal function
    fun addTwoNum(x: Int, y: Int): Int{
        return x + y
    }

    // Lambda Expressions
    val addition1 : (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    val addition2 = {a: Int, b: Int -> a+b}
    val addition3 : (Int, Int) -> Int = {a, b -> a+b}
    println(addition1.invoke(10,2))
    println(addition2.invoke(20,30))
    println(addition3.invoke(30,2))

    /**
     * Lambda Expressions: concise way to define anonymous fun.
     * **/

    // Basic Lambda Expression: { parameters -> body }

    /** Types of Lambda Expressions */
    //1.  With Parameter and Return Type
    val add1 : (Int, Int) -> Int = {a, b -> a+b}
    val result = add1(2,5)
    println("Sum = $result")

    //2. With Parameter And No Return value
    /** Unit :- is the return type in Kotlin, Unit is similar to void in other language,
    * and signifies that the lambda expression doesn't return any value.
    **/
    val add2 : (Int, Int) -> Unit = { a, b -> println(a+b) }
    add2(5,5)

    //3. No Parameters But with Return Value
    val add3: () -> String = {"Hello Aswin"}
    println(add3.invoke()+" with invoke()")
    println(add3())

    //4. No Parameters And No Return Value
    val add4: () -> Unit = {println("No Parameter And No Return Value")}
    add4.invoke()
    add4()

    // Direct use of lambda Expressions
    println({a:Int, b:Int -> a * b} (2,6))

}