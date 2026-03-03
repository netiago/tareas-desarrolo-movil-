package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
la abuela quiere hacer una torta pero el horno esta en fahrenheit
conversion de grados Fahrenheit a Celsius
 */

class ConversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        val etFahrenheit = findViewById<EditText>(R.id.etFahrenheit)
        val btnConvertir = findViewById<Button>(R.id.btnConvertir)
        val tvResultadoC = findViewById<TextView>(R.id.tvResultadoC)

        btnConvertir.setOnClickListener {

            val textoF = etFahrenheit.text.toString()

            if (textoF.isNotEmpty()) {

                val F = textoF.toDouble()

                val C = (5.0 / 9.0) * (F - 32.0)

                tvResultadoC.text = " $C C"

            } else {

                tvResultadoC.text = "Ingrese un valor"
            }
        }
    }
}