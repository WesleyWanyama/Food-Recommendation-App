package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C15Protein : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c15_protein, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c15ProteinRecycler)

        val protein = mutableListOf(Food(R.drawable.greek_yoghurt, "Greek Yoghurt"),
            Food(R.drawable.chicken_salad, "Chicken Salad"),
            Food(R.drawable.baked_salmon, "Baked Salmon"),
            Food(R.drawable.eggs, "Eggs"),
            Food(R.drawable.sardines, "Sardines"),
            Food(R.drawable.tuna, "Tuna"))

        var foodAdapter = FoodAdapter(protein)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}