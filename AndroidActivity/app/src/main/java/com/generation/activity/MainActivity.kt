package com.generation.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoNext = findViewById<Button>(R.id.botaoNext)

        val segundaTela = Intent(this, SegundaActivity ::class.java)

        botaoNext.setOnClickListener {
            startActivity(segundaTela)
        }

    }
}