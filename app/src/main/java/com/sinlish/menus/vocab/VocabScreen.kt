package com.sinlish.menus.vocab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.sinlish.R
import java.util.*
import kotlin.collections.ArrayList

class VocabScreen : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mVocabList: ArrayList<VocabModel>? = null
    private var theme: String = ""

    lateinit var vocabIndex: TextView
    lateinit var vocabText: TextView
    lateinit var vocabImage: ImageView
    lateinit var progressBar: ProgressBar
    lateinit var btnContinue: Button
    lateinit var btnSpeak: ImageView
    lateinit var tts: TextToSpeech


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocab)

        vocabIndex = findViewById(R.id.vocabIndex)
        vocabText = findViewById(R.id.vocabText)
        vocabImage = findViewById(R.id.vocabImage)
        progressBar = findViewById(R.id.vocabProgressBar)
        btnContinue = findViewById(R.id.vocabContinue)
        btnSpeak = findViewById(R.id.buttonSpeak)
        theme = intent.getStringExtra(VocabData.VOCAB_THEME).toString()

        mVocabList = VocabData.getVocab(theme)

        tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR) {
                tts.language = Locale.US
            }
        })

        setVocab()

        btnContinue.setOnClickListener {
            mCurrentPosition++
            when {
                mCurrentPosition <= mVocabList!!.size -> {
                    Log.d("size", mVocabList!!.size.toString())
                    setVocab()
                }
                else -> {
                    startActivity(Intent(this, VocabMenuScreen::class.java))
                    finish()
                }
            }

            if(mCurrentPosition == mVocabList!!.size) {
                btnContinue.text = "FINISH"
            } else {
                btnContinue.text = "CONTINUE"
            }
        }

        btnSpeak.setOnClickListener {
            speak()
        }

    }

    private fun setVocab() {
        val vocab = mVocabList!![mCurrentPosition-1]

        progressBar.progress = mCurrentPosition
        progressBar.max = mVocabList!!.size
        vocabIndex.text = "$mCurrentPosition/${progressBar.max}"

        vocabText.text = vocab!!.name
        vocabImage.setImageResource(vocab.image)

        speak()
    }

    private fun speak() {
        val toSpeak = mVocabList!![mCurrentPosition-1]!!.name
        tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, VocabMenuScreen::class.java))
        finish()
    }
}