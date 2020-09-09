package com.example.myapplicationresistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lista = arrayOf("1","2","3","4","5","6")
        val adaptador1 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista)
        spinnerbanda1.adapter = adaptador1

        val lista2 = arrayOf("1","2","3","4","5","6")
        val adaptador2 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista2)
        spinnerbanda4.adapter = adaptador2

        val lista3 = arrayOf("1","2","3","4","5","6")
        val adaptador3 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista3)
        spinnerbanda4.adapter = adaptador3

        val lista4 = arrayOf("1","2","3","4","5","6")
        val adaptador4 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista4)
        spinnerbanda3.adapter = adaptador4

//Metodo para mostrar el resultado al dar click en el spinnerMultiplicador
        spinnerbanda3.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                textView.text = ("Hola a todos")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

}
