package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
/* suma de dos numeros*/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumero1 = findViewById<EditText>(R.id.etNumero1)
        val etNumero2 = findViewById<EditText>(R.id.etNumero2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnSumar.setOnClickListener /*variables del boton */{
            val a = etNumero1.text.toString().toDouble()
            val b = etNumero2.text.toString().toDouble()
            val suma = a + b
            tvResultado.text = "Resultado: $suma"
        }
    }

}



