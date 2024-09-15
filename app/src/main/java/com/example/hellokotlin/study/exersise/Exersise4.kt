package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .4
     *      Write a program to count the letters, spaces, numbers and other characters of an input string
     * **/

    var s1 = Scanner(System.`in`)

    println("Please Enter your String")
    var str1 = s1.nextLine()

    count(str1)

}

fun count(text: String){
    var ch = text.toCharArray()

    var letter = 0
    var space = 0
    var numbers = 0
    var others = 0

    for (c in ch.withIndex()){
        if(Character.isLetter(c.value)){
            letter++
        }else if(Character.isDigit(c.value)){
            numbers++
        }else if(Character.isSpaceChar(c.value)){
            space++
        }else{
            others++
        }
    }

    println("Letter = $letter, \nSpace = $space, \nNumber = $numbers, \nOthers = $others")
}