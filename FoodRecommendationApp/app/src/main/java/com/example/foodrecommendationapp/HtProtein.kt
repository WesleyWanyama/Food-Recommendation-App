package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HtProtein : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ht_protein, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.htProteinRecycler)

        val protein = mutableListOf(Food(R.drawable.shrimp, "Shrimp"),
            Food(R.drawable.baked_salmon, "Baked Salmon"),
            Food(R.drawable.prawn, "Prawns"),
            Food(R.drawable.crab, "Crabs"),
            Food(R.drawable.tuna, "Tuna"),
            Food(R.drawable.mussel, "Mussels"),
            Food(R.drawable.low_fat_milk, "Low-fat Milk"),
            Food(R.drawable.boiled_eggs, "Boiled Fresh Eggs"),
            Food(R.drawable.skinless_chicken, "Skinless Chicken"))

        var foodAdapter = HtFoodAdapter(protein)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}