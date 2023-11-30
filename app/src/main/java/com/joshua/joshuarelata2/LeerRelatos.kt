package com.joshua.joshuarelata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LeerRelatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leer_relatos)


        // BOTON BACK
        val btnBack : ImageView = findViewById(R.id.btnBAck)
        btnBack.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


        // BOTONES LECTURA
        val btnLeer :  Button = findViewById(R.id.btnRelato1Leer)
        btnLeer.setOnClickListener {

            val intent = Intent(this, Lectura::class.java)
            startActivity(intent)
        }


        val ntnLeer2 : Button = findViewById(R.id.btnLeerRelato2)
        ntnLeer2.setOnClickListener {

            val intent = Intent(this, Lectura::class.java)
            startActivity(intent)
        }

    }
}