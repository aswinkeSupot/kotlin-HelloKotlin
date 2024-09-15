package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .3
     *      Write a program to swap two variables
     * **/

    var s1 = Scanner(System.`in`)

    println("Please enter Number A")
    var A = s1.nextInt()

    println("Please enter Number B")
    var B = s1.nextInt()

    var newA = (A + B) - A
    var newB = (A + B) - B

    println("Value of A = $newA")
    println("Value of B = $newB")

}