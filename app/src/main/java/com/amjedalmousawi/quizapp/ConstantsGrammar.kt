package com.amjedalmousawi.quizapp

object ConstantsGrammar {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<QuestionG> {

        val questionsList = ArrayList<QuestionG>()


        // 1
        val que1 = QuestionG(
            1, "I'm fed up ______ this excersice",
            "with doing", "to do",
            "to doing", "for doing", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = QuestionG(
            2, "______ to school yesterday?",
            "Do you walk", "Did you walked",
            "Did you walk", "Have you walked", 3
        )

        questionsList.add(que2)

        val que3 = QuestionG(
            3, " You aren't allowed to use your mobile so ______.",
            "it's no point to leave it on", "it's no point in leaving it on",
            "there's no point in leaving it on", "there's no point to leave it on", 3
        )

        questionsList.add(que3)
        val que4 = QuestionG(
            3, " You aren't allowed to use your mobile so ______.",
            "it's no point to leave it on", "it's no point in leaving it on",
            "there's no point in leaving it on", "there's no point to leave it on", 3
        )

        questionsList.add(que4)
        val que5 = QuestionG(
            3, " You aren't allowed to use your mobile so ______.",
            "it's no point to leave it on", "it's no point in leaving it on",
            "there's no point in leaving it on", "there's no point to leave it on", 3
        )

        questionsList.add(que5)





        questionsList.shuffle()
        return questionsList
    }
}

