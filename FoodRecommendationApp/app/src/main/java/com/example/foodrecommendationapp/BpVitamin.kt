package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BpVitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bp_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.bpVitaminRecycler)

        val vitamins = mutableListOf(BpFood(R.drawable.spinach, "Spinach"),
            BpFood(R.drawable.broccoli, "Broccoli"),
            BpFood(R.drawable.lettuce, "Lettuce"),
            BpFood(R.drawable.kale, "Kale"),
            BpFood(R.drawable.zucchini, "Zucchini"),
            BpFood(R.drawable.brussels_sprouts, "Brussel Sprouts"),
            BpFood(R.drawable.orange_juice, "Orange Juice"),
            BpFood(R.drawable.blue_berries, "Blueberries"),
            BpFood(R.drawable.apple, "Apples"),
            BpFood(R.drawable.pawpaw, "Pawpaw"),
            BpFood(R.drawable.watermelon, "Watermelon"),
            BpFood(R.drawable.sweet_melon, "Sweet Melon"),
            BpFood(R.drawable.kiwi, "Kiwi"),
            BpFood(R.drawable.banana, "Bananas"))

        var foodAdapter = BpFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}