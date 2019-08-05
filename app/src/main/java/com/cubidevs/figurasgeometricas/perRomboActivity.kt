package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_per_rombo.*



class perRomboActivity : AppCompatActivity() {

    private var a=""
    private var per = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_rombo)

        bnCalcular.setOnClickListener {
            a=lado.text.toString()
            if (a == "") {
                per = 0.0
            } else {
                per = (a).toDouble()
            }
            per = 4*per

            tvResultado.text = "El perímetro del rombo es \n" + per.toString()
        }
    }


}
