package com.example.hellokotlin.apps.curencyConverterApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.hellokotlin.R

class CurrencyConverterActivity : AppCompatActivity() {

    // Declaring Variables
    private lateinit var edtUSD: EditText
    private lateinit var btnConvert: Button
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_converter)

        //Initializing Widgets
        edtUSD = findViewById(R.id.edtUSD)
        btnConvert = findViewById(R.id.btnConvert)
        txtResult = findViewById(R.id.txtResult)

        btnConvert.setOnClickListener {
            var enteredUSD: String = edtUSD.text.toString()
            var enteredUSDDouble: Double = enteredUSD.toDouble()

            var euros = makeConversion(enteredUSDDouble)

            txtResult.text = "$euros Euro"
        }
    }

    fun makeConversion(usd: Double): Double{
        var euros: Double = usd * 0.94
        return euros
    }
}