package com.example.hellokotlin.apps.navDrawerApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.hellokotlin.R
import com.example.hellokotlin.apps.navDrawerApp.fragment.HomePageFragment
import com.example.hellokotlin.apps.navDrawerApp.fragment.LoginPageFragment
import com.example.hellokotlin.apps.navDrawerApp.fragment.MessagePageFragment
import com.example.hellokotlin.apps.navDrawerApp.fragment.SettingsPageFragment
import com.google.android.material.navigation.NavigationView

class NavDrawerHome : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer_home)

        drawerLayout = findViewById(R.id.drawerLayout)

        toggle = ActionBarDrawerToggle(this@NavDrawerHome, drawerLayout,
            R.string.open,R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Functionality for the nav drawer items
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.home -> {
                    replaceFragment(HomePageFragment(),it.title.toString())
                }

                R.id.message -> {
                    replaceFragment(MessagePageFragment(),it.title.toString())
                }

                R.id.settings -> {
                    replaceFragment(SettingsPageFragment(),it.title.toString())
                }

                R.id.login -> {
                    replaceFragment(LoginPageFragment(),it.title.toString())
                }
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment, title: String ){
        // Fragment Manager: responsible for managing fragments in activity. It keeps track of
        // the fragment lifecycle and handles transactions involving fragments.
        val fragmentManager = supportFragmentManager

        //Fragment Transaction:  used to define a set of operations to be perform on fragments.
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        //Replacing the frameLayout with new fragment.
        fragmentTransaction.replace(R.id.frame_layout_1, fragment)
        fragmentTransaction.commit()

        drawerLayout.closeDrawers()
        setTitle(title)
    }
}