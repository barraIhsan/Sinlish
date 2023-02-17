package com.sinlish.menus.vocab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinlish.HomeScreen
import com.sinlish.R

class VocabMenuScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocab_menu)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, HomeScreen::class.java))
        finish()
    }
}