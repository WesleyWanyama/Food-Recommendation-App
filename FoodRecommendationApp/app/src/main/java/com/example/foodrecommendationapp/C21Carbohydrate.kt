package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C21Carbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c21_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c21CarbohydrateRecycler)

        val carbohydrate = mutableListOf(Food(R.drawable.chicken, "Chicken"),
            Food(R.drawable.skinless_chicken, "Skinless Chicken"),
            Food(R.drawable.lean_meat, "Lean Meat"),
            Food(R.drawable.natural_yoghurt, "Natural Yoghurt"))

        var foodAdapter = FoodAdapter(carbohydrate)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}