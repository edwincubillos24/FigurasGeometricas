package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_per_penta.*

class PerPentaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_penta)

        var num = "0.0"

        val etlong = findViewById<EditText>(R.id.etLongitud)



        btnCalcular.setOnClickListener{
            num = etlong.text.toString()
            if (num == ""){
                tvResult.text ="No se ingresaron datos"
            }else{
                tvResult.text = ((num).toFloat()*5).toString()
            }
        }

    }
}
