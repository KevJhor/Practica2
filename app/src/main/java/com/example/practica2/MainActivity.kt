package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: EditText = findViewById(R.id.txtUser)
        val pass: EditText = findViewById(R.id.txtPas)


        val btnLog: Button = findViewById(R.id.btnLog)

        btnLog.setOnClickListener {
            if(user.text.toString() == "55" && pass.text.toString() == "20"){
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Correo y/o clave inválida", Toast.LENGTH_SHORT).show()
            }
55
        }



    }
}