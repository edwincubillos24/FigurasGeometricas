package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_permetro__rombo.*

class Permetro_RomboActivity : AppCompatActivity() {

    private var lado = ""
    private var perimetro = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalcular.setOnClickListener {
            lado = etLado.text.toString()
            perimetro = 4 * lado.toDouble()

            tvResultado.text = "El perímetro del Rombo es \n" + perimetro.toString()
        }


    }
}
