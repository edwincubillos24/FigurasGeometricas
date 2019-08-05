package com.cubidevs.figurasgeometricas

import android.content.Intent
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
            var intent = Intent(this,SelAreaPerActivity::class.java)
            when (view.getId()){
                R.id.bnTriangulo -> {
                    intent.putExtra("figura",0)
                }
                R.id.bnCuadrado -> {
                    intent.putExtra("figura",1)
                }
                R.id.bnRectangulo -> {
                    intent.putExtra("figura",2)
                }
                R.id.bnCirculo -> {
                    intent.putExtra("figura",3)
                }
                R.id.bnRombo -> {
                    intent.putExtra("figura",4)
                }
                R.id.bnPentagono -> {
                    intent.putExtra("figura",5)
                }
                R.id.bnHexagono -> {
                    intent.putExtra("figura",6)
                }
            }
            startActivity(intent)
        }
    }
}
