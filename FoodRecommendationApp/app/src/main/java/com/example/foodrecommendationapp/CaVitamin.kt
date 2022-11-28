package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class  CaVitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ca_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.caVitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.broccoli, "Broccoli"),
            Food(R.drawable.cauliflower, "Cauliflower"),
            Food(R.drawable.cabbage, "Cabbage"),
            Food(R.drawable.kale, "Kale"),
            Food(R.drawable.brussels_sprouts, "Brussel Sprouts"),
            Food(R.drawable.vegetable_frittata, "Vegetable Frittata"),
            Food(R.drawable.mushroom_soup, "Mushroom Soup"),
            Food(R.drawable.carrot_soup, "Carrot Soup"),
            Food(R.drawable.roasted_asparagus_salad, "Roasted Asparagus Salad"),
            Food(R.drawable.vegetable_soup, "Vegetable Soup"),
            Food(R.drawable.berries, "Berries"),
            Food(R.drawable.orange, "Oranges"),
            Food(R.drawable.apple, "Apples"),
            Food(R.drawable.pear, "Pears"),
            Food(R.drawable.pumpkin_soup, "Pumpkin Soup"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}