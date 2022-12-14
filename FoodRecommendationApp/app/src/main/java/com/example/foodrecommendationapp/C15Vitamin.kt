package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C15Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c15_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c15VitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.broccoli, "Broccoli"),
            Food(R.drawable.plums, "Plums"),
            Food(R.drawable.pineapples, "Pineapples"),
            Food(R.drawable.pawpaw, "Pawpaw"),
            Food(R.drawable.lemon, "Lemons"),
            Food(R.drawable.guava, "Guava"),
            Food(R.drawable.carrot, "Carrots"),
            Food(R.drawable.cauliflower, "Cauliflower"),
            Food(R.drawable.orange_juice, "Orange Juice"),
            Food(R.drawable.brussels_sprouts, "Brussels"),
            Food(R.drawable.vegetable_soup, "Vegetable Soup"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}