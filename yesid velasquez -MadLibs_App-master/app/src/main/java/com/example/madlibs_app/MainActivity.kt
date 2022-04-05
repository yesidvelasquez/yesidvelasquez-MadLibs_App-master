package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById (R.id.button);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, All_Histories::class.java)
            startActivity(intento1)
        }
    }





}