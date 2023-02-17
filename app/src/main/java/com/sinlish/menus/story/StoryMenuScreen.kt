package com.sinlish.menus.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinlish.HomeScreen
import com.sinlish.R

class StoryMenuScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_menu)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, HomeScreen::class.java))
        finish()
    }
}