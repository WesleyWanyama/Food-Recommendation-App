package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C9Carbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c9_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c9CarbohydrateRecycler)

        val carbohydrates = mutableListOf(Food(R.drawable.baked_potatoes, "Baked Potatoes"),
            Food(R.drawable.barley, "Barley"),
            Food(R.drawable.oatmeal, "Oatmeal"),
            Food(R.drawable.whole_grain_rice, "Whole Grain Rice"),
            Food(R.drawable.lentils, "Lentils"),
            Food(R.drawable.beans, "Beans"),
            Food(R.drawable.tofu, "Tofu"))

        var foodAdapter = FoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}