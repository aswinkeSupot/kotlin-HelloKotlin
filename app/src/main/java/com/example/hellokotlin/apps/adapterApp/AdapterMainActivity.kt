package com.example.hellokotlin.apps.adapterApp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hellokotlin.R

class AdapterMainActivity : AppCompatActivity() {

    private lateinit var BtnSimpleListViewAdapter: Button
    private lateinit var BtnCustomListAdapter: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_main)

        BtnSimpleListViewAdapter = findViewById(R.id.btnSimpleListAdapter)
        BtnCustomListAdapter =findViewById(R.id.btnCustomListAdapter)

        BtnSimpleListViewAdapter.setOnClickListener {
            val intent = Intent(this, SimpleListView::class.java)
            startActivity(intent)
        }

        BtnCustomListAdapter.setOnClickListener {
            val intent = Intent(this, CustomListView::class.java)
            startActivity(intent)
        }
    }
}