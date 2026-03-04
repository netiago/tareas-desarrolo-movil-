package com.example.parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTipo = findViewById<EditText>(R.id.etTipo)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etDescripcion = findViewById<EditText>(R.id.etDescripcion)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnEnviar.setOnClickListener {
            val tipo = etTipo.text.toString()
            val direccion = etDireccion.text.toString()
            val descripcion = etDescripcion.text.toString()
            val mensaje = validarReporte(tipo, direccion, descripcion)
            tvResultado.text = mensaje }
    }
    private fun validarReporte(tipo: String, direccion: String, descripcion: String): String {
        if (tipo.isEmpty() || direccion.isEmpty() || descripcion.isEmpty()) {
            return "error:llena todo." }
        return "reporte registrado."
    }
}