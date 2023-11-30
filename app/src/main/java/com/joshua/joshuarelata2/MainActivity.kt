// MainActivity.kt
package com.joshua.joshuarelata2;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.joshua.joshuarelata2.HomeActivity
import com.joshua.joshuarelata2.R


//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar el clic del botón
        val btnLogin : Button = findViewById(R.id.loginButton)
        btnLogin.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
