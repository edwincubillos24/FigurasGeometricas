package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_areatriangulo.*

class areatriangulo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areatriangulo)
        btcalcular.setOnClickListener{
            var base = etbase.text.toString().toDouble()
            var altura = etaltura.text.toString().toDouble()
            var area = (base*altura)/2
            tvresultado.text = area.toString()
        }
    }
}
