package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClicked(view: View){
        if (view is Button){
            when (view.getId()){
                R.id.bnTriangulo -> {

                }
                R.id.bnCuadrado -> {

                }
                R.id.bnRectangulo -> {

                }
                R.id.bnCirculo -> {

                }
                R.id.bnRombo -> {

                }
                R.id.bnPentagono -> {

                }
                R.id.bnHexagono -> {

                }
            }
        }
    }
}
