package com.example.apponcologia

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quest_screen)

        val buttonOption1 = findViewById<Button>(R.id.buttonOption1)
        val buttonOption2 = findViewById<Button>(R.id.buttonOption2)
        val buttonOption3 = findViewById<Button>(R.id.buttonOption3)

        buttonOption1.setOnClickListener {
            if (isAnswerCorrect(1)) {
                buttonOption1.setBackgroundColor(Color.GREEN)
            } else {
                buttonOption1.setBackgroundColor(Color.RED)
            }
        }

        buttonOption2.setOnClickListener {
            if (isAnswerCorrect(2)) {
                buttonOption2.setBackgroundColor(Color.GREEN)
            } else {
                buttonOption2.setBackgroundColor(Color.RED)
            }
        }

        buttonOption3.setOnClickListener {
            if (isAnswerCorrect(3)) {
                buttonOption3.setBackgroundColor(Color.GREEN)
            } else {
                buttonOption3.setBackgroundColor(Color.RED)
            }
        }
    }

    private fun isAnswerCorrect(selectedOption: Int): Boolean {
        val answer = 2
        return selectedOption == answer
    }


}