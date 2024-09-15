package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .3
     *      Write a program that takes 3 numbers from the user
     *      and prints the greatest number among them
     * **/

    var s1 = Scanner(System.`in`)

    println("Please enter Number 1")
    var A = s1.nextInt()

    println("Please enter Number 2")
    var B = s1.nextInt()

    println("Please enter Number 3")
    var C = s1.nextInt()

    if(A > B){
        if(A > C){
            println("Greatest number is $A")
        } else {
            println("Greatest number is $C")
        }
    }else{
        if(B > C){
            println("Greatest number is $B")
        } else {
            println("Greatest number is $C")
        }
    }

}