package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C29Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c29_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c29VitaminRecycler)

        val vitamins = mutableListOf(
            Food(R.drawable.apple, "Apples"),
            Food(R.drawable.zucchini, "Zucchini"),
            Food(R.drawable.carrot, "Carrots"),
            Food(R.drawable.blackberries, "Blackberries"),
            Food(R.drawable.chili_pepper, "Chili Pepper"),
            Food(R.drawable.kale, "Kale"),
            Food(R.drawable.vegetable_salad, "Vegetable Salad"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}