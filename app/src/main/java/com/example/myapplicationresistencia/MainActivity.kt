package com.example.myapplicationresistencia

import android.graphics.Color
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

        spinnerBanda1.adapter = ColorsArrayAdapter(
            this,
            listOf(
                Colors(resources.getColor(R.color.blue, null), "1"),
                Colors(resources.getColor(R.color.red, null), "2"),
                Colors(resources.getColor(R.color.maroon, null), "3"),
                Colors(resources.getColor(R.color.blue, null), "4"),
                Colors(resources.getColor(R.color.red, null), "5"),
                Colors(resources.getColor(R.color.maroon, null), "6"),
                Colors(resources.getColor(R.color.blue, null), "7"),
                Colors(resources.getColor(R.color.red, null), "8"),
                Colors(resources.getColor(R.color.maroon, null), "9"),
            )
        )

        val lista2 = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista2)
        spinnerBanda2.adapter = adaptador2

        val lista3 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")
        val adaptador3 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista3)
        spinnerBanda3.adapter = adaptador3

        val lista4 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        val adaptador4 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista4)
        spinnerMultiplicador.adapter = adaptador4


        spinnerBanda1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (spinnerBanda1.selectedItem.toString()) {
                    "1" -> {
                        termino1 = "1"
                        textViewColor1.setBackgroundResource(R.color.maroon)
                    }
                    "2" -> {
                        termino1 = "2"
                        textViewColor1.setBackgroundResource(R.color.red)
                    }
                    "3" -> {
                        termino1 = "3"
                        textViewColor1.setBackgroundResource(R.color.orange)
                    }
                    "4" -> {
                        termino1 = "4"
                        textViewColor1.setBackgroundResource(R.color.yellow)
                    }
                    "5" -> {
                        termino1 = "5"
                        textViewColor1.setBackgroundResource(R.color.green)
                    }
                    "6" -> {
                        termino1 = "6"
                        textViewColor1.setBackgroundResource(R.color.blue)
                    }

                    "7" -> {
                        termino1 = "7"
                        textViewColor1.setBackgroundResource(R.color.purple)
                    }

                    "8" -> {
                        termino1 = "8"
                        textViewColor1.setBackgroundResource(R.color.gray)
                    }

                    "9" -> {
                        termino1 = "9"
                        textViewColor1.setBackgroundResource(R.color.white)
                    }

                }

                acumulador = termino1 + termino2

                if (acumulador.isNotEmpty()) {
                    try {
                        resultado = acumulador.toDouble()
                        textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4
                    } catch (e: Exception) {

                    }

                }
                

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


        spinnerBanda2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
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
                    "6" -> {
                        termino2 = "6"
                        textViewColor2.setBackgroundResource(R.color.blue)
                    }

                    "7" -> {
                        termino2 = "7"
                        textViewColor2.setBackgroundResource(R.color.purple)
                    }

                    "8" -> {
                        termino2 = "8"
                        textViewColor2.setBackgroundResource(R.color.gray)
                    }

                    "9" -> {
                        termino2 = "9"
                        textViewColor2.setBackgroundResource(R.color.white)
                    }
                }

                acumulador = termino1 + termino2
                resultado = acumulador.toDouble()
                textView.text = java.lang.Double.toString(resultado) + "Ω" + termino4


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

        spinnerBanda3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (spinnerBanda3.selectedItem.toString()) {
                    "1" -> {
                        termino3 = 1.0
                        textViewColor3.setBackgroundResource(R.color.black)
                    }

                    "2" -> {
                        termino3 = 10.0
                        textViewColor3.setBackgroundResource(R.color.maroon)
                    }
                    "3" -> {
                        termino3 = 100.0
                        textViewColor3.setBackgroundResource(R.color.red)
                    }

                    "4" -> {
                        termino3 = 1000.0
                        textViewColor3.setBackgroundResource(R.color.orange)
                    }
                    "5" -> {
                        termino3 = 10000.0
                        textViewColor3.setBackgroundResource(R.color.yellow)

                    }
                    "6" -> {
                        termino3 = 100000.0
                        textViewColor3.setBackgroundResource(R.color.green)
                    }
                    "7" -> {
                        textViewColor3.setBackgroundResource(R.color.blue)
                        termino3 = 1000000.0
                    }
                    "8" -> {
                        textViewColor3.setBackgroundResource(R.color.purple)
                        termino3 = 10000000.0
                    }
                    "9" -> {
                        textViewColor3.setBackgroundResource(R.color.gray)
                        termino3 = 100000000.0
                    }
                    "10" -> {
                        textViewColor3.setBackgroundResource(R.color.white)
                        termino3 = 1000000000.0
                    }
                    "11" -> {
                        textViewColor3.setBackgroundResource(R.color.darkgoldenrod)
                        termino3 = 0.1
                    }

                    "12" -> {
                        termino3 = 0.01
                        textViewColor3.setBackgroundResource(R.color.silver)
                    }
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
                    "1" -> {
                        termino4 = "±1%"
                        textViewColor4.setBackgroundResource(R.color.maroon)
                        termino3 = 0.1
                    }

                    "2" -> {
                        termino4 = "±2%"
                        textViewColor4.setBackgroundResource(R.color.red)
                    }

                    "3" -> {
                        termino4 = "±0.5%"
                        textViewColor4.setBackgroundResource(R.color.green)
                    }
                    "4" -> {
                        termino4 = "±0.25%"
                        textViewColor4.setBackgroundResource(R.color.blue)
                    }
                    "5" -> {
                        termino4 = "±0.1%"
                        textViewColor4.setBackgroundResource(R.color.purple)
                    }
                    "6" -> {
                        termino4 = "±0.05%"
                        textViewColor4.setBackgroundResource(R.color.gray)
                    }
                    "7" -> {
                        termino4 = "±5%"
                        textViewColor4.setBackgroundResource(R.color.darkgoldenrod)

                    }
                    "8" -> {
                        textViewColor4.setBackgroundResource(R.color.silver)
                        termino4 = "±10%"
                    }
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