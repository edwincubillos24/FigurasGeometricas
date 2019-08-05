package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_area_pentagono.*
import kotlin.math.sin

class AreaPentagonoActivity : AppCompatActivity(), View.OnClickListener {

    private var boton: Button? = null
    private var tvresultado: TextView? = null
    private var etlado: EditText? = null
    private var etapotema: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_pentagono)

        boton = findViewById<Button>(R.id.btCalcular)
        boton!!.setOnClickListener(this)

        tvresultado = findViewById<TextView>(R.id.tvResultado)
        tvresultado!!.setOnClickListener(this)

        etlado = findViewById<EditText>(R.id.etLado)
        etlado!!.setOnClickListener(this)

        etapotema = findViewById<EditText>(R.id.etApotema)
        etapotema!!.setOnClickListener(this)
    }

    override fun onClick (v: View){

        var aux=etLado?.text.toString()
        var aux2=etApotema?.text.toString()
        tvResultado?.text = (((aux.toFloat() * aux2.toFloat() * 5 )/ 2).toString())
    }
}
