package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PerRectanguloActivity : AppCompatActivity() {

    private var resultado: Double = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_rectangulo)


        var ladoa = "0.0"
        var ladob = "0.0"


        val etladoa= findViewById<EditText>(R.id.etladoa)
        val etladob= findViewById<EditText>(R.id.etladob)
        val tvresultado= findViewById<TextView>(R.id.tvresultado)
        val btcalcular = findViewById<Button>(R.id.btcalcular)

        btcalcular.setOnClickListener{
            ladoa = etladoa.text.toString()
            ladob = etladob.text.toString()


            resultado= ladoa.toDouble()+ladoa.toDouble()+ladob.toDouble()+ladob.toDouble()

            tvresultado.text=resultado.toString()
        }
    }


}
