package com.example.foodrecommendationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class BpViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }
        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> {
                    BpProtein()
                }
                1 -> {
                    BpCarbohydrate()
                }
                2 -> {
                    BpVitamin()
                }
                else -> {
                    Fragment()
                }
            }
        }
    }
