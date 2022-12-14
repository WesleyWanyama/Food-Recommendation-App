package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C8Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c8_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c8VitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.spinach, "Spinach"),
            Food(R.drawable.berries, "Berries"),
            Food(R.drawable.peach   , "Peaches"),
            Food(R.drawable.red_cabbage, "Red Cabbages"),
            Food(R.drawable.vegetable_soup, "Vegetable Soup"),
            Food(R.drawable.kiwi, "Kiwi"),
            Food(R.drawable.bell_peppers, "Bell Peppers"),
            Food(R.drawable.tomatoes, "Tomatoes"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}