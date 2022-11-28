package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C13Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c13_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c13VitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.radishes, "Radishes"),
            Food(R.drawable.broccoli, "Broccoli"),
            Food(R.drawable.lettuce, "Lettuce"),
            Food(R.drawable.kale, "Kale"),
            Food(R.drawable.zucchini, "Zucchini"),
            Food(R.drawable.watermelon, "Watermelon"),
            Food(R.drawable.sweet_melon, "Sweet Melon"),
            Food(R.drawable.kiwi, "Kiwi"),
            Food(R.drawable.citrus_fruits, "Citrus Fruits"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}