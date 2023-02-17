package com.sinlish.menus.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.sinlish.HomeScreen
import com.sinlish.R

class QuizMenuScreen : AppCompatActivity() {

    lateinit var quizFruit: ImageView
    lateinit var quizFood: ImageView
    lateinit var quizAnimal: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_menu)

        quizFruit = findViewById(R.id.quiz_fruit)

        quizFruit.setOnClickListener{
            val intent = Intent(this, QuizScreen::class.java)
            intent.putExtra(QuizData.QUIZ_THEME, "fruit")
            startActivity(intent)
            finish()
        }

        quizFood = findViewById(R.id.quiz_food)

        quizFood.setOnClickListener{
            val intent = Intent(this, QuizScreen::class.java)
            intent.putExtra(QuizData.QUIZ_THEME, "food")
            startActivity(intent)
            finish()
        }

        quizAnimal = findViewById(R.id.quiz_animal)

        quizAnimal.setOnClickListener{
            val intent = Intent(this, QuizScreen::class.java)
            intent.putExtra(QuizData.QUIZ_THEME, "animal")
            startActivity(intent)
            finish()
        }

    }

    override fun onBackPressed() {
        startActivity(Intent(this, HomeScreen::class.java))
        finish()
    }
}