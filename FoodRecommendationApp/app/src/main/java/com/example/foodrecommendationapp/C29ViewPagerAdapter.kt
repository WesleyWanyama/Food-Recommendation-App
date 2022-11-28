package com.example.foodrecommendationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class C29ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                C29Protein()
            }
            1->{
                C29Carbohydrate()
            }
            2->{
                C29Vitamin()
            }
            else->{
                Fragment()
            }
        }
    }
}