package com.example.hellokotlin.apps.broadcastApp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver(){
    // Broadcast Receiver: allows the registration and handling of system-wide broadcast messages

    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action != null && intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            var isAirplaneModeOn : Boolean = intent.getBooleanExtra("state",false)

            if(isAirplaneModeOn){
                Toast.makeText(context,"Airplane mode is ON", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"Airplane mode is Off", Toast.LENGTH_LONG).show()
            }
        }
    }
}