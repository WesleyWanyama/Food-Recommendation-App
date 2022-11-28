package com.example.foodrecommendationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DbProtein : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_db_protein, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.dbProteinRecycler)

        val proteins = mutableListOf(Food(R.drawable.turkey, "Turkey"),
            Food(R.drawable.chicken, "Chicken"),
            Food(R.drawable.fish, "Fish"),
            Food(R.drawable.egg_york, "Egg York"),
            Food(R.drawable.red_meat, "Red Meat"),
            Food(R.drawable.cheese, "Cheese"),
            Food(R.drawable.baked_salmon, "Baked Salmon"))

        var foodAdapter = FoodAdapter(proteins)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}