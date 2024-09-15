package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main() {
    /**
     * Example .1
     *      Write a program that gets from the user 2 numbers and displays their division and remainder.
     * **/
    var s1 = Scanner(System.`in`)

    println("Please enter a number")
    var x = s1.nextInt()

    println("Please Enter Second Number")
    var y = s1.nextInt()

    var divisionResult = x / y
    var remainderResult = x % y

    println("DivisionResult = $divisionResult")
    println("Remainder of the numbers = $remainderResult")
}