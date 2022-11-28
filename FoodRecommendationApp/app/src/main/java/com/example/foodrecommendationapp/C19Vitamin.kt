package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class  C19Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c19_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c19VitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.apple, "Apple"),
            Food(R.drawable.cauliflower, "Cauliflower"),
            Food(R.drawable.cabbage, "Cabbage"),
            Food(R.drawable.brussels_sprouts, "Brussel Sprouts"),
            Food(R.drawable.vegetable_frittata, "Vegetable Frittata"),
            Food(R.drawable.pumpkin_soup, "Pumpkin Soup"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}