package com.sinlish.menus.quiz

import com.sinlish.R

object QuizData {

    const val QUIZ_THEME: String = ""
    const val QUIZ_CORRECT: String = ""
    const val QUIZ_TOTAL: String = ""

    fun getQuestions(theme: String): ArrayList<QuizModel> {
        val questionList = ArrayList<QuizModel>()

        if (theme == "animal") {
            val que1 = QuizModel(
                1,
                "What is the name of the animal?",
                R.drawable.duck_quiz,
                "Rabbit",
                "Duck",
                "Cow",
                "Beaver",
                2
            )
            questionList.add(que1)

            val que2 = QuizModel(
                2,
                "What is the name of the animal?",
                R.drawable.penguin_quiz,
                "Duck",
                "Cow",
                "Beaver",
                "Penguin",
                4
            )
            questionList.add(que2)

            val que3 = QuizModel(
                3,
                "What is the name of the animal?",
                R.drawable.rabbit_quiz,
                "Duck",
                "Cow",
                "Rabbit",
                "Beaver",
                3
            )
            questionList.add(que3)

            val que4 = QuizModel(
                4,
                "What is the name of the animal?",
                R.drawable.shark_quiz,
                "Duck",
                "Rabbit",
                "Beaver",
                "Shark",
                4
            )
            questionList.add(que4)

            val que5 = QuizModel(
                5,
                "What is the name of the animal?",
                R.drawable.beaver_quiz,
                "Beaver",
                "Duck",
                "Rabbit",
                "Shark",
                1
            )
            questionList.add(que5)
         } else if (theme == "food") {
            val que1 = QuizModel(
                1,
                "What is the name of this food?",
                R.drawable.sandwich_quiz,
                "Donuts",
                "Bread",
                "Sandwich",
                "Burger",
                3
            )
            questionList.add(que1)

            val que2 = QuizModel(
                2,
                "What is the name of this food?",
                R.drawable.donut_quiz,
                "Hotdog",
                "Sandwich",
                "Pizza",
                "Donuts",
                4
            )
            questionList.add(que2)

            val que3 = QuizModel(
                3,
                "What is the name of this food?",
                R.drawable.pizza_quiz,
                "Pizza",
                "Burger",
                "Canal Bread",
                "Sandwich",
                1
            )
            questionList.add(que3)

            val que4 = QuizModel(
                4,
                "What is the name of this food?",
                R.drawable.chicken_quiz,
                "Hotdog",
                "Fried Chicken",
                "Pizza",
                "Sandwich",
                2
            )
            questionList.add(que4)

            val que5 = QuizModel(
                5,
                "What is the name of this food?",
                R.drawable.hotdog_quiz,
                "Sandwich",
                "Donuts",
                "Hotdog",
                "Pizza",
                3
            )
            questionList.add(que5)
        } else if (theme == "fruit") {
            val que1 = QuizModel(
                1,
                "What is the name of this fruit?",
                R.drawable.guava_quiz,
                "Avocado",
                "Guava",
                "Coconut",
                "Watermelon",
                2
            )
            questionList.add(que1)

            val que2 = QuizModel(
                2,
                "What is the name of this fruit?",
                R.drawable.avocado_quiz,
                "Avocado",
                "Watermelon",
                "Potato",
                "Guava",
                1
            )
            questionList.add(que2)

            val que3 = QuizModel(
                3,
                "What is the name of this fruit?",
                R.drawable.banana_quiz,
                "Avocado",
                "Banana",
                "Watermelon",
                "Cucumber",
                2
            )
            questionList.add(que3)

            val que4 = QuizModel(
                4,
                "What is the name of this fruit?",
                R.drawable.watermelon_quiz,
                "Melon",
                "Watermelon",
                "Dragon Fruit",
                "Banana",
                2
            )
            questionList.add(que4)

            val que5 = QuizModel(
                5,
                "What is the name of this fruit?",
                R.drawable.papaya_quiz,
                "Strawberry",
                "Papaya",
                "Watermelon",
                "Grape",
                2
            )
            questionList.add(que5)
        }

        return questionList
    }

}