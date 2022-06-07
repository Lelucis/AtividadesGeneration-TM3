package com.generation.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)

        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}