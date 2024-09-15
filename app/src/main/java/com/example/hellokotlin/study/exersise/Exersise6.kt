package com.example.hellokotlin.study.exersise

import java.util.Scanner

fun main(){
    /**
     * Example .4
     *      Write a program to Multiply corresponding elements of two array of integers.
     *      eg : {1,3 ,-5,5 }
     *           {1,4 ,-5,-2}
     *      res:-{1,12,25,-8}
     * **/

    multiplyArrays1()

}

fun multiplyArrays1(){
    var arr1 = arrayOf(1,3,-5,5)
    var arr2 = arrayOf(1,4,-5,-2)

    var newArray = ""

    for (c in arr1.withIndex()){
        newArray += (arr1[c.index] * arr2[c.index])
        newArray += " "
    }

    println("Multiplied Array = $newArray")
}