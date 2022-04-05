package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val textocompleto : TextView = findViewById(R.id.his2)
        val backbutton : Button = findViewById(R.id.back2)
        val adjetivo : String? = intent.getStringExtra("adjetivo")
        val nomplu : String? =intent.getStringExtra("nomplu")
        val noun1 : String? =intent.getStringExtra("noun1")
        val place : String? = intent.getStringExtra("place")
        val adjetivo2 : String? = intent.getStringExtra("adjetivo2")

        textocompleto.setText(
            "Uno de los personajes más $adjetivo de la ficción se llama\n" +
                    "Tarzán del $nomplu. Tarzán fue criado por un/una \n" +
                    "$noun1 y vive en la jungla $adjetivo2 en el\n" +
                    "corazón del $place más oscuro."
        )

        backbutton.setOnClickListener()
        {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }




}