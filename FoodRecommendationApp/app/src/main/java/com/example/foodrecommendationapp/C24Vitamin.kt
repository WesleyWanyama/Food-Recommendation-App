package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C24Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c24_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c24VitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.vegetable_salad, "Vegetable Salad"),
            Food(R.drawable.orange, "Oranges"),
            Food(R.drawable.blackberries, "Blackberries"),
            Food(R.drawable.pear, "Pears"),
            Food(R.drawable.kale, "Kale"),
            Food(R.drawable.apple, "Apples"),
            Food(R.drawable.kiwi, "Kiwi"),
            Food(R.drawable.carrot, "Carrots"),
            Food(R.drawable.zucchini, "Zucchini"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}