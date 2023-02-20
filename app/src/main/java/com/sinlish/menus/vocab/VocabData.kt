package com.sinlish.menus.vocab

import com.sinlish.R

object VocabData {

    const val VOCAB_THEME: String = ""

    fun getVocab(theme: String): ArrayList<VocabModel> {
        val vocabList = ArrayList<VocabModel>()

        when(theme) {
            "animal" -> {
                val voc1 = VocabModel(
                    1,
                    "Penguin",
                    R.drawable.animal_penguin
                )
                vocabList.add(voc1)

                val voc2 = VocabModel(
                    2,
                    "Rabbit",
                    R.drawable.animal_rabbit
                )
                vocabList.add(voc2)

                val voc3 = VocabModel(
                    3,
                    "Beaver",
                    R.drawable.animal_beaver
                )
                vocabList.add(voc3)

                val voc4 = VocabModel(
                    4,
                    "Duck",
                    R.drawable.animal_duck
                )
                vocabList.add(voc4)

                val voc5 = VocabModel(
                    5,
                    "Shark",
                    R.drawable.animal_shark
                )
                vocabList.add(voc5)
            }
            "food" -> {
                val voc1 = VocabModel(
                    1,
                    "Fried Chicken",
                    R.drawable.food_chicken
                )
                vocabList.add(voc1)

                val voc2 = VocabModel(
                    2,
                    "Donut",
                    R.drawable.food_donut
                )
                vocabList.add(voc2)

                val voc3 = VocabModel(
                    3,
                    "Sandwich",
                    R.drawable.food_sandwich
                )
                vocabList.add(voc3)

                val voc4 = VocabModel(
                    4,
                    "Hotdog",
                    R.drawable.food_hotdog
                )
                vocabList.add(voc4)

                val voc5 = VocabModel(
                    5,
                    "Pizza",
                    R.drawable.food_pizza
                )
                vocabList.add(voc5)
            }
            "fruit" -> {
                val voc1 = VocabModel(
                    1,
                    "Guava",
                    R.drawable.fruit_guava
                )
                vocabList.add(voc1)

                val voc2 = VocabModel(
                    2,
                    "Avocado",
                    R.drawable.fruit_avocado
                )
                vocabList.add(voc2)

                val voc3 = VocabModel(
                    3,
                    "Banana",
                    R.drawable.fruit_banana
                )
                vocabList.add(voc3)

                val voc4 = VocabModel(
                    4,
                    "Watermelon",
                    R.drawable.fruit_watermelon
                )
                vocabList.add(voc4)

                val voc5 = VocabModel(
                    5,
                    "Papaya",
                    R.drawable.fruit_papaya
                )
                vocabList.add(voc5)
            }
        }

        return vocabList
    }

}