package com.example.hellokotlin.apps.adapterApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.hellokotlin.R
import com.example.hellokotlin.apps.adapterApp.adapter.CustomListViewAdapter

class CustomListView : AppCompatActivity() {

    private lateinit var customListView : ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view_adapter)

        // 1. Initializing the listView
        customListView = findViewById(R.id.customListView)

        // 2. Data Source
        val operatingSystems = listOf(
            "Windows", "Linux", "Android", "iOS"
        )

        // 3. Adapter
        val customAdapter = CustomListViewAdapter(this,operatingSystems)

        // 4. set adapter to the ListView
        customListView.adapter = customAdapter
    }
}