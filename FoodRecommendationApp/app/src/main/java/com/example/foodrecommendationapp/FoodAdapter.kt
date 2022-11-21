package com.example.foodrecommendationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(val mList: List<Food>):RecyclerView.Adapter<FoodAdapter.ViewHolder>(){
    class ViewHolder {

    }

    //Override abstract methods
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FoodAdapter.ViewHolder{

        //Inflate food info
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_items, parent, false)

        return ViewHolder(view)
    }

    //Binds the list items to a view
    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}