package com.example.apponcologia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class CardContent : AppCompatActivity() {

    private lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_content)

        viewPager = findViewById(R.id.viewPager)


        viewPager.adapter = OnboardingAdapter()


//        val button = findViewById<Button>(R.id.buttonTest)
//
//        button.setOnClickListener {
//            redirectToQuestActivity()
//        }

    }

    fun redirectToQuestActivity() {
        val intent = Intent(this, QuestActivity::class.java)
        startActivity(intent)
    }


    private inner class OnboardingAdapter: PagerAdapter() {

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val view = layoutInflater.inflate(R.layout.card_content, container, false)

            val itemText = intent.getStringExtra("item_text")
            val textView = findViewById<TextView>(R.id.textViewItemDetail)
            textView.text = itemText

            container.addView(view)


            return view
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean{
            return view == `object`
        }


        override fun getCount(): Int = 2
    }

}
