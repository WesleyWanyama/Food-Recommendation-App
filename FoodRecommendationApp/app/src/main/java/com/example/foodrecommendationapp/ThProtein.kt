package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThProtein : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_th_protein, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.thProteinRecycler)

        val proteins = mutableListOf(ThFood(R.drawable.baked_fish, "Baked Fish"),
            ThFood(R.drawable.lean_meat, "Lean Meat"),
            ThFood(R.drawable.eggs, "Eggs"),
            ThFood(R.drawable.milk, "Milk"),
            ThFood(R.drawable.natural_yoghurt, "Natural Yoghurt"))

        var foodAdapter = ThFoodAdapter(proteins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}