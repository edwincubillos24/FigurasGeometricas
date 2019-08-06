package com.cubidevs.figurasgeometricas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SelAreaPerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sel_area_per)
    }

    fun onButtonClicked(view: View) {
        var figurarecibida = intent.extras
        var data = figurarecibida.getInt("figura")
        if (view is Button) {
            if (view.getId()==R.id.bnArea){
                when (data){
                    0 -> {
                        var intent = Intent(this,areatriangulo::class.java)
                        startActivity(intent)

                    }
                    1 -> {
                        var intent = Intent(this, Area_cuadradoActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        var intent =Intent(this, AreaRectanguloActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {

                    }
                    3 -> {
                        var intent =Intent(this, areacirculoActivity::class.java)
                        startActivity(intent)
                    }
                    4 -> {

                        var intent = Intent(this,arearomboActivity::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        var intent = Intent(this, AreaPentagonoActivity::class.java)
                        startActivity(intent)

                    }
                    6 -> {

                    }
                }
            }
            if (view.getId()==R.id.bnPerimetro) {
                when (data) {
                    0 -> {
                        var intent = Intent(this, TriaguloPerimetroActivity::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        var intent = Intent(this,DiametroCuadradoActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        var intent = Intent(this,Per_Rectangulo_Activity::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        var intent = Intent(this,setcircleperimeterActivity::class.java)
                        startActivity(intent)
                    }
                    4 -> {

                    }
                    5 -> {
                        var intent = Intent(this, PerPentaActivity::class.java)
                        startActivity(intent)
                    }
                    6 -> {

                    }
                }
            }
        }
    }
}


