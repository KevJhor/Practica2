package com.example.practica2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class EdadActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)

        val formaterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fechaN: TextView = findViewById(R.id.txtFechaN)
        val resulEdad: TextView = findViewById(R.id.txtResulEdad)
        val btnCalEdad: Button = findViewById(R.id.btnCalEdad)
        btnCalEdad.setOnClickListener {
            val fechaActual = LocalDate.now()
            val fechaNacimiento = LocalDate.parse(fechaN.text.toString(),formaterFecha)
            resulEdad.text = (Period.between(fechaNacimiento,fechaActual)).years.toString()
        }


    }
}