package com.sinlish.menus.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sinlish.R

class QuizResultScreen : AppCompatActivity() {

    lateinit var scoreText: TextView
    lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)

        scoreText = findViewById(R.id.scoreText)
        finishButton = findViewById(R.id.finishButton)

        val totalQuestion = intent.getIntExtra(QuizData.QUIZ_TOTAL, 0)
        val correctAnswer = intent.getIntExtra(QuizData.QUIZ_CORRECT, 0)

        scoreText.text = "Your Score is $correctAnswer out of $totalQuestion"
        finishButton.setOnClickListener{
            startActivity(Intent(this, QuizMenuScreen::class.java))
        }

    }

    override fun onBackPressed() {
        startActivity(Intent(this, QuizMenuScreen::class.java))
        finish()
    }
}