package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_area_cuadrado.*

class Area_cuadradoActivity : AppCompatActivity() {

    private var valor_lado = 0.0
    private var valor_final = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_cuadrado)

        btnCalcular.setOnClickListener {
            var lado = etValorlado.text.toString()

            if(!lado.equals("")){
                valor_lado = lado.toDouble()
                valor_final = valor_lado * valor_lado
                tvResultado.text ="El area es: " + valor_final.toString() + " cm"
            }
            else{
                Toast.makeText(this, "Ingrese el valor del Lado", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
