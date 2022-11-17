package com.example.foodrecommendationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiabeticActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetic)

        val buttonDB: Button = findViewById(R.id.btnSubmit)

        buttonDB.setOnClickListener{
            val dbfIntent = Intent(this, DisplayDiabeticFood::class.java)

            startActivity(dbfIntent)
        }
    }
}