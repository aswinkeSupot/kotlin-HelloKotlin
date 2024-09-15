package com.example.hellokotlin.apps.broadcastApp

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellokotlin.R

class BroadcastAppActivity : AppCompatActivity() {
    lateinit var airplaneModeReceiver : AirplaneModeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_app)

        // Register Dynamically the BroadCast Reciever
        var intentFilter : IntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")

        airplaneModeReceiver = AirplaneModeReceiver()

        registerReceiver(airplaneModeReceiver, intentFilter)

    }

    override fun onDestroy() {
        unregisterReceiver(airplaneModeReceiver)
        super.onDestroy()
    }
}