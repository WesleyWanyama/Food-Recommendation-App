package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MsCarbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ms_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.msCarbohydrateRecycler)

        val carbohydrates = mutableListOf(MsFood(R.drawable.whole_grain_bread, "Whole Grain Bread"),
            MsFood(R.drawable.barley, "Barley"),
            MsFood(R.drawable.oatmeal, "Oatmeal"),
            MsFood(R.drawable.whole_grain_rice, "Whole Grain Rice"),
            MsFood(R.drawable.lentils, "Lentils"),
            MsFood(R.drawable.beans, "Beans"),
            MsFood(R.drawable.flax_seeds, "Flaxseeds"),
            MsFood(R.drawable.tofu, "Tofu"),
            MsFood(R.drawable.baked_potatoes, "Baked Potatoes"),
            MsFood(R.drawable.arrow_roots, "Arrow Roots"))

        var foodAdapter = MsFoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}