package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .4
     *      Write a program to reverse a string
     * **/

    var s1 = Scanner(System.`in`)

    println("Please Enter your String")
    var str1 = s1.nextLine()

    reverse1(str1)
    reverse2(str1)

}

fun reverse1(text: String){
    var ch = text.toCharArray()

    var letterSize = ch.size
    var newReverseString = ""

    for (c in letterSize -1 downTo 0){
        newReverseString += ch[c]
    }

    println("Reversed String Type1 = $newReverseString")
}

fun reverse2(text: String){
    var newReverseString = text.reversed()
    println("Reversed String Type2 = $newReverseString")
}