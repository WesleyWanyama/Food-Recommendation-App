package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C17Carbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c17_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c17CarbohydrateRecycler)

        val carbohydrates = mutableListOf(Food(R.drawable.tofu_fried_rice, "Tofu Fried Rice"),
            Food(R.drawable.sweet_potatoes, "Sweet Potatoes"),
            Food(R.drawable.whole_grain_bread, "Whole Grain Bread"),
            Food(R.drawable.whole_grain_rice, "Whole Grain Rice"))

        var foodAdapter = FoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}