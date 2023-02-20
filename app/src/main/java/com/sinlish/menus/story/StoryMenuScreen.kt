package com.sinlish.menus.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.sinlish.HomeScreen
import com.sinlish.R

class StoryMenuScreen : AppCompatActivity() {

    lateinit var storyEnvelope: ImageView
    lateinit var storyHouse: ImageView
    lateinit var storyWetNight: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_menu)

        storyEnvelope = findViewById(R.id.story_envelope)
        storyHouse = findViewById(R.id.story_house)
        storyWetNight = findViewById(R.id.story_wetnight)

        storyEnvelope.setOnClickListener {
            startActivity(Intent(this, StoryEnvelopeScreen::class.java))
            finish()
        }

        storyHouse.setOnClickListener {
            startActivity(Intent(this, StoryANewHouse::class.java))
            finish()
        }

        storyWetNight.setOnClickListener {
            startActivity(Intent(this, StoryWetNight::class.java))
        }

    }

    override fun onBackPressed() {
        startActivity(Intent(this, HomeScreen::class.java))
        finish()
    }
}