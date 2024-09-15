package com.example.hellokotlin.apps.servicesApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hellokotlin.R

class ServicesHomeActivity : AppCompatActivity() {

    private lateinit var btnPlayRingtone: Button
    private lateinit var btnStopRingtone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services_home)

        btnPlayRingtone = findViewById(R.id.btnPlayRingtone)
        btnStopRingtone = findViewById(R.id.btnStopRingtone)

        btnPlayRingtone.setOnClickListener {
            // Start the Service
            var startServiceIntent = Intent(applicationContext, MyService::class.java)
            startService(startServiceIntent)
        }

        btnStopRingtone.setOnClickListener {
            // Stop Service
            var stopServiceIntent = Intent(applicationContext, MyService::class.java)
            stopService(stopServiceIntent)
        }
    }
}