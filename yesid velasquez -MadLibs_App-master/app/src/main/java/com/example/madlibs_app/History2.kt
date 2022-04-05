package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class History2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history2)
        val textocompleto : TextView = findViewById(R.id.textView6)
        val backbutton : Button = findViewById(R.id.back)
        val celebridad1 : String? = intent.getStringExtra("celebridad1")
        val celebridad2 : String? =intent.getStringExtra("celebridad2")
        val verb : String? = intent.getStringExtra("verbo")
        val adjective : String? = intent.getStringExtra("adjetive")

        textocompleto.setText( "Donald Trump cambió de opinión y nombró a $celebridad1 su nuevo vicepresidente.\n" +
                "\n" +
                "$celebridad1 tiene un $adjective asistente  llamado $celebridad2 y el presidente Trump está enamorado de $celebridad2.\n" +
                "\n" +
                "Al presidente Trump le gustaría $verb con $celebridad2 en su despacho oval.")

        backbutton.setOnClickListener()
        {
            val intent = Intent (this , MainActivity:: class.java)
            startActivity(intent)
        }
    }


}