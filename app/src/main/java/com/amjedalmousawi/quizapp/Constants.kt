package com.amjedalmousawi.quizapp


object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
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
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_afghanistan,
            "Argentina", "Belize",
            "Armenia", "afghanistan", 4
        )

        questionsList.add(que11)

        // 2
        val que12 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bahrain,
            "qatar", "egypt",
            "bahrain", "Kuwait", 3
        )

        questionsList.add(que12)

        // 3
        val que13 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            "Belarus", "Denmark",
            "Manchester", "Canada", 4
        )

        questionsList.add(que13)

        // 4
        val que14 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_egypt,
            "Palestine", "egypt",
            "jordon", "bahrain ", 2
        )

        questionsList.add(que14)

        // 5
        val que15 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_england,
            "Gabon", "France",
            "england", "Finland", 3
        )

        questionsList.add(que15)

        // 6
        val que16 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_indonesia,
            "indonesia", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que16)

        // 7
        val que17 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iran,
            "Dominica", "Egypt",
            "iran", "Ethiopia", 3
        )

        questionsList.add(que17)

        // 8
        val que18 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iraq,
            "Ireland", "Iran",
            "kuwait", "iraq", 4
        )

        questionsList.add(que18)

        // 9
        val que19 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ireland,
            "ireland", "New Zealand",
            "Tuvalu", "sudan", 1
        )

        questionsList.add(que19)

        // 10
        val que20 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_italy,
            "italy", "Armenia",
            "ireland", "Palestine", 1
        )

        questionsList.add(que20)

        val que21 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_japan,
            "Argentina", "japan",
            "korea", "china", 2
        )

        questionsList.add(que21)

        // 2
        val que22 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_jordan,
            "saudi arabia ", "lebanon",
            "jordan", "kuwait", 3
        )

        questionsList.add(que22)

        // 3
        val que23 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_lebanon,
            "Belarus", "jordan",
            "Brunei", "lebanon", 4
        )

        questionsList.add(que23)

        // 4
        val que24 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "mexico", "Belgium",
            "Fiji", "France", 1
        )

        questionsList.add(que24)

        // 5
        val que25 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_morocco,
            "Gabon", "morocco",
            "lebanon", "Finland", 2
        )

        questionsList.add(que25)

        // 6
        val que26 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_oman,
            "oman", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que26)

        // 7
        val que27 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_pakistan,
            "pakistan", "Egypt",
            "Denmark", "Ethiopia", 1
        )

        questionsList.add(que27)

        // 8
        val que28 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_palestine,
            "Ireland", "Iran",
            "palestine", "Jordan", 3
        )

        questionsList.add(que28)

        // 9
        val que29 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_qatar,
            "kuwait", "oman",
            "qatar", "bahrain", 3
        )

        questionsList.add(que29)

        // 10
        val que30 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_south_korea,
            "Philippine", "north_korea",
            "china", "south_korea", 4
        )

        questionsList.add(que30)

        val que31 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_syria,
            "syria", "qatar",
            "Armenia", "egypt", 1
        )

        questionsList.add(que31)

        // 2
        val que32 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Philippine", "taiwan",
            "thailand", "none of these", 3
        )

        questionsList.add(que32)

        // 3
        val que33 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_arab_emirates,
            "kuwait", "jordon",
            "saudi arabia", "united_arab_emirates", 4
        )

        questionsList.add(que33)

        // 4
        val que34 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_kingdom,
            "Bahamas", "united_kingdom",
            "Barbados", "Belize", 2
        )

        questionsList.add(que34)

        // 5
        val que35 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_states_of_america,
            "Gabon", "France",
            "united_states_of_america", "Finland", 3
        )

        questionsList.add(que35)
        val que36 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_vietnam,
            "vietnam", "jordan",
            "Brunei", "lebanon", 1
        )

        questionsList.add(que36)
        val que37 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_yemen,
            "Gabon", "Syria",
            "yemen", "non of these", 3
        )

        questionsList.add(que37)

        return questionsList
    }
}