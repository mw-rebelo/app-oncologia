package com.example.apponcologia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CardContent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_content)

        val itemText = intent.getStringExtra("item_text")
        val textView = findViewById<TextView>(R.id.textViewItemDetail)
        textView.text = itemText

        val button = findViewById<Button>(R.id.buttonTest)

        button.setOnClickListener {
            redirectToQuestActivity()
        }

    }

    fun redirectToQuestActivity() {
        val intent = Intent(this, QuestActivity::class.java)
        startActivity(intent)
    }
}
