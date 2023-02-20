package com.sinlish.menus.quiz

import com.sinlish.R

object QuizData {

    const val QUIZ_THEME: String = "theme"
    const val QUIZ_CORRECT: String = "correct"
    const val QUIZ_TOTAL: String = "total"

    fun getQuestions(theme: String): ArrayList<QuizModel> {
        val questionList = ArrayList<QuizModel>()

        when (theme) {
            "animal" -> {
                val que1 = QuizModel(
                    1,
                    "What is the name of the animal?",
                    R.drawable.animal_duck,
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
                    R.drawable.animal_penguin,
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
                    R.drawable.animal_rabbit,
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
                    R.drawable.animal_shark,
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
                    R.drawable.animal_beaver,
                    "Beaver",
                    "Duck",
                    "Rabbit",
                    "Shark",
                    1
                )
                questionList.add(que5)
            }
            "food" -> {
                val que1 = QuizModel(
                    1,
                    "What is the name of this food?",
                    R.drawable.food_sandwich,
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
                    R.drawable.food_donut,
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
                    R.drawable.food_pizza,
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
                    R.drawable.food_chicken,
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
                    R.drawable.food_hotdog,
                    "Sandwich",
                    "Donuts",
                    "Hotdog",
                    "Pizza",
                    3
                )
                questionList.add(que5)
            }
            "fruit" -> {
                val que1 = QuizModel(
                    1,
                    "What is the name of this fruit?",
                    R.drawable.fruit_guava,
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
                    R.drawable.fruit_avocado,
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
                    R.drawable.fruit_banana,
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
                    R.drawable.fruit_watermelon,
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
                    R.drawable.fruit_papaya,
                    "Strawberry",
                    "Papaya",
                    "Watermelon",
                    "Grape",
                    2
                )
                questionList.add(que5)
            }
        }

        return questionList
    }

}