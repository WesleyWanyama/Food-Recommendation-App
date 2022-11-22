package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        val vitamins = mutableListOf(CaFood(R.drawable.broccoli, "Broccoli"),
            CaFood(R.drawable.cauliflower, "Cauliflower"),
            CaFood(R.drawable.cabbage, "Cabbage"),
            CaFood(R.drawable.kale, "Kale"),
            CaFood(R.drawable.brussels_sprouts, "Brussel Sprouts"),
            CaFood(R.drawable.vegetable_frittata, "Vegetable Frittata"),
            CaFood(R.drawable.mushroom_soup, "Mushroom Soup"),
            CaFood(R.drawable.carrot_soup, "Carrot Soup"),
            CaFood(R.drawable.roasted_asparagus_salad, "Roasted Asparagus Salad"),
            CaFood(R.drawable.vegetable_soup, "Vegetable Soup"),
            CaFood(R.drawable.berries, "Berries"),
            CaFood(R.drawable.orange, "Oranges"),
            CaFood(R.drawable.apple, "Apples"),
            CaFood(R.drawable.pear, "Pears"),
            CaFood(R.drawable.pumpkin_soup, "Pumpkin Soup"))

        var foodAdapter = CaFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}