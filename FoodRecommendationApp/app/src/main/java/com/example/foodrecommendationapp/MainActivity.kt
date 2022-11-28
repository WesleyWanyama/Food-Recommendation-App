package com.example.foodrecommendationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity


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
        var c6Intent = Intent(this, CombinationSix::class.java)
        var c7Intent = Intent(this, CombinationSeven::class.java)
        var c8Intent = Intent(this, CombinationEight::class.java)
        var c9Intent = Intent(this, CombinationNine::class.java)
        var c10Intent = Intent(this, CombinationTen::class.java)
        var c11Intent = Intent(this, CombinationEleven::class.java)
        var c12Intent = Intent(this, CombinationTwelve::class.java)
        var c13Intent = Intent(this, CombinationThirteen::class.java)
        var c14Intent = Intent(this, CombinationFourteen::class.java)
        var c15Intent = Intent(this, CombinationFifteen::class.java)
        var c16Intent = Intent(this, CombinationSixteen::class.java)
        var c17Intent = Intent(this, CombinationSeventeen::class.java)
        var c18Intent = Intent(this, CombinationEighteen::class.java)
        var c19Intent = Intent(this, CombinationNineteen::class.java)
        var c20Intent = Intent(this, CombinationTwenty::class.java)
        var c21Intent = Intent(this, CombinationTwentyone::class.java)
        var c22Intent = Intent(this, CombinationTwentytwo::class.java)
        var c23Intent = Intent(this, CombinationTwentythree::class.java)
        var c24Intent = Intent(this, CombinationTwentyfour::class.java)
        var c25Intent = Intent(this, CombinationTwentyfive::class.java)
        var c26Intent = Intent(this, CombinationTwentySix::class.java)
        var c27Intent = Intent(this, CombinationTwentySeven::class.java)
        var c28Intent = Intent(this, CombinationTwentyEight::class.java)
        var c29Intent = Intent(this, CombinationTwentyNine::class.java)
        var c30Intent = Intent(this, CombinationThirty::class.java)

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
                startActivity(c6Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 7
                startActivity(c7Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 8
                startActivity(c8Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 9
                startActivity(c9Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 10
                startActivity(c10Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 11
                startActivity(c11Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 12
                startActivity(c12Intent)
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 13
                startActivity(c13Intent)
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 14
                startActivity(c14Intent)
            }else if(dbNo.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 15
                startActivity(c15Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msNo.isChecked){
                //combination 16
                startActivity(c16Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 17
                startActivity(c17Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 18
                startActivity(c18Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 19
                startActivity(c19Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 20
                startActivity(c20Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 21
                startActivity(c21Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 22
                startActivity(c22Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 23
                startActivity(c23Intent)
            }else if(dbNo.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 24
                startActivity(c24Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msNo.isChecked){
                //combination 25
                startActivity(c25Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caNo.isChecked && msYes.isChecked){
                //combination 26
                startActivity(c26Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thNo.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 27
                startActivity(c27Intent)
            }else if(dbYes.isChecked && bpNo.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 28
                startActivity(c28Intent)
            }else if(dbNo.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 29
                startActivity(c29Intent)
            }else if(dbYes.isChecked && bpYes.isChecked && thYes.isChecked && caYes.isChecked && msYes.isChecked){
                //combination 30
                startActivity(c30Intent)
            }
        }




    }
}