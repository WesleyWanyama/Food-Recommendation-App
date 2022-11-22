package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CaCarbohydrate : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ca_carbohydrate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerview: RecyclerView = view.findViewById(R.id.caCarbohydrateRecycler)

        val carbohydrates = mutableListOf(Food(R.drawable.oatmeal, "Oatmeal"),
            Food(R.drawable.pancakes, "Pancakes"),
            Food(R.drawable.muffins, "Muffins"),
            Food(R.drawable.black_beans, "Black Beans"),
            Food(R.drawable.corn_salad, "Corn Salad"),
            Food(R.drawable.brown_rice, "Brown Rice"),
            Food(R.drawable.brown_bread, "Brown Whole Grain Bread"),
            Food(R.drawable.whole_grain_bagels, "Whole Grain Bagels"),
            Food(R.drawable.sweet_potato_wedges, "Sweet Potato Wedges"),
            Food(R.drawable.tofu_fried_rice, "Tofu Fried Rice"))

        var foodAdapter = CaFoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}