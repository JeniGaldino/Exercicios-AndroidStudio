package com.generation.dadodigital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaod6 = findViewById<Button>(R.id.BotãoD6)
        val botaod12 = findViewById<Button>(R.id.botaodado12)
        val botaod20 = findViewById<Button>(R.id.botaodado20)

        botaod6.setOnClickListener {
            rolarDados(6)
        }
        botaod12.setOnClickListener {
            rolarDados(12)
        }
        botaod20.setOnClickListener {
            rolarDados(
                20
            )
        }
    }

    fun rolarDados(lados:Int){

    val valor = (1..lados).random()

    val dadoView = findViewById<TextView>(R.id.dadoView)

        dadoView.text= valor.toString()

    }



    }
