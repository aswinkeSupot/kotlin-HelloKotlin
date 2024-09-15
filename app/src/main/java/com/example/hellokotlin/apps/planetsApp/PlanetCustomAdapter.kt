package com.example.hellokotlin.apps.planetsApp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.hellokotlin.R

class PlanetCustomAdapter(val context: Context,val planets:List<PlanetDataClass>): BaseAdapter() {
    override fun getCount(): Int {
        // Returns the number of items in the data set
        return planets.size
    }

    override fun getItem(position: Int): Any {
        // Returns the data item associated with the specified position in list
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        // Returns a unique identifier for the item at the specified position.
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Returns a view that displays the data at the specified position in the list

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View

        if (convertView == null){
            // Inflate a new View
            view = inflater.inflate(R.layout.item_planet_listview, parent, false)
        } else {
            //Reuse the convert View
            view = convertView
        }

        //Bind data to the view
        val item = getItem(position) as PlanetDataClass

        // Initialize the views
        val txtPlanetName = view.findViewById<TextView>(R.id.txtPlanetName)
        val txtPlanetMoonCount = view.findViewById<TextView>(R.id.txtPlanetMoonCount)
        val imgPlanet = view.findViewById<ImageView>(R.id.imgPlanet)

        txtPlanetName.text = item.title
        txtPlanetMoonCount.text = item.moonCount
        imgPlanet.setImageResource(item.imagePlanet)

        // Handling the click event on listview item
        view.setOnClickListener {
            Log.d("PlanetCustomAdapter", "getView: onCLick ${planets[position].title}")
        }

        return view

    }
}