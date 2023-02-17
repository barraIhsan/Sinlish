package com.sinlish.menus.vocab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinlish.R

class VocabScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocab)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, VocabMenuScreen::class.java))
        finish()
    }
}