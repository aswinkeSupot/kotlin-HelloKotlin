package com.example.hellokotlin.apps.lotteryApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.hellokotlin.R

class LotteryHomeActivity : AppCompatActivity() {

    //Declaring the widgets
    private lateinit var editTextName: EditText
    private lateinit var btnGenerate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotteryhome)

        // Initialize the widgets
        editTextName = findViewById(R.id.editTextName)
        btnGenerate = findViewById(R.id.btnGenerate)

        btnGenerate.setOnClickListener {
            var name : String = editTextName.text.toString()
            val intent = Intent(this, LotterySecondActivity::class.java)
            intent.putExtra("KEY_NAME",name)
            startActivity(intent)
        }
    }
}