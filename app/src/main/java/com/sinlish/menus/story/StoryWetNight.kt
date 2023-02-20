package com.sinlish.menus.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinlish.R

class StoryWetNight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_wet_night)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, StoryMenuScreen::class.java))
        finish()
    }
}