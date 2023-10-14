package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DivisaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divisa)

        val btnBack: Button = findViewById(R.id.btnR)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MenuActivity::class.java)
            startActivity(intent1)
        }
        val MontoDolar: EditText = findViewById(R.id.txtMonto)
        val MontoSoles: TextView = findViewById(R.id.txtSoles)

        val btnCambiar: Button = findViewById(R.id.btnCambiar)
        btnCambiar.setOnClickListener {
            MontoSoles.text = (MontoDolar.text.toString().toDouble() * 3.75).toString()
        }

    }
}