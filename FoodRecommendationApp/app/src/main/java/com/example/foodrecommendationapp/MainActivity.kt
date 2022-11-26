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
        val buttonBP: Button = findViewById(R.id.btnBP)
        val buttonTh: Button = findViewById(R.id.btnThyroid)
        val buttonCa: Button = findViewById(R.id.btnCancer)
        val buttonMS: Button = findViewById(R.id.btnMetabolicSyndrome)
        val buttonHt: Button = findViewById(R.id.btnHeart)



        buttonDB.setOnClickListener{
            val dbIntent = Intent(this, DiabeticActivity::class.java)

            startActivity(dbIntent)
        }

        buttonBP.setOnClickListener{
            val bpIntent = Intent(this, BpActivity::class.java)

            startActivity(bpIntent)
        }

        buttonTh.setOnClickListener{
            val thIntent = Intent(this, ThyroidActivity::class.java)

            startActivity(thIntent)
        }
        buttonCa.setOnClickListener{
            val caIntent = Intent(this, CancerActivity::class.java)

            startActivity(caIntent)
        }
        buttonMS.setOnClickListener{
            val msIntent = Intent(this, MsActivity::class.java)

            startActivity(msIntent)
        }
        buttonHt.setOnClickListener{
            val htIntent = Intent(this, HeartActivity::class.java)

            startActivity(htIntent)
        }
    }
}