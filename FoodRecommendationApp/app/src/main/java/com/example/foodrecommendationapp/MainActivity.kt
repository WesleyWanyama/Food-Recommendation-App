package com.example.foodrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.content.Context
import android.content.Intent
import android.widget.RadioButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Radio Buttons
        var dbYes: RadioButton = findViewById(R.id.dbYes)
        var dbNo: RadioButton = findViewById(R.id.dbNo)
        var bpYes: RadioButton = findViewById(R.id.bpYes)
        var bpNo: RadioButton = findViewById(R.id.bpNo)
        var thYes: RadioButton = findViewById(R.id.thYes)
        var thNo: RadioButton = findViewById(R.id.thNo)
        var caYes: RadioButton = findViewById(R.id.caYes)
        var caNo: RadioButton = findViewById(R.id.caNo)
        var msYes: RadioButton = findViewById(R.id.msYes)
        var msNo: RadioButton = findViewById(R.id.msNo)

        //Submit Button
        var submit : Button = findViewById(R.id.btnSubmit)

        //Declaring the intents
        var dbIntent = Intent(this, DiabeticActivity::class.java)
        var bpIntent = Intent(this, BpActivity::class.java)
        var thIntent = Intent(this, ThyroidActivity::class.java)
        var caIntent = Intent(this, CancerActivity::class.java)
        var msIntent = Intent(this, MsActivity::class.java)

        //On clicking submit button
        submit.setOnClickListener {
            if(dbYes.isChecked && dbNo.isChecked && bpNo.isChecked && thNo.isChecked && caNo.isChecked && msNo.isChecked){
                startActivity(dbIntent)
            }else if(bpYes.isChecked && dbNo.isChecked && thNo.isChecked && caNo.isChecked && msNo.isChecked){
                startActivity(bpIntent)
            }else if(thYes.isChecked  && dbNo.isChecked && bpNo.isChecked && caNo.isChecked && msNo.isChecked){
                startActivity(thIntent)
            }else if(caYes.isChecked  && dbNo.isChecked && bpNo.isChecked && thNo.isChecked && msNo.isChecked){
                startActivity(caIntent)
            }else if(msYes.isChecked  && dbNo.isChecked && bpNo.isChecked && thNo.isChecked && caNo.isChecked){
                startActivity(msIntent)
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 6
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 7
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 8
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 9
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 10
            }else if(dbNo.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 11
            }else if(dbNo.isChecked && bpYes.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 12
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 13
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 14
            }else if(dbNo.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 15
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 16
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 17
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 18
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 19
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 20
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 21
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 22
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 23
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 24
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 25
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 26
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 27
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 28
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 29
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 30
            }
        }




    }
}