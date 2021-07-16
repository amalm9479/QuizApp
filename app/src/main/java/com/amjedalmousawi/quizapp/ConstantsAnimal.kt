package com.amjedalmousawi.quizapp

object ConstantsAnimal {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_afghanistan,
            "Argentina", "Belize",
            "Armenia", "afghanistan", 4
        )

        questionsList.add(que11)

        // 2
        val que12 = Question(
            12, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bahrain,
            "qatar", "egypt",
            "bahrain", "Kuwait", 3
        )

        questionsList.add(que12)

        // 3
        val que13 = Question(
            13, "What country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            "Belarus", "Denmark",
            "Manchester", "Canada", 4
        )

        questionsList.add(que13)

        // 4
        val que14 = Question(
            14, "What country does this flag belong to?",
            R.drawable.ic_flag_of_egypt,
            "Palestine", "egypt",
            "jordon", "bahrain ", 2
        )

        questionsList.add(que14)

        // 5
        val que15 = Question(
            15, "What country does this flag belong to?",
            R.drawable.ic_flag_of_england,
            "Gabon", "France",
            "england", "Finland", 3
        )

        questionsList.add(que15)

        // 6
        val que16 = Question(
            16, "What country does this flag belong to?",
            R.drawable.ic_flag_of_indonesia,
            "indonesia", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que16)

        // 7
        val que17 = Question(
            17, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iran,
            "Dominica", "Egypt",
            "iran", "Ethiopia", 3
        )

        questionsList.add(que17)

        // 8
        val que18 = Question(
            18, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iraq,
            "Ireland", "Iran",
            "kuwait", "iraq", 4
        )

        questionsList.add(que18)

        // 9
        val que19 = Question(
            19, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ireland,
            "ireland", "New Zealand",
            "Tuvalu", "sudan", 1
        )

        questionsList.add(que19)

        // 10
        val que20 = Question(
            20, "What country does this flag belong to?",
            R.drawable.ic_flag_of_italy,
            "italy", "Armenia",
            "ireland", "Palestine", 1
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "What country does this flag belong to?",
            R.drawable.ic_flag_of_japan,
            "Argentina", "japan",
            "korea", "china", 2
        )

        questionsList.add(que21)

        // 2
        val que22 = Question(
            22, "What country does this flag belong to?",
            R.drawable.ic_flag_of_jordan,
            "saudi arabia ", "lebanon",
            "jordan", "kuwait", 3
        )

        questionsList.add(que22)

        // 3
        val que23 = Question(
            23, "What country does this flag belong to?",
            R.drawable.ic_flag_of_lebanon,
            "Belarus", "jordan",
            "Brunei", "lebanon", 4
        )

        questionsList.add(que23)

        // 4
        val que24 = Question(
            24, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "mexico", "Belgium",
            "Fiji", "France", 1
        )

        questionsList.add(que24)

        // 5
        val que25 = Question(
            25, "What country does this flag belong to?",
            R.drawable.ic_flag_of_morocco,
            "Gabon", "morocco",
            "lebanon", "Finland", 2
        )

        questionsList.add(que25)

        // 6
        val que26 = Question(
            26, "What country does this flag belong to?",
            R.drawable.ic_flag_of_oman,
            "oman", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que26)

        // 7
        val que27 = Question(
            27, "What country does this flag belong to?",
            R.drawable.ic_flag_of_pakistan,
            "pakistan", "Egypt",
            "Denmark", "Ethiopia", 1
        )

        questionsList.add(que27)

        // 8
        val que28 = Question(
            28, "What country does this flag belong to?",
            R.drawable.ic_flag_of_palestine,
            "Ireland", "Iran",
            "palestine", "Jordan", 3
        )

        questionsList.add(que28)

        // 9
        val que29 = Question(
            29, "What country does this flag belong to?",
            R.drawable.ic_flag_of_qatar,
            "kuwait", "oman",
            "qatar", "bahrain", 3
        )

        questionsList.add(que29)

        // 10
        val que30 = Question(
            30, "What country does this flag belong to?",
            R.drawable.ic_flag_of_south_korea,
            "Philippine", "north korea",
            "china", "south korea", 4
        )

        questionsList.add(que30)

        val que31 = Question(
            31, "What country does this flag belong to?",
            R.drawable.ic_flag_of_syria,
            "syria", "qatar",
            "Armenia", "egypt", 1
        )

        questionsList.add(que31)

        // 2
        val que32 = Question(
            32, "What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Philippine", "taiwan",
            "thailand", "none of these", 3
        )

        questionsList.add(que32)

        // 3
        val que33 = Question(
            33, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_arab_emirates,
            "kuwait", "jordon",
            "saudi arabia", "united arab emirates", 4
        )

        questionsList.add(que33)

        // 4
        val que34 = Question(
            34, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_kingdom,
            "Bahamas", "united kingdom",
            "Barbados", "Belize", 2
        )

        questionsList.add(que34)

        // 5
        val que35 = Question(
            35, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_states_of_america,
            "Gabon", "France",
            "united states of america", "Finland", 3
        )

        questionsList.add(que35)
        val que36 = Question(
            36, "What country does this flag belong to?",
            R.drawable.ic_flag_of_vietnam,
            "vietnam", "jordan",
            "Brunei", "lebanon", 1
        )

        questionsList.add(que36)
        val que37 = Question(
            37, "What country does this flag belong to?",
            R.drawable.ic_flag_of_yemen,
            "Gabon", "Syria",
            "yemen", "non of these", 3
        )

        questionsList.add(que37)
        // هذا الكود يسوي random
        questionsList.shuffle()

        return questionsList

    }
}
