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

        val vitamins = mutableListOf(ThFood(R.drawable.citrus_fruits, "Citrus Fruits"),
            ThFood(R.drawable.plums, "Plums"),
            ThFood(R.drawable.pear, "Pears"),
            ThFood(R.drawable.apple, "Apples"),
            ThFood(R.drawable.pineapples, "Pineapples"),
            ThFood(R.drawable.pawpaw, "Pawpaw"),
            ThFood(R.drawable.lemon, "Lemons"),
            ThFood(R.drawable.pawpaw, "Pawpaw"),
            ThFood(R.drawable.guava, "Guava"),
            ThFood(R.drawable.carrot, "Carrots"),
            ThFood(R.drawable.cauliflower, "Cauliflower"),
            ThFood(R.drawable.radishes, "Radishes"),
            ThFood(R.drawable.brussels_sprouts, "Brussels"),
            ThFood(R.drawable.bell_peppers, "Bell Peppers"))

        var foodAdapter = ThFoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}