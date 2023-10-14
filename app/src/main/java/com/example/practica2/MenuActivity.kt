package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }

        val btnDivisa: Button = findViewById(R.id.btnDivisa)
        btnDivisa.setOnClickListener {
            val intent1 = Intent(this,DivisaActivity::class.java)
            startActivity(intent1)
        }
        val btnInEdad: Button = findViewById(R.id.btnEdad)
        btnInEdad.setOnClickListener {
            val intent1 = Intent(this,EdadActivity::class.java)
            startActivity(intent1)
        }
        val btnCont: Button = findViewById(R.id.btnContacto)
        btnCont.setOnClickListener {
            val intent1 = Intent(this,ContactoActivity::class.java)
            startActivity(intent1)
        }

    }
}