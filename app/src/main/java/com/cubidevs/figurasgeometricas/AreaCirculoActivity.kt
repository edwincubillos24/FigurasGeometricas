package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area_circulo.*

class AreaCirculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circulo)
        bnCalcular.setOnClickListener {

            var radio_nuevo = etRadio.text.toString().toDouble()
            var pi = 3.1416
            var resultado = pi*radio_nuevo*radio_nuevo

            tvResultado.text = "El area del circulo es: "+resultado.toString() + " cm^2"
        }





    }
}
