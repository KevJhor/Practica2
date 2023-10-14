package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView

class ContactoActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Contanto1", "Contanto51", "Contanto19 ", "Contanto12", "Contanto1 OS", "Contanto1 World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val lsvSistemasOperativos: ListView = findViewById(R.id.listC)
        val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)

        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        val btnBack: Button = findViewById(R.id.btnRer)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MenuActivity::class.java)
            startActivity(intent1)
        }
    }
}