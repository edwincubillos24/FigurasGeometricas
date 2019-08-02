package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area_rectangulo.*

class AreaRectanguloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_rectangulo)

        btn_rectangulo.setOnClickListener {
            var ancho = et_width.text.toString().toDouble()
            var largo = et_large.text.toString().toDouble()

             btn_rectangulo.text = (ancho * largo).toString()
        }
    }
}
