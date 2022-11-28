package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C23Vitamin : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c23_vitamin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c23VitaminRecycler)

        val vitamins = mutableListOf(
            Food(R.drawable.plums, "Plums"),
            Food(R.drawable.pawpaw, "Pawpaw"),
            Food(R.drawable.bell_peppers, "Bell Peppers"),
            Food(R.drawable.carrot, "Carrots"),
            Food(R.drawable.apple, "Apples"))

        var foodAdapter = FoodAdapter(vitamins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}