package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arearombo.*

class arearomboActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arearombo)

        btcalcular.setOnClickListener {
            var distancia1=etd1.text.toString().toDouble()
            var distancia2=etd2.text.toString().toDouble()
            var resultado= (distancia1*distancia2)/2
            tvresultado.text=resultado.toString()

        }
    }
}
