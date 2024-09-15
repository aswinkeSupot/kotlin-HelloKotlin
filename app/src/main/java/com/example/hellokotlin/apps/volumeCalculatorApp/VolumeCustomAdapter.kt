package com.example.hellokotlin.apps.volumeCalculatorApp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.hellokotlin.R

class VolumeCustomAdapter (context: Context, private val gridItem:List<ShapesDataClass>)
    : ArrayAdapter<ShapesDataClass>(context, 0, gridItem) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView = convertView
        var holder: ViewHolder

        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.item_volume_gridview, parent, false)

            holder = ViewHolder()
            holder.volumeImageView = itemView.findViewById(R.id.volumeImageView)
            holder.txtView = itemView.findViewById(R.id.txtVolume)

            itemView.tag = holder
        }else {
            holder = itemView?.tag as ViewHolder
        }

        // Bind data to views.
        val currentItem = gridItem[position]
        holder.volumeImageView.setImageResource(currentItem.shapeImg)
        holder.txtView.text = currentItem.shapeName

        // !! : Non-Null Assertion Operation
        return itemView!!
    }

    private class ViewHolder{
        lateinit var volumeImageView: ImageView
        lateinit var txtView: TextView
    }
}