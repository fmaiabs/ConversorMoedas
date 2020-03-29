package com.pedroza.convesormoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val valorOriginal: EditText = findViewById(R.id.valorOriginal)
        //val conversaoDolar: EditText = findViewById(R.id.conversaoDolar)
        //val conversaoEuro: EditText = findViewById(R.id.conversaoEuro)

       // var valorOriginal = findViewById<View>(R.id.valorOriginal)
        //var conversaoDolar = findViewById<View>(R.id.conversaoDolar) as EditText
       // var conversaoEuro = findViewById<View>(R.id.conversaoEuro) as EditText



        val button = findViewById<View>(R.id.calcular) as Button
        button.setOnClickListener {
            if (valorOriginal.length() == 0)
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            else {


                var valorOriginal: EditText = findViewById(R.id.valorOriginal)


                var resultadoDolar = valorOriginal.text.toString().toDouble()/5
                conversaoDolar.setText(resultadoDolar.toString())


                var resultadoEuro = valorOriginal.text.toString().toDouble()/6
                conversaoEuro.setText(resultadoEuro.toString())

              //  conversaoDolar = valorOriginal.text.toString().toDouble()/5
              //  var conversaoEuro = valorOriginal.text.toString().toDouble()/6

            }
        }
    }
}

