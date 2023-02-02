package com.sinlish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.sinlish.menus.QuizScreen
import com.sinlish.menus.StoryScreen
import com.sinlish.menus.VocabScreen

class HomeScreen : AppCompatActivity() {

    private lateinit var quiz: ImageView
    private lateinit var story: ImageView
    private lateinit var vocab: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        quiz = findViewById(R.id.quiz)
        story = findViewById(R.id.story)
        vocab = findViewById(R.id.vocab)

        quiz.setOnClickListener { startActivity(Intent(this, QuizScreen::class.java)) }
        story.setOnClickListener { startActivity(Intent(this, StoryScreen::class.java)) }
        vocab.setOnClickListener { startActivity(Intent(this, VocabScreen::class.java)) }

    }
}