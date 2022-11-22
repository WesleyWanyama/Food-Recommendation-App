package com.example.foodrecommendationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MsFoodAdapter( val mList: List<MsFood>): RecyclerView.Adapter<MsFoodAdapter.FoodViewHolder>() {
    //inner class creates the views to be populated with data received from the adapter class
    inner class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)


    //Override abstract methods
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MsFoodAdapter.FoodViewHolder{

        //Inflate food info
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_items, parent, false)

        return FoodViewHolder(view)
    }

    //Binds the list items to a view
    override fun onBindViewHolder(holder: MsFoodAdapter.FoodViewHolder, position: Int) {
        var foodImage: ImageView = holder.itemView.findViewById(R.id.foodImage)
        var foodText: TextView = holder.itemView.findViewById(R.id.foodText)

        val MsFood = mList[position]

        foodImage.setImageResource(MsFood.image)

        foodText.text = MsFood.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}