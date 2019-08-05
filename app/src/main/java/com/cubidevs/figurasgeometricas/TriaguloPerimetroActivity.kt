package com.cubidevs.figurasgeometricas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_triagulo_perimetro.*

class TriaguloPerimetroActivity : AppCompatActivity() {

    private var ladotp1 = 1.0
    private var ladotp2 = 1.0
    private var ladotp3 = 1.0

    private var sladotp1 = ""
    private var sladotp2 = ""
    private var sladotp3 = ""

    private var totaltp = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triagulo_perimetro)

        button_tria_per.setOnClickListener {

            sladotp1 = et_lado1tp.text.toString()
            sladotp2 = et_lado2tp.text.toString()
            sladotp3 = et_lado3tp.text.toString()

            if (sladotp1 == "") {
                ladotp1 = 1.0
            } else {
                ladotp1 = sladotp1.toDouble()
            }

            if (sladotp2 == "") {
                ladotp2 = 1.0
            } else {
                ladotp2 = sladotp2.toDouble()
            }

            if (sladotp3 == "") {
                ladotp3 = 1.0
            } else {
                ladotp3 = sladotp3.toDouble()
            }

            totaltp = ladotp1 + ladotp2 + ladotp3

            tv_resul_tri_per.text = totaltp.toString()


        }

    }
}
