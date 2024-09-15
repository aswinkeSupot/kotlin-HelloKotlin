package com.example.hellokotlin.apps.groceryApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hellokotlin.R

class GroceryAdapter(val itemList: ArrayList<GroceryDataClass>)
    : RecyclerView.Adapter<GroceryAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        var grocery_image: ImageView
        var grocery_title_text: TextView
        var grocery_description_text: TextView

        init {
            grocery_image = itemView.findViewById(R.id.grocery_image)
            grocery_title_text = itemView.findViewById(R.id.grocery_title_text)
            grocery_description_text = itemView.findViewById(R.id.grocery_description_text)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"Clicked ${itemList[adapterPosition].name}",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_grocery_recyclerview, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.grocery_title_text.setText(itemList[position].name)
        holder.grocery_description_text.setText(itemList[position].desc)
        holder.grocery_image.setImageResource(itemList[position].img)
    }
}