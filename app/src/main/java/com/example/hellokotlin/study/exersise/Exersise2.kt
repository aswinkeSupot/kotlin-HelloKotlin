package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .2
     *      Write a program that gets from the user the radius and print the area and perimeter of a circle
     * **/

    var s1 = Scanner(System.`in`)

    println("Please enter the radius")
    var radius = s1.nextInt()

    var perimeter : Double = 2 * 3.1415 * radius

    var area : Double = radius * radius * 3.1415

    println("Perimeter = $perimeter")
    println("Area = $area")

}