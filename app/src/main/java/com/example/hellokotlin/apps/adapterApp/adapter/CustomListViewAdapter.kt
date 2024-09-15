package com.example.hellokotlin.apps.adapterApp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.hellokotlin.R

class CustomListViewAdapter(private val context: Context, private val items:List<String>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Inflate a new view using layout inflater
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View

        if (convertView == null){
            // inflate a new view using layout inflater
            view = inflater.inflate(R.layout.item_custom_listview,parent,false)
        }else{
            // if convertView is not Null, Reuser it
            view = convertView
        }

        // Bind data to the view
        val item = getItem(position) as String
        val txtCustom = view.findViewById<TextView>(R.id.txtCustom)

        txtCustom.text = item.toString()

        return view
    }
}