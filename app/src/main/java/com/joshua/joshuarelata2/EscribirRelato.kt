package com.joshua.joshuarelata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EscribirRelato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escribir_relato)

        // BOTON CONTINUAR
        val btnContinuarTrama : Button = findViewById(R.id.btnRelatoFin)
        btnContinuarTrama.setOnClickListener {
            val intent = Intent(this, FinRelato::class.java)
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