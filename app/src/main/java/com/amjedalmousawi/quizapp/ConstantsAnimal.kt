package com.amjedalmousawi.quizapp

object ConstantsAnimal {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What is the name of this animal",
            R.drawable.an_bear,
            "bear", "deer",
            "dear", "beer", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is the name of this animal",
            R.drawable.an_bull,
            "sheep", "cow",
            "bull", "dog", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is the name of this animal",
            R.drawable.an_camel,
            "giraffe", "camel",
            "geiraffe", "camal", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the name of this animal",
            R.drawable.an_cat,
            "dog", "cat",
            "hem", "cow", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is the name of this animal",
            R.drawable.an_cow,
            "bull", "ostrich",
            "cow", "bear", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the name of this animal",
            R.drawable.an_crocodile,
            "crocodile", "lizard",
            "crocadile", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the name of this animal",
            R.drawable.an_deer,
            "deer", "dear",
            "bear", "beer", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the name of this animal",
            R.drawable.an_dog,
            "line", "fox",
            "cat", "dog", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the name of this animal",
            R.drawable.an_elephant,
            "alephant", "elephant",
            "rhinoceros", "panda", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is the name of this animal",
            R.drawable.an_fox,
            "fox", "wolf",
            "dog", "lion", 1
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "What is the name of this animal",
            R.drawable.an_giraffe,
            "snake", "dear",
            "camel", "giraffe", 4
        )

        questionsList.add(que11)

        // 2
        val que12 = Question(
            12, "What is the name of this animal",
            R.drawable.an_gorilla,
            "hem", "owl",
            "gorilla", "monkey", 3
        )

        questionsList.add(que12)

        // 3
        val que13 = Question(
            13, "What is the name of this animal",
            R.drawable.an_hedgehog,
            "pig", "snake",
            "squirrel", "hedgehog", 4
        )

        questionsList.add(que13)

        // 4
        val que14 = Question(
            14, "What is the name of this animal",
            R.drawable.an_hem,
            "sheep", "hem",
            "cat", "peacock ", 2
        )

        questionsList.add(que14)

        // 5
        val que15 = Question(
            15, "What is the name of this animal",
            R.drawable.an_kangaroo,
            "kangaroo", "lizard",
            "zebra", "crocodile", 1
        )

        questionsList.add(que15)

        // 6
        val que16 = Question(
            16, "What is the name of this animal",
            R.drawable.an_lion,
            "lion", "cat",
            "wolf", "dog", 1
        )

        questionsList.add(que16)

        // 7
        val que17 = Question(
            17, "What is the name of this animal",
            R.drawable.an_lizard,
            "frog", "owl",
            "bird", "lizard", 4
        )

        questionsList.add(que17)

        // 8
        val que18 = Question(
            18, "What is the name of this animal",
            R.drawable.an_monkey,
            "gorilla", "chimpanzee",
            "donkey", "monkey", 4
        )

        questionsList.add(que18)

        // 9
        val que19 = Question(
            19, "What is the name of this animal",
            R.drawable.an_ostrich,
            "ostrich", "chicken",
            "sheep", "hem", 1
        )

        questionsList.add(que19)

        // 10
        val que20 = Question(
            20, "What is the name of this animal",
            R.drawable.an_owl,
            "bird", "owl",
            "squirrel", "bull", 2
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "What is the name of this animal",
            R.drawable.an_panda,
            "dear", "panda",
            "fox", "gorilla", 2
        )

        questionsList.add(que21)

        // 2
        val que22 = Question(
            22, "What is the name of this animal",
            R.drawable.an_peacock,
            "cow ", "elephant",
            "peacock", "zebra", 3
        )

        questionsList.add(que22)

        // 3
        val que23 = Question(
            23, "What is the name of this animal",
            R.drawable.an_sheep,
            "monkey", "snake",
            "pig", "sheep", 4
        )

        questionsList.add(que23)

        // 4
        val que24 = Question(
            24, "What is the name of this animal",
            R.drawable.an_penguins,
            "penguins", "ostrich",
            "hedgehog", "kangaroo", 1
        )

        questionsList.add(que24)

        // 5
        val que25 = Question(
            25, "What is the name of this animal",
            R.drawable.an_pig,
            "peacock", "pig",
            "panda", "penguins", 2
        )

        questionsList.add(que25)

        // 6
        val que26 = Question(
            26, "What is the name of this animal",
            R.drawable.an_polar_bear,
            "polar_bear", "elephant",
            "panda", "bear", 1
        )

        questionsList.add(que26)

        // 7
        val que27 = Question(
            27, "What is the name of this animal",
            R.drawable.an_rhinoceros,
            "rhinoceros", "crocodile",
            "bear", "lion", 1
        )

        questionsList.add(que27)

        // 8
        val que28 = Question(
            28, "What is the name of this animal",
            R.drawable.an_snake,
            "zebra", "pig",
            "snake", "fox", 3
        )

        questionsList.add(que28)

        // 9
        val que29 = Question(
            29, "What is the name of this animal",
            R.drawable.an_zebra,
            "lion", "donkey",
            "zebra", "monkey", 3
        )

        questionsList.add(que29)

        // 10
        val que30 = Question(
            30, "What is the name of this animal",
            R.drawable.an_squirrel,
            "gorilla", "lizard",
            "owl", "squirrel", 4
        )

        questionsList.add(que30)
        // هذا الكود يسوي random
        questionsList.shuffle()

        return questionsList
    }
}
