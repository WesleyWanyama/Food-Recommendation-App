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

        val carbohydrates = mutableListOf(CaFood(R.drawable.oatmeal, "Oatmeal"),
            CaFood(R.drawable.pancakes, "Pancakes"),
            CaFood(R.drawable.muffins, "Muffins"),
            CaFood(R.drawable.black_beans, "Black Beans"),
            CaFood(R.drawable.corn_salad, "Corn Salad"),
            CaFood(R.drawable.brown_rice, "Brown Rice"),
            CaFood(R.drawable.brown_bread, "Brown Whole Grain Bread"),
            CaFood(R.drawable.whole_grain_bagels, "Whole Grain Bagels"),
            CaFood(R.drawable.sweet_potato_wedges, "Sweet Potato Wedges"),
            CaFood(R.drawable.tofu_fried_rice, "Tofu Fried Rice"))

        var foodAdapter = CaFoodAdapter(carbohydrates)

        recyclerview.adapter = foodAdapter

        recyclerview.layoutManager = LinearLayoutManager(activity)

        super.onViewCreated(view, savedInstanceState)

    }



}