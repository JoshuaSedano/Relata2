package com.joshua.joshuarelata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FinRelato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fin_relato)


        // BOTON TRAMA Y PJ
        val goTrama : ImageView = findViewById(R.id.imgTrama)
        goTrama.setOnClickListener {
            val intent = Intent(this, CrearRelatoTrama::class.java)
            startActivity(intent)
        }


        val goPJ : ImageView = findViewById(R.id.imgPJ)
        goPJ.setOnClickListener {
            val intent = Intent(this, CrearRelatoPjs::class.java)
            startActivity(intent)
        }


        // BOTON CONTINUAR
        val btnGuardarFin : Button = findViewById(R.id.btnRelatoFin)
        btnGuardarFin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // BOTON CONTINUAR
        val btnContinuarTrama : Button = findViewById(R.id.btnRelatoFin)
        btnContinuarTrama.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
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