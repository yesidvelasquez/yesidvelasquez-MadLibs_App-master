package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class All_Histories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_histories)

        val historia1 : Button = findViewById(R.id.history1)
        val historia2 : Button = findViewById(R.id.history2)
        val back : Button = findViewById(R.id.atras)

        historia1.setOnClickListener()
        {
            val intent1 = Intent (this, Get_Words :: class.java)
            startActivity(intent1)
        }

        historia2.setOnClickListener()
        {
            val intent1 = Intent (this, Get_Words2 :: class.java)
            startActivity(intent1)
        }

        back.setOnClickListener()
        {
            val intent3 = Intent (this, MainActivity :: class.java)
            startActivity(intent3)
        }
    }
}