package com.example.foodrecommendationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(val mList: List<Food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){
    //inner class creates the views to be populated with data received from the adapter class
    inner class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    /*inner class ViewHolder {
        val foodImage: ImageView = itemView.findViewById(R.id.foodImage)
        val foodText: TextView = itemView.findViewById(R.id.foodText)
    }*/

    //Override abstract methods
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FoodAdapter.FoodViewHolder{

        //Inflate food info
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_items, parent, false)

        return FoodViewHolder(view)
    }

    //Binds the list items to a view
    override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        var foodImage: ImageView = holder.itemView.findViewById(R.id.foodImage)
        var foodText: TextView = holder.itemView.findViewById(R.id.foodText)

        val Food = mList[position]

        foodImage.setImageResource(Food.image)

        foodText.text = Food.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}