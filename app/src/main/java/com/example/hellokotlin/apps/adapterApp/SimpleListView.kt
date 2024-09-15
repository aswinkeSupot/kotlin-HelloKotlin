package com.example.hellokotlin.apps.adapterApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.hellokotlin.R

class SimpleListView : AppCompatActivity() {

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)

        // 1. Initializing the listView
        listView = findViewById(R.id.listView)

        // 2. Data Source
        val operatingSystems = arrayOf(
            "Windows", "Linux", "Android", "iOS"
        )

        // 3. Adapter
        val myArrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            operatingSystems
        )

        // 4. set adapter to the ListView
        listView.adapter = myArrayAdapter
    }
}