package com.example.foodrecommendationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class C26ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                C26Protein()
            }
            1->{
                C26Carbohydrate()
            }
            2->{
                C26Vitamin()
            }
            else->{
                Fragment()
            }
        }
    }
}