package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText as EditText1

class PerRectanguloActivity : AppCompatActivity() {

    private var resultado: Double = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_rectangulo)


        var ladoa = "0.0"
        var ladob = "0.0"


        val etladoa= findViewById(R.id.etladoa) as android.widget.EditText
        val etladob= findViewById(R.id.etladob)as android.widget.EditText
        val tvresultado= findViewById<TextView>(R.id.tvresultado)
        val btcalcular = findViewById<Button>(R.id.btcalcular)


        btcalcular.setOnClickListener {
            ladoa = etladoa.text.toString()
            ladob = etladob.text.toString()

            if ((ladoa == "") || (ladob == "")){
                tvresultado.text="No se ingresaron datos "
            }
            else{
            resultado = ladoa.toDouble() + ladoa.toDouble() + ladob.toDouble() + ladob.toDouble()

            tvresultado.text = resultado.toString()
            }
        }
    }


}
