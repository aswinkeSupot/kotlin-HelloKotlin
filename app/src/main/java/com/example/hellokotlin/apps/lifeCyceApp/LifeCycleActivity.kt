package com.example.hellokotlin.apps.lifeCyceApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hellokotlin.R

class LifeCycleActivity : AppCompatActivity() {
    private final val TAG = "LifeCycleActivity LOGTEST"

    /** onCreate Method
     * This method is called when the activity is first created.
     * we can perform one time initialization tasks here, such as setting up UI elements and data
     * **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        // Recieve Data from the Intent
        val recievedData = intent.getStringExtra("KEY_NAME")

        Log.d(TAG, "onCreate: Method Called")
    }

    /**onStart Method
     * This call makes the activity visible to the user as the app prepares for the activity
     * to enter the foreground and become interactive.
     * **/
    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart: Method Called")
    }

    /**onResume Method
     * Handle activities when the app is in the foreground.
     * This is the state in which the app interacts with the user. The app stays in this
     * state until something happens to take focus away from the app
     * **/
    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: Method Called")
    }

    /**onPause Method
     * This method is called when the activity is about to lose focus, but is still visible to the user.
     * **/
    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: Method Called")
    }

    /**onStop Method
     * This method is called when the activity is no longer visible to the user.
     * **/
    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: Method Called")
    }

    /**onRestart Method
     * This method is called when the activity is about to be restarted after being stopped.
     * **/
    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart: Method Called")
    }

    /**onDestroy Method
     * This method is called when the activity is being destroyed.
     * **/
    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: Method Called")
    }

}