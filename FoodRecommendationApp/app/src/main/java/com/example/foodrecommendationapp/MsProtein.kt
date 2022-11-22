package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MsProtein : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ms_protein, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.msProteinRecycler)

        val protein = mutableListOf(MsFood(R.drawable.boiled_eggs, "Boiled Eggs"),
            MsFood(R.drawable.low_fat_milk, "Low-fat Milk"),
            MsFood(R.drawable.baked_salmon, "Salmon"),
            MsFood(R.drawable.sardines, "Sardines"),
            MsFood(R.drawable.tuna, "Tuna"),
            MsFood(R.drawable.skinless_chicken, "Skinless Chicken"),
            MsFood(R.drawable.bone_soup, "Bone Soup"),
            MsFood(R.drawable.greek_yoghurt, "Greek Yoghurt"))

        var foodAdapter = MsFoodAdapter(protein)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}