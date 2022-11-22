package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThVitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_th_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.thVitaminRecycler)

        val vitamins = mutableListOf(Food(R.drawable.citrus_fruits, "Citrus Fruits"),
            Food(R.drawable.plums, "Plums"),
            Food(R.drawable.pear, "Pears"),
            Food(R.drawable.apple, "Apples"),
            Food(R.drawable.pineapples, "Pineapples"),
            Food(R.drawable.pawpaw, "Pawpaw"),
            Food(R.drawable.lemon, "Lemons"),
            Food(R.drawable.pawpaw, "Pawpaw"),
            Food(R.drawable.guava, "Guava"),
            Food(R.drawable.carrot, "Carrots"),
            Food(R.drawable.cauliflower, "Cauliflower"),
            Food(R.drawable.radishes, "Radishes"),
            Food(R.drawable.brussels_sprouts, "Brussels"),
            Food(R.drawable.bell_peppers, "Bell Peppers"))

        var foodAdapter = ThFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}