package com.example.apponcologia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Welcome : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var nome: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        button = findViewById(R.id.button)

        nome = findViewById(R.id.editTextTextPersonName)

        button.setOnClickListener {
            redirectToMainActivity(nome.text.toString())
        }
    }



    fun redirectToMainActivity(nome: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("nome", nome)
        startActivity(intent)
    }

}