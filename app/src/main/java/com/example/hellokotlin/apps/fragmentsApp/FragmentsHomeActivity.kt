package com.example.hellokotlin.apps.fragmentsApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.hellokotlin.R
import com.example.hellokotlin.apps.fragmentsApp.fragments.FragmentOne
import com.example.hellokotlin.apps.fragmentsApp.fragments.FragmentTwo

class FragmentsHomeActivity : AppCompatActivity() {

    private lateinit var frameLayout: FrameLayout
    private lateinit var btnFragmentOne: Button
    private lateinit var btnFragmentTwo: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_home)

        frameLayout = findViewById(R.id.frameLayout)
        btnFragmentOne = findViewById(R.id.btnFragmentOne)
        btnFragmentTwo = findViewById(R.id.btnFragmentTwo)

        btnFragmentOne.setOnClickListener {
            val fragment1: FragmentOne = FragmentOne()
            loadFragment(fragment1)
        }

        btnFragmentTwo.setOnClickListener {
            val fragment2: FragmentTwo = FragmentTwo()
            loadFragment(fragment2)
        }

    }

    fun loadFragment(fragment: Fragment){
        // Fragment Manager: responsible for managing fragments in activity. It keeps track of
        // the fragment lifecycle and handles transactions involving fragments.
        val fragmentManager = supportFragmentManager

        //Fragment Transaction:  used to define a set of operations to be perform on fragments.
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        //Replacing the frameLayout with new fragment.
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}