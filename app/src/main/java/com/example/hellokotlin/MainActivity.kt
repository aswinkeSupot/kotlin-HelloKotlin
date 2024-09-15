package com.example.hellokotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.hellokotlin.apps.adapterApp.AdapterMainActivity
import com.example.hellokotlin.apps.broadcastApp.BroadcastAppActivity
import com.example.hellokotlin.apps.constraintTestApp.ConstraintTestActivity
import com.example.hellokotlin.apps.curencyConverterApp.CurrencyConverterActivity
import com.example.hellokotlin.apps.databindingApp.DatabindingHomeActivity
import com.example.hellokotlin.apps.fragmentsApp.FragmentsHomeActivity
import com.example.hellokotlin.apps.groceryApp.GroceryHomeActivity
import com.example.hellokotlin.apps.lifeCyceApp.LifeCycleActivity
import com.example.hellokotlin.apps.lotteryApp.LotteryHomeActivity
import com.example.hellokotlin.apps.navDrawerApp.NavDrawerHome
import com.example.hellokotlin.apps.planetsApp.PlanetsAppActivity
import com.example.hellokotlin.apps.servicesApp.ServicesHomeActivity
import com.example.hellokotlin.apps.viewpagerTabApp.ViewpagerTabHomeActivity
import com.example.hellokotlin.apps.volumeCalculatorApp.VolumeHome
import com.example.hellokotlin.apps.widgets.WidgetsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edName: EditText
    private lateinit var BtnCurencyConverterApp: Button
    private lateinit var BtnConstraintTestApp: Button
    private lateinit var BtnLifeCycleApp: Button
    private lateinit var BtnLotteryApp: Button
    private lateinit var BtnWidgetsApp: Button
    private lateinit var BtnAdapterApp: Button
    private lateinit var BtnPlanetsApp: Button
    private lateinit var BtnVolumeCalApp: Button
    private lateinit var BtnGroceryApp: Button
    private lateinit var BtnServicesApp: Button
    private lateinit var BtnBroadCastApp: Button
    private lateinit var BtnFragmentsApp: Button
    private lateinit var BtnNavDrawerApp: Button
    private lateinit var BtnViewpagerTabApp: Button
    private lateinit var BtnDataBindingApp: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName = findViewById(R.id.edName)
        val name = edName.text.toString()

        BtnCurencyConverterApp = findViewById(R.id.BtnCurencyConverterApp)
        BtnConstraintTestApp = findViewById(R.id.BtnConstraintTestApp)
        BtnLifeCycleApp = findViewById(R.id.BtnLifeCycleApp)
        BtnLotteryApp = findViewById(R.id.BtnLotteryApp)
        BtnWidgetsApp = findViewById(R.id.BtnWidgetsApp)
        BtnAdapterApp = findViewById(R.id.BtnAdapterApp)
        BtnPlanetsApp = findViewById(R.id.BtnPlanetsApp)
        BtnVolumeCalApp = findViewById(R.id.BtnVolumeCalApp)
        BtnGroceryApp = findViewById(R.id.BtnGroceryApp)
        BtnServicesApp = findViewById(R.id.BtnServicesApp)
        BtnBroadCastApp = findViewById(R.id.BtnBroadCastApp)
        BtnFragmentsApp = findViewById(R.id.BtnFragmentsApp)
        BtnNavDrawerApp = findViewById(R.id.BtnNavDrawerApp)
        BtnViewpagerTabApp = findViewById(R.id.BtnViewpagerTabApp)
        BtnDataBindingApp = findViewById(R.id.BtnDataBindingApp)

//        BtnCurencyConverterApp.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this@MainActivity,"Red Button Click",Toast.LENGTH_LONG).show()
//        })
        // OR
        BtnCurencyConverterApp.setOnClickListener{
            val intent = Intent(this, CurrencyConverterActivity::class.java)
            startActivity(intent)
        }

        BtnConstraintTestApp.setOnClickListener {
            val intent = Intent(this, ConstraintTestActivity::class.java)
            startActivity(intent)
        }

        BtnLifeCycleApp.setOnClickListener {
            //EXPLICIT Intent
            val intent = Intent(this, LifeCycleActivity::class.java)
            intent.putExtra("KEY_NAME","Value Aswin")
            startActivity(intent)

            // IMPLICIT Intent
//            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
//            startActivity(implicitIntent)
        }

        BtnLotteryApp.setOnClickListener {
            val intent = Intent(this, LotteryHomeActivity::class.java)
            startActivity(intent)
        }

        BtnWidgetsApp.setOnClickListener {
            val intent = Intent(this, WidgetsActivity::class.java)
            startActivity(intent)
        }

        BtnAdapterApp.setOnClickListener {
            val intent = Intent(this, AdapterMainActivity::class.java)
            startActivity(intent)
        }

        BtnPlanetsApp.setOnClickListener {
            val intent = Intent(this, PlanetsAppActivity::class.java)
            startActivity(intent)
        }

        BtnVolumeCalApp.setOnClickListener {
            val intent = Intent(this, VolumeHome::class.java)
            startActivity(intent)
        }

        BtnGroceryApp.setOnClickListener {
            val intent = Intent(this, GroceryHomeActivity::class.java)
            startActivity(intent)
        }

        BtnServicesApp.setOnClickListener {
            val intent = Intent(this, ServicesHomeActivity::class.java)
            startActivity(intent)
        }

        BtnBroadCastApp.setOnClickListener {
            val intent = Intent(this, BroadcastAppActivity::class.java)
            startActivity(intent)
        }

        BtnFragmentsApp.setOnClickListener {
            val intent = Intent(this, FragmentsHomeActivity::class.java)
            startActivity(intent)
        }

        BtnNavDrawerApp.setOnClickListener {
            val intent = Intent(this, NavDrawerHome::class.java)
            startActivity(intent)
        }

        BtnViewpagerTabApp.setOnClickListener {
            val intent = Intent(this, ViewpagerTabHomeActivity::class.java)
            startActivity(intent)
        }

        BtnDataBindingApp.setOnClickListener {
            val intent = Intent(this, DatabindingHomeActivity::class.java)
            startActivity(intent)
        }

    }

    fun colorClick(view: View) {
        val clickedButton : Button = view as Button

        when (clickedButton.tag.toString()){
            "Button1" -> {

                Toast.makeText(this@MainActivity,"Button1 Click and Name = ${edName.text}",Toast.LENGTH_LONG).show()
            }
            else -> {
                Toast.makeText(this@MainActivity,"Else",Toast.LENGTH_LONG).show()
            }

        }
    }


    /**
     * Adding Menu
     * **/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_test_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.itemHome) {
            Toast.makeText(this@MainActivity,"Home Menu Clicked",Toast.LENGTH_LONG).show()
        }else if(item.itemId == R.id.itemSetting){
            Toast.makeText(this@MainActivity,"Settings Menu Clicked",Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }


}

