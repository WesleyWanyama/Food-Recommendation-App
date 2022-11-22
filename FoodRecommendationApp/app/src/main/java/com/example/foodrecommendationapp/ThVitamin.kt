package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThVitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_th_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.thVitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.turkey, "Turkey"),
            Food(R.drawable.chicken, "Chicken"),
            Food(R.drawable.fish, "Fish"),
            Food(R.drawable.egg_york, "Egg York"),
            Food(R.drawable.red_meat, "Red Meat"),
            Food(R.drawable.cheese, "Cheese"),
            Food(R.drawable.baked_salmon, "Baked Salmon"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}