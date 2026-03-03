package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
dosis correcta paciente */

class DosisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosis)

        val etPeso = findViewById<EditText>(R.id.etPeso)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularDosis)
        val tvResultado = findViewById<TextView>(R.id.tvResultadoDosis)

        btnCalcular.setOnClickListener {

            val textoPeso = etPeso.text.toString()
            val edad = etEdad.text.toString()



            if (textoPeso.isNotEmpty()) {

                val p = textoPeso.toDouble()
                val e = edad.toInt()


                if (p > 0) {

                    val D = (p + e) / 2

                    tvResultado.text = " $D mg"

                } else {
                    tvResultado.text = "El peso debe ser positivo"
                }

            } else {
                tvResultado.text = "Ingrese el peso"
            }
        }
    }
}