package com.example.hellokotlin.apps.groceryApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hellokotlin.R

class GroceryHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_home)

        // 1. AdapterView: RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerGrocery)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // 2. Data Source : List of ItemModel Objects
        var groceryItems: ArrayList<GroceryDataClass> = ArrayList()

        val v1 = GroceryDataClass("Fruits","Fresh Fruits from the Garden",R.drawable.planet1)
        val v2 = GroceryDataClass("Vegetables","Delicious Vegetables",R.drawable.planet2)
        val v3 = GroceryDataClass("Bakery","Bread, Wheat and Beans",R.drawable.planet3)
        val v4 = GroceryDataClass("Beverage","Juice, Tea, Coffee and Soda",R.drawable.planet4)
        val v5 = GroceryDataClass("Milk","Milk, Shakes and Yogurt",R.drawable.planet5)
        val v6 = GroceryDataClass("Snacks","Pop Corn, Donut and Drinks",R.drawable.planet6)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)

        // 3. Adapter
        val adapter = GroceryAdapter(groceryItems)
        recyclerView.adapter = adapter
    }
}