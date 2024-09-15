package com.example.hellokotlin.apps.volumeCalculatorApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hellokotlin.R

class ShapesSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shapes_second)

        var recievedData: String? = intent.getStringExtra("KEY_NAME")
//        val recievedData = intent.extras?.getString("KEY_NAME") ?: "No message found"
//        val recievedData = intent.getStringExtra("KEY_NAME")

        if(recievedData == "Sphere"){
            Log.d("ShapesSecondActivity", ":Sphere: ")
        }else if (recievedData == "Cube"){
            Log.d("ShapesSecondActivity", ":Cube: ")
        }else if (recievedData == "Cylinder"){
            Log.d("ShapesSecondActivity", ":Cylinder: ")
        }else if (recievedData == "Prism"){
            Log.d("ShapesSecondActivity", ":Prism: ")
        }else{
            Log.d("ShapesSecondActivity", ":null: ")
        }

    }
}