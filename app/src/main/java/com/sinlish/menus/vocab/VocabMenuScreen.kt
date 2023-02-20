package com.sinlish.menus.vocab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.sinlish.HomeScreen
import com.sinlish.R

class VocabMenuScreen : AppCompatActivity() {

    lateinit var vocabFruit: ImageView
    lateinit var vocabFood: ImageView
    lateinit var vocabAnimal: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocab_menu)

        vocabFruit = findViewById(R.id.vocab_fruit)

        vocabFruit.setOnClickListener {
            val intent = Intent(this, VocabScreen::class.java)
            intent.putExtra(VocabData.VOCAB_THEME, "fruit")
            startActivity(intent)
            finish()
        }

        vocabFood = findViewById(R.id.vocab_food)

        vocabFood.setOnClickListener {
            val intent = Intent(this, VocabScreen::class.java)
            intent.putExtra(VocabData.VOCAB_THEME, "food")
            startActivity(intent)
            finish()
        }

        vocabAnimal = findViewById(R.id.vocab_animal)

        vocabAnimal.setOnClickListener {
            val intent = Intent(this, VocabScreen::class.java)
            intent.putExtra(VocabData.VOCAB_THEME, "animal")
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, HomeScreen::class.java))
        finish()
    }
}