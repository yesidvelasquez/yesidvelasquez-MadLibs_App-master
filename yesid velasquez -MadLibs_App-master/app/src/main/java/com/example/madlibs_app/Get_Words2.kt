package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Get_Words2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_words2)

        val adjetivo : EditText = findViewById(R.id.adjetivo)
        val nomplu : EditText = findViewById(R.id.nomplu)
        val noun1 :EditText = findViewById(R.id.noun1)
        val place : EditText = findViewById(R.id.place)
        val adjetivo2 : EditText = findViewById(R.id.adjetivo2)
        val nexthis2 : Button = findViewById (R.id.newhis2)

        nexthis2.setOnClickListener()
        {
            val intent = Intent (this , History :: class.java)
            intent.putExtra("adjetivo",adjetivo.getText().toString())
            intent.putExtra("nomplu",nomplu.getText().toString())
            intent.putExtra("noun1",noun1.getText().toString() )
            intent.putExtra("place",place.getText().toString())
            intent.putExtra("adjetivo2",adjetivo2.getText().toString())

            startActivity(intent)
        }

    }
}