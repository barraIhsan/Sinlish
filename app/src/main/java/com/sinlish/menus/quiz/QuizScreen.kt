package com.sinlish.menus.quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.sinlish.R

class QuizScreen : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int=1
    private var mQuestionsList: ArrayList<QuizModel>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var theme: String = "theme"
    private var buttonDisabled: Boolean = false

    lateinit var questionIndex: TextView
    lateinit var questionText: TextView
    lateinit var questionImage: ImageView
    lateinit var option1: TextView
    lateinit var option2: TextView
    lateinit var option3: TextView
    lateinit var option4: TextView
    lateinit var progressBar: ProgressBar
    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mCorrectAnswers = 0

        questionText = findViewById(R.id.question)
        progressBar = findViewById(R.id.questionProgressBar)
        questionIndex = findViewById(R.id.questionIndex)
        questionImage = findViewById(R.id.questionImage)
        option1 = findViewById(R.id.option1Text)
        option2 = findViewById(R.id.option2Text)
        option3 = findViewById(R.id.option3Text)
        option4 = findViewById(R.id.option4Text)
        btnSubmit = findViewById(R.id.questionSubmit)
        theme = intent.getStringExtra(QuizData.QUIZ_THEME).toString()


        mQuestionsList = QuizData.getQuestions(theme)

        setQuestion()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        btnSubmit.setOnClickListener(this)
    }

    private fun setQuestion() {

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btnSubmit.text = "FINISH"
        } else {
            btnSubmit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        progressBar.max = mQuestionsList!!.size
        questionIndex.text = "Question $mCurrentPosition of ${progressBar.max}"

        questionText.text = question!!.question
        questionImage.setImageResource(question.image)
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4

        buttonDisabled = false
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, option1)
        options.add(1, option2)
        options.add(2, option3)
        options.add(3, option4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.button_round
            )
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.option1Text -> {
                if(!buttonDisabled) {
                    selectedOptionView(option1, 1)
                }
            }
            R.id.option2Text -> {
                if(!buttonDisabled) {
                    selectedOptionView(option2, 2)
                }
            }
            R.id.option3Text -> {
                if(!buttonDisabled) {
                    selectedOptionView(option3, 3)
                }
            }
            R.id.option4Text -> {
                if(!buttonDisabled) {
                    selectedOptionView(option4, 4)
                }
            }
            R.id.questionSubmit -> {
                if (mSelectedOptionPosition == 0) {

                    if (btnSubmit.text != "SUBMIT") {
                        mCurrentPosition++

                        when {
                            mCurrentPosition <= mQuestionsList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                val intent = Intent(this, QuizResultScreen::class.java)
                                intent.putExtra(QuizData.QUIZ_CORRECT, mCorrectAnswers)
                                intent.putExtra(QuizData.QUIZ_TOTAL, mQuestionsList!!.size)
                                startActivity(intent)
                                finish()
                            }
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.answer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_button_quiz)
                    } else {
                        mCorrectAnswers++
                    }
                    answerView(question.answer, R.drawable.quiz_correct)
                    buttonDisabled = true

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btnSubmit.text = "FINISH"
                    } else {
                        btnSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when(answer) {
            1 -> {
                option1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                option2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                option3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                option4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#2174C1"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)

        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_button_quiz
        )
    }

    override fun onBackPressed() {
        startActivity(Intent(this, QuizMenuScreen::class.java))
        finish()
    }

}