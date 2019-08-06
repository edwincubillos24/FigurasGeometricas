package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_per__rectangulo_.*

class Per_Rectangulo_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per__rectangulo_)


        var ladoa = ""
        var ladob = ""
        var resultado = 0.0



        btcalcular.setOnClickListener {
            ladoa = etladoa.text.toString()
            ladob = etladob.text.toString()

            if ((ladoa == "") || (ladob == "")) {
                tvresultado.text = "No se ingresaron datos "
            } else {
                resultado = ladoa.toDouble() + ladoa.toDouble() + ladob.toDouble() + ladob.toDouble()

                tvresultado.text = resultado.toString()

            }
        }
    }

}
