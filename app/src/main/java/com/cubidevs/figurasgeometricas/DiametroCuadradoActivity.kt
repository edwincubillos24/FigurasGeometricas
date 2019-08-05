package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_diametro_cuadrado.*

class DiametroCuadradoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diametro_cuadrado)

        boton.setOnClickListener {
            var perimetro1 = et_lado_cuadrado.text.toString().toDouble()*4
            perimetro.text = perimetro1.toString()
        }
    }
}
