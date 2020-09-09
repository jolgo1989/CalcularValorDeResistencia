package com.example.myapplicationresistencia

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var acumulador = ""
    private var termino1 = ""
    private val termino2 = ""
    private val termino4 = ""

    var termino3 = 0.0
    var resultado : Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lista = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinnerBanda1.adapter = adaptador1

        val lista2 = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista2)
        spinnerBanda2.adapter = adaptador2

        val lista3 = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador3 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista3)
        spinnerBanda3.adapter = adaptador3

        val lista4 = arrayOf("1", "2", "3", "4", "5", "6")
        val adaptador4 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista4)
        spinnerMultiplicador.adapter = adaptador4

        when (spinnerBanda1.selectedItem.toString()) {
            "1" -> termino1 = "1"
               // val nf: NumberFormat = NumberFormat.getInstance()
               //val number: Double = nf.parse(myString).doubleValue()
        }

        acumulador = termino1 + termino2
        resultado = acumulador.toDouble()
        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4

        when (spinnerBanda2.selectedItem.toString()) {
            "2" -> termino1 = "2"
        }
        acumulador = termino1 + termino2
        resultado = acumulador.toDouble()
        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4

        when (spinnerBanda3.selectedItem.toString()) {
            "3" -> termino1 = "3"
        }
        acumulador = termino1 + termino2
        resultado = acumulador.toDouble()
        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4

            spinnerMultiplicador.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    if (termino1 != "" && termino2 != "") {
                        acumulador = termino1 + termino2
                        val resultado = acumulador.toDouble() * termino3
                        textView.text = resultado.toString() + "Ω" + termino4
                    }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

            }





//Metodo para mostrar el resultado al dar click en el spinnerMultiplicador

    }
}
