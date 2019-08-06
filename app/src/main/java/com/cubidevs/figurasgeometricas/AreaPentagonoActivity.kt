package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area_pentagono.*

class AreaPentagonoActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_pentagono)

        btCalcular.setOnClickListener{
            tvResultado.text = ((etLado.text.toString().toFloat() * etApotema.text.toString().toFloat() * 5) / 2).toString()
        }
    }
}
