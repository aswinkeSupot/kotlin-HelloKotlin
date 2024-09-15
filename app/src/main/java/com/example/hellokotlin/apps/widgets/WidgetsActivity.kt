package com.example.hellokotlin.apps.widgets

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.hellokotlin.R

class WidgetsActivity : AppCompatActivity() {

    private lateinit var checkBox: CheckBox

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widgets)

        checkBoxImplementation()
        radioButtonImplementation()
        spinnerImplementation()
        progressBarStyleHorizontalImplementation()
        datePickerImplementation()
        timePickerImplementaion()

    }

    private fun checkBoxImplementation(){
        //Initializing CheckBox
        checkBox = findViewById(R.id.checkBox)

        //Handle checkbox state changes
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Checkbox is unChecked
                Log.d("WidgetsActivity", "checkBoxImplementation: Checked")
            } else {
                // Checkbox is unChecked
            }
        }
    }

    private fun radioButtonImplementation(){
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val cheeseRB = findViewById<RadioButton>(R.id.cheeseRadioButton)
        val spiceRB = findViewById<RadioButton>(R.id.spiceRadioButton)
        val onionRB = findViewById<RadioButton>(R.id.onionRadioButton)

        // Detecting the selected radio button
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.cheeseRadioButton -> {
                    Log.d("WidgetsActivity", "radioButtonImplementation: Cheese selected")
                    Toast.makeText(this, "Cheese selected",Toast.LENGTH_LONG).show()
                }
                R.id.spiceRadioButton -> {
                    Log.d("WidgetsActivity", "radioButtonImplementation: Spice selected")
                    Toast.makeText(this, "Spice selected",Toast.LENGTH_LONG).show()
                }

                R.id.onionRadioButton -> {
                    Log.d("WidgetsActivity", "radioButtonImplementation: Onion selected")
                    Toast.makeText(this, "Onion selected",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun spinnerImplementation(){
        val mySpinner = findViewById<Spinner>(R.id.mySpinner)

        val operatingSystems = arrayOf("Windows", "iOS", "Android", "Linux")

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, operatingSystems)

        mySpinner.adapter = adapter

        mySpinner.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                val selectedItem = parent?.getItemAtPosition(position).toString()
                // OR
                val selectedItem = operatingSystems[position]

                Log.d("WidgetsActivity", "onItemSelected: $selectedItem")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }

    private fun progressBarStyleHorizontalImplementation(){
        val progressBar: ProgressBar = findViewById(R.id.myProgressBar2)

        val progressvalue = 60
        progressBar.progress = progressvalue
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun datePickerImplementation(){
        val datePicker = findViewById<DatePicker>(R.id.datePicker)

        datePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            Log.d("WidgetsActivity", "datePickerImplementation: Year:$year , Month:${monthOfYear+1} , Day:$dayOfMonth")
        }
    }

    private fun timePickerImplementaion(){
        val timePicker: TimePicker = findViewById(R.id.timePicker)

        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            // view = View : represents the TimePicker itself
            // hourOfDay = HourOfDay : Selected hour in 24-hour format
            // minute = Minute : selected minute

            // Formatting the selected time : hh:mm
            val selectedTime = String.format("%02d:%02d", hourOfDay, minute)

            Log.d("WidgetsActivity", "timePickerImplementaion: $selectedTime")

        }
    }

}