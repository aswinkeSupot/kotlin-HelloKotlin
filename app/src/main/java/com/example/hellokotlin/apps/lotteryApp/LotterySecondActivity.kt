package com.example.hellokotlin.apps.lotteryApp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.hellokotlin.R

class LotterySecondActivity : AppCompatActivity() {

    //Declaring the widgets
    private lateinit var txtTitle: TextView
    private lateinit var txtResult: TextView
    private lateinit var btnShare: Button

    private var name = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotterysecond)

        name = recieveUserName()

        txtTitle = findViewById(R.id.txtTitle)
        txtResult = findViewById(R.id.txtResult)
        btnShare = findViewById(R.id.btnShare)

        txtTitle.text = "Hi, $name Your Lottery Number:"

        txtResult.text = generateRandomNumber(6)

        btnShare.setOnClickListener {
            shareResult(name, txtResult.text.toString())
        }
    }

    private fun recieveUserName():String{
        // ? --> Indicates that the variable can be NULL
        var bundle:Bundle? = intent.extras

        var username = bundle?.getString("KEY_NAME").toString()
        return username
    }

    private fun generateRandomNumber(count: Int): String{
        var randomNumber = List(count){
            (0..10).random()
        }

        return randomNumber.joinToString(" ")
    }

    private fun shareResult(userName: String, generatedNumber: String){
        // Send data to another application with Implicit Intent
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT, "$userName generates these number")
        i.putExtra(Intent.EXTRA_TEXT, "The Lottery numbers are $generatedNumber")
        startActivity(i)
    }
}