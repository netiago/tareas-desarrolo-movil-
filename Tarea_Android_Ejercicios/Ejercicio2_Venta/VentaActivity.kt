package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
calcular el cantidad de productos de una compra y el cambio a devolver.

 */
class VentaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)/*conecta el layout con el codigo */
        setContentView(R.layout.activity_main2)

        val etCantidad = findViewById<EditText>(R.id.etCantidad)
        val etDinero = findViewById<EditText>(R.id.etDinero)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnCalcular.setOnClickListener {

            val textoCantidad = etCantidad.text.toString()
            val textoDinero = etDinero.text.toString()

            if (textoCantidad.isNotEmpty() && textoDinero.isNotEmpty()) {

                val precio = 15000.0
                val cantidad = textoCantidad.toDouble()
                val dinero = textoDinero.toDouble()

                val total = precio * cantidad
                val cambio = dinero - total

                tvResultado.text =
                    "Total: $total\nCambio: $cambio"

            } else {
                tvResultado.text = "Ingrese todos los datos"
            }
        }
    }
}