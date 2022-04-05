package com.example.madlibs_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Get_Words : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_words)
        val celebridad1 : EditText = findViewById (R.id.celebrity1)
        val celebridad2 :EditText = findViewById(R.id.celebrity2)
        val  verb : EditText = findViewById (R.id.verb)
        val adjective : EditText = findViewById(R.id.adjective)
        val button2 : Button = findViewById(R.id.newhis)
        button2.setOnClickListener()
        {

            val intent = Intent (this , History2 :: class.java)
            intent.putExtra("celebridad1",celebridad1.getText().toString())
            intent.putExtra("celebridad2",celebridad2.getText().toString())
            intent.putExtra("verbo",verb.getText().toString() )
            intent.putExtra("adjetive",adjective.getText().toString())
            startActivity(intent)

        }

    }
}