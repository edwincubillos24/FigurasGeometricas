package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_trianarea_.*

class trianarea_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trianarea_)
        btcalcular.setOnClickListener{
            var base = etbase.text.toString().toDouble()
            var altura = etaltura.text.toString().toDouble()
            var area = (base*altura)/2
            tvresultado.text = area.toString()
        }
    }
}
