package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C6Carbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c6_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c6CarbohydrateRecycler)

        val carbohydrates = mutableListOf(Food(R.drawable.soy_beans, "Soy Beans"),
            Food(R.drawable.peas, "Peas"),
            Food(R.drawable.oatmeal, "Oatmeal"),
            Food(R.drawable.lentils, "Lentils"),
            Food(R.drawable.potaoes, "Potatoes"),
            Food(R.drawable.corn, "Corn"),
            Food(R.drawable.nuts, "Nuts"))

        var foodAdapter = FoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}