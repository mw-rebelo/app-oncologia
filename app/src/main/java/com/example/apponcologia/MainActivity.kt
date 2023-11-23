package com.example.apponcologia

import CardAdapter
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardAdapter: CardAdapter
    val viewPager: ViewPager = findViewById(R.id.viewPager)
    private lateinit var cardPageAdapter : PagerAdapter

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
        viewPager.adapter = cardPageAdapter

//        button.setOnClickListener {
//            // Adicione a lógica que deseja executar quando o botão for clicado
//            // Por exemplo, exibir uma mensagem Toast
//            // Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
//        }

    }
}
