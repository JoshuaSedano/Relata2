package com.joshua.joshuarelata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CrearRelato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_relato)

        // BOTON CONTINUAR
        val btnContinuar : Button = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, CrearRelatoPjs::class.java)
            startActivity(intent)
        }

        // BOTON BACK
        val btnBack : ImageView = findViewById(R.id.btnBAck)
        btnBack.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}