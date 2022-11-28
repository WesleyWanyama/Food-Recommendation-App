package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class C24Carbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c24_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.c24CarbohydrateRecycler)

        val carbohydrates = mutableListOf(Food(R.drawable.oatmeal, "Tofu"),
            Food(R.drawable.pancakes, "Pancakes"),
            Food(R.drawable.muffins, "Muffins"),
            Food(R.drawable.black_beans, "Black Beans"),
            Food(R.drawable.corn_salad, "Corn Salad"),
            Food(R.drawable.sweet_potato_wedges, "Sweet Potato Wedges"),
            Food(R.drawable.tofu_fried_rice, "Tofu Fried Rice"))

        var foodAdapter = FoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}