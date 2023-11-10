package com.example.apponcologia

import CardAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardAdapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = mutableListOf(
            "A Doença",
            "Tratamento",
            "Quimioterapia",
            "Radioterapia",
            "Cirurgia",
            "Transplante de Medula Óssea",
            "Efeitos Colaterais do Tratamento",
            "Cuidados com a Higiene",
            "Alimentação",
        )

        cardAdapter = CardAdapter(items)
        recyclerView.adapter = cardAdapter
    }
}
