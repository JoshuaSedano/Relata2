package com.joshua.joshuarelata2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // BOTON NUEVO RELATO
        val btnRelatoNuevo : TextView = findViewById(R.id.tvIniciarRelato)
        btnRelatoNuevo.setOnClickListener {

            val intent = Intent(this, CrearRelato::class.java)
            startActivity(intent)
        }


        // BOTON LEER RELATO
        val btnLEer : TextView = findViewById(R.id.btnLeerRelatos)
        btnLEer.setOnClickListener {

            val intent = Intent(this, LeerRelatos::class.java)
            startActivity(intent)
        }

        // BOTON BACK
        val btnBack : ImageView = findViewById(R.id.btnBAck)
        btnBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // BOTON Seguir relato
        val btnEscribir : Button = findViewById(R.id.btnRelato1)
        btnEscribir.setOnClickListener {

            val intent = Intent(this, EscribirRelato::class.java)
            startActivity(intent)
        }

        // BOTON Seguir relato
        val btnEscribir2 : Button = findViewById(R.id.btnRelato2)
        btnEscribir2.setOnClickListener {

            val intent = Intent(this, EscribirRelato::class.java)
            startActivity(intent)
        }



    }
}