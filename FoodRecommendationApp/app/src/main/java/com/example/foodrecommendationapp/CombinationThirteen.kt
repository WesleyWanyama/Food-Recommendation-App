package com.example.foodrecommendationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_diabetic.*

class CombinationThirteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combination_thirteen)

        val adapter = C13ViewPagerAdapter(supportFragmentManager,lifecycle)
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