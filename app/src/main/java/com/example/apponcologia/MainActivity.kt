package com.example.apponcologia

import CardAdapter
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager


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

//        button.setOnClickListener {
//            // Adicione a lógica que deseja executar quando o botão for clicado
//            // Por exemplo, exibir uma mensagem Toast
//            // Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
//        }

    }

}
