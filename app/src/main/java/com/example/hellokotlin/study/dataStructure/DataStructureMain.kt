package com.example.hellokotlin.study.dataStructure

fun main(){
    /**
     * Immutable List
     * **/
    //EG:- 1
    val list1 = listOf<Int> (4,23,1)  // Declare or create a immutable Int list
    //Printing the list item from list1
    for(item in list1){
        println(item)
    }

    //EG:- 2
    //Printing the list item from list2
    val list2 = listOf("Jack","John", "Mike")  // Declare or create a immutable String list
    for(item in list2){
        println(item)
    }

    /**
     * Mutable List
     * **/
    //EG:- 1
    var mutList1 = mutableListOf("Jack", "John", "Mike")

    // Modifying the element
    mutList1[2] = "Jason"


    // Adding elements
    mutList1.add("Marshal") //Add item into end of the list
    mutList1.add(2,"Jhondo") // Add item to specified index

    //Remove item from the list
    mutList1.removeAt(0) // This will remove item at the index 0

    //Read all elements of list
    for (item in mutList1){
        println(item)
    }

    /**
     * Immutable Set
     * **/
    val immutableSet = setOf(5, 10,"Hello", 'Z', 5, 10)

    // print the elements in Set
    for (item in immutableSet){
        print(item) // This will print (5 10 Hello Z) Duplicate will not print
    }

    /**
     * Mutable set
     * **/
    var mutalbeSet = mutableSetOf<Int>(5,10,35,2)

    // adding elements to set
    mutalbeSet.add(40)

    // remove elements
    mutalbeSet.remove(35) //This will remove Int 35 from the mutableSet

    // Update element
    mutalbeSet.remove(5)
    mutalbeSet.add(40) // This will remove item 5 and add 40 to the mutalbeSet

    // print the element in Set
    for (item in mutalbeSet){
        println(item)
    }

    /**
     * Immutable Map
     * **/
    val immutableMap = mapOf(1 to "Aswin", 2 to "Raj",9 to "Jack")

    // Print all key values from the immutableMap
    for (key in immutableMap.keys){
        println(immutableMap[key])
    }

    /**
     * Mutable Map
     * **/
    var mutableMap = mutableMapOf<Int,String>(1 to "Raj", 2 to "Kiran", 5 to "Mike")

    // Add element to mutableMap
    mutableMap.put(4, "Jack")

    // Remove Item
    mutableMap.remove(4)

    //Update Item
    mutableMap[1] = "Vikram"

    // Loop through Elements
    for (item in mutableMap.values){
        println(item)
    }
    for ((key, value ) in mutableMap){
        println("Key is $key , and its value is $value")
    }
}