package com.example.foodrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_diabetic.*

class CombinationTwentyNine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combination_twenty_nine)

        val adapter = C29ViewPagerAdapter(supportFragmentManager,lifecycle)
        //Connect view page adapter to the adapter
        viewPager.adapter = adapter

        TabLayoutMediator(tablayout,viewPager){tab, position->
            when(position){
                0->{
                    tab.text="Protein"
                }
                1->{
                    tab.text="Carbohydrates"
                }
                2->{
                    tab.text="Vitamins"
                }
            }
        }.attach()
    }
}