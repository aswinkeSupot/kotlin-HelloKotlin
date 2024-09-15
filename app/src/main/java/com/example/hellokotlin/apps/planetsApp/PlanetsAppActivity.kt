package com.example.hellokotlin.apps.planetsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.hellokotlin.R

class PlanetsAppActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planets_app)

        // 1. The View: ListView
        val listView :ListView = findViewById(R.id.list_planet)

        // 2. The Data Source: List<Planet>
        val planet1 = PlanetDataClass("Mercury", "0 Moons", R.drawable.planet1)
        val planet2 = PlanetDataClass("Venus", "0 Moons", R.drawable.planet2)
        val planet3 = PlanetDataClass("Earth", "1 Moons", R.drawable.planet3)
        val planet4 = PlanetDataClass("Mars", "2 Moons", R.drawable.planet4)
        val planet5 = PlanetDataClass("Jupiter", "79 Moons", R.drawable.planet5)
        val planet6 = PlanetDataClass("Saturn", "83 Moons", R.drawable.planet6)
        val planet7 = PlanetDataClass("Uranus", "27 Moons", R.drawable.planet7)
        val planet8 = PlanetDataClass("Neptune", "14 Moons", R.drawable.planet8)

        var planetList = ArrayList<PlanetDataClass>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)

        // 3. Create an Adapter
        var adapter = PlanetCustomAdapter(this, planetList)

        listView.adapter = adapter

    }
}