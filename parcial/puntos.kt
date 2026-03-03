
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="16dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:text="Reporte de daños del barrio"
        android:textSize="22sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <EditText
        android:id="@+id/tipoDanio"
        android:hint="Tipo de daño"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <EditText
        android:id="@+id/descripcion"
        android:hint="Descripción"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <EditText
        android:id="@+id/direccion"
        android:hint="Dirección"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <Button
        android:id="@+id/btnRegistrar"
        android:text="Registrar reporte"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <TextView
        android:id="@+id/txtResultado"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

</LinearLayout>




  package com.example.comunibarrio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tipo = findViewById<EditText>(R.id.tipoDanio)
        val descripcion = findViewById<EditText>(R.id.descripcion)
        val direccion = findViewById<EditText>(R.id.direccion)
        val boton = findViewById<Button>(R.id.btnRegistrar)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        boton.setOnClickListener {

            val t = tipo.text.toString()
            val d = descripcion.text.toString()
            val dir = direccion.text.toString()

            resultado.text =
                "Reporte registrado:\nTipo: $t\nDescripción: $d\nDirección: $dir"
        }
    }
}

Los vecinos podrán registrar problemas del barrio como:

Huecos en la vía

Alumbrado dañado

Basuras acumuladas

Otros problemas


Usuario 1 Vecino
Usuario 2 Administrador Junta

Usuario Vecino

Edad entre 20 y 70 anos
Nivel basico o intermedio de tecnologia

Problema:
No puede reportar facilmente un dano ni saber si ya fue reportado.

Necesidad:
Formulario simple para reportar danos.

Usuario Administrador

Ejemplo Dona Rosario

Problema:
No puede organizar ni hacer seguimiento a los danos reportados.

Necesidad:
Visualizar lista de reportes con informacion clara.

3 Requisitos Funcionales

RF1 Crear reporte
Prioridad Alta
El usuario debe poder registrar un dano con descripcion direccion y tipo

Entrada
Descripcion del dano
Direccion
Tipo de problema

Salida
Reporte almacenado en el sistema

RF2 Visualizar lista de reportes
Prioridad Alta
El administrador debe poder ver todos los reportes registrados

Entrada
Acceso al modulo reportes

Salida
Lista de reportes ordenada

RF3 Validacion de datos
Prioridad Media
El sistema debe validar que los campos no esten vacios

Entrada
Formulario incompleto

Salida
Mensaje de error

RF4 Marcar como resuelto
Prioridad Media
El administrador debe poder cambiar el estado del reporte

Entrada
Identificador del reporte

Salida
Estado actualizado

RF5 Fecha automatica
Prioridad Alta
El sistema debe registrar automaticamente la fecha del reporte

Entrada
Envio del formulario

Salida
Reporte con fecha asignada
