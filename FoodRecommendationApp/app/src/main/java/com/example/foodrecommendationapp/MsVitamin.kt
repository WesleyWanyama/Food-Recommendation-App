package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MsVitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ms_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.msVitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.raspberries, "Raspberries"),
            Food(R.drawable.blackberries, "Blackberries"),
            Food(R.drawable.pear, "Pears"),
            Food(R.drawable.chili_pepper, "Chili Pepper"),
            Food(R.drawable.kale, "Kale"),
            Food(R.drawable.spinach, "Spinach"),
            Food(R.drawable.vegetable_soup, "Vegetable Soup"),
            Food(R.drawable.mushroom_soup, "Mushroom Soup"),
            Food(R.drawable.vegetable_salad, "Vegetable Salad"),
            Food(R.drawable.apple, "Apples"),
            Food(R.drawable.kiwi, "Kiwi"),
            Food(R.drawable.zucchini, "Zucchini"),
            Food(R.drawable.carrot, "Carrots"))

        var foodAdapter = MsFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}