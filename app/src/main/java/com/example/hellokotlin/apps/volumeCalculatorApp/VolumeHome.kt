package com.example.hellokotlin.apps.volumeCalculatorApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import com.example.hellokotlin.R

class VolumeHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_home)

        val gridView: GridView = findViewById(R.id.gridViewVolume)

        // The Data Source
        var shape1 = ShapesDataClass(R.drawable.shape1,"Sphere")
        var shape2 = ShapesDataClass(R.drawable.shape2,"Cube")
        var shape3 = ShapesDataClass(R.drawable.shape3,"Cylinder")
        var shape4 = ShapesDataClass(R.drawable.shape4,"Prism")

        val gridItems = listOf<ShapesDataClass>(
            shape1,shape2,shape3,shape4)

        // The Adapter
        val customAdapter = VolumeCustomAdapter(this, gridItems)
        gridView.adapter = customAdapter
        
        // Handling the click events on gridview items
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            val clickedItem = customAdapter.getItem(position)
            val name = clickedItem?.shapeName.toString()
            val i = Intent(this, ShapesSecondActivity::class.java)
            i.putExtra("KEY_NAME", name)
            startActivity(i)

        }
    }
}