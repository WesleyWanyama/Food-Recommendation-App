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

        val vitamins = mutableListOf(MsFood(R.drawable.raspberries, "Raspberries"),
            MsFood(R.drawable.blackberries, "Blackberries"),
            MsFood(R.drawable.pear, "Pears"),
            MsFood(R.drawable.chili_pepper, "Chili Pepper"),
            MsFood(R.drawable.kale, "Kale"),
            MsFood(R.drawable.spinach, "Spinach"),
            MsFood(R.drawable.vegetable_soup, "Vegetable Soup"),
            MsFood(R.drawable.mushroom_soup, "Mushroom Soup"),
            MsFood(R.drawable.vegetable_salad, "Vegetable Salad"),
            MsFood(R.drawable.apple, "Apples"),
            MsFood(R.drawable.kiwi, "Kiwi"),
            MsFood(R.drawable.zucchini, "Zucchini"),
            MsFood(R.drawable.carrot, "Carrots"))

        var foodAdapter = MsFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}