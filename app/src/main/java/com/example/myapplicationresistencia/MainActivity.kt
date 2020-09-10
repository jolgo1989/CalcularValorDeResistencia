package com.example.myapplicationresistencia

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private var acumulador = ""
    private var termino1 = ""
    private var termino2 = ""
    private var termino4 = ""

    var termino3 = 0.0
    var resultado: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lista = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinnerBanda1.adapter = adaptador1

        val lista2 = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista2)
        spinnerBanda2.adapter = adaptador2

        val lista3 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")
        val adaptador3 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista3)
        spinnerBanda3.adapter = adaptador3

        val lista4 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        val adaptador4 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista4)
        spinnerMultiplicador.adapter = adaptador4

        when (spinnerBanda1.selectedItem.toString()) {
            "1" ->
            {
                termino1 = "1"
                textViewColor2.setBackgroundResource(R.color.maroon)
            }

            
            "2" -> termino1 = "2"
            "3" -> termino1 = "3"
            "4" -> termino1 = "4"
            "5" -> termino1 = "5"
            "6" -> termino1 = "6"
        }

        acumulador = termino1 + termino2
        resultado = acumulador.toDouble()
        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4

        when (spinnerBanda2.selectedItem.toString()) {
            "0" -> {
                termino2 = "1"
                textViewColor2.setBackgroundResource(R.color.black)
            }

            "1" -> {
                termino2 = "1"
                textViewColor2.setBackgroundResource(R.color.maroon)
            }
            "2" -> {
                termino2 = "2"
                textViewColor2.setBackgroundResource(R.color.red)
            }
            "3" -> {
                termino2 = "3"
                textViewColor2.setBackgroundResource(R.color.orange)
            }
            "4" -> {
                termino2 = "4"
                textViewColor2.setBackgroundResource(R.color.yellow)
            }
            "5" -> {
                termino2 = "5"
                textViewColor2.setBackgroundResource(R.color.green)
            }
            "6" ->{
                termino2 = "6"
                textViewColor2.setBackgroundResource(R.color.blue)
            }

            "7" ->{
                termino2 = "7"
                textViewColor2.setBackgroundResource(R.color.purple)
            }

            "8" ->{
                termino2 = "8"
                textViewColor2.setBackgroundResource(R.color.gray)
            }

            "9" ->{
                termino2 = "9"
                textViewColor2.setBackgroundResource(R.color.white)
            }
        }
        acumulador = termino1 + termino2
        resultado = acumulador.toDouble()
        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4

        spinnerBanda3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (spinnerBanda3.selectedItem.toString()) {
                    "1" -> termino3 = 1.0
                    "2" -> termino3 = 10.0
                    "3" -> termino3 = 100.0
                    "4" -> termino3 = 1000.0
                    "5" -> termino3 = 10000.0
                    "6" -> termino3 = 100000.0
                    "7" -> termino3 = 1000000.0
                    "8" -> termino3 = 10000000.0
                    "9" -> termino3 = 100000000.0
                    "10" -> termino3 = 1000000000.0
                    "11" -> termino3 = 0.1
                    "12" -> termino3 = 0.01
                }
                if (termino1 != "" && termino2 != "") {
                    acumulador = termino1 + termino2
                    val resultado = acumulador.toDouble() * termino3
                    textView.text = resultado.toString() + "Ω" + termino4
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

        spinnerMultiplicador.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                when (spinnerMultiplicador.selectedItem.toString()) {
                    "1" -> termino4 = "±1%"
                    "2" -> termino4 = "±2%"
                    "3" -> termino4 = "±0.5%"
                    "4" -> termino4 = "±0.25%"
                    "5" -> termino4 = "±0.1%"
                    "6" -> termino4 = "±0.05%"
                    "7" -> termino4 = "±5%"
                    "8" -> termino4 = "±10%"
                }
                if (termino1 != "" && termino2 != "" && termino3 != 0.0) {
                    acumulador = termino1 + termino2;
                    val resultado = acumulador.toDouble() * termino3
                    textView.text = resultado.toString() + "Ω" + termino4

                }


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

}