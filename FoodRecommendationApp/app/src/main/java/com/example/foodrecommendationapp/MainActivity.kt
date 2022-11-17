package com.example.foodrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.content.Context
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDB: Button = findViewById(R.id.btnDiabetes)

        buttonDB.setOnClickListener{
            val dbIntent = Intent(this, DiabeticActivity::class.java)

            startActivity(dbIntent)
        }
    }
}