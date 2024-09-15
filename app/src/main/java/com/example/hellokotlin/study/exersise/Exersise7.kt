package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .4
     *      Write a program to count the number of even and odd elements in a given array of integers.
     *      eg : {1,3,-5,5,4,5,7 }
     * **/

    calculateEvenOddCount()

}

fun calculateEvenOddCount(){
    var arr1 = arrayOf(1,3,-5,5,4,5,7,8)

    var evenCount = 0
    var oddCount = 0

    for (c in arr1){
        if(c % 2 == 0 ){
            evenCount++
        }else{
            oddCount++
        }
    }

    println("OddCount = $oddCount \nevenCount = $evenCount")
}