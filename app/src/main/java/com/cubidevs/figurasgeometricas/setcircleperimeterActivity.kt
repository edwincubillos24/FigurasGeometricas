package com.cubidevs.figurasgeometricas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_setcircleperimeter.*

class setcircleperimeterActivity : AppCompatActivity() {
    var inradio = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setcircleperimeter)

        bperimeter.setOnClickListener {
            if (inputradio != null && inputradio.length() > 0) {
                inradio = inputradio.text.toString().toDouble()

                var perimeter = 2 * 3.1416 * inradio
                resulperimeter.text = perimeter.toString()
            }else{
            Toast.makeText(this,"Input a valid number", Toast.LENGTH_LONG).show()
            }

        }
    }


}
