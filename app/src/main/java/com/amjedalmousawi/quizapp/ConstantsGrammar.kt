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
            4, " They have put speed bumps on the road to ______ accidents.",
            "avoid", "prohibit",
            "prevent", "forbid", 3
        )

        questionsList.add(que4)

        val que5 = QuestionG(
            5, " The doctor gave me a ______ for some medicine yesterday.",
            "note", "receipt",
            "prescription", "recipe", 3
        )

        questionsList.add(que5)
        val que6 = QuestionG(
            6, "I'd like ______ information, please.",
            "an", "some",
            "piece", "a piece", 2
        )

        questionsList.add(que6)

        // 2
        val que7 = QuestionG(
            7, "He told me that he ______ in Spain the previous year.",
            "has been working", "had been working",
            "has worked", "had been worked", 2
        )

        questionsList.add(que7)

        val que8 = QuestionG(
            8, " His office is on the second ______ of the building.",
            "floor", "level",
            "ground", "stage", 1
        )

        questionsList.add(que8)

        val que9 = QuestionG(
            9, " We would never have had the accident if you ______ so fast.",
            "wouldn't been driving", "hadn't been driving",
            "had driven", "wouldn't drive", 2
        )

        questionsList.add(que9)

        val que10 = QuestionG(
            10, " I want to be a teacher when I ______.",
            "grow", "age",
            "grow up", "am more years", 3
        )

        questionsList.add(que10)

        val que11 = QuestionG(
            11, "You should ______ your homework",
            "make", "do",
            "work", "give", 2
        )

        questionsList.add(que11)

        // 2
        val que12 = QuestionG(
           12, "______ the better team, we lost the match.",
            "Despite of being", "Despite",
            "Despite being", "Although", 3
        )

        questionsList.add(que12)

        val que13 = QuestionG(
            13, "Did you speak to Juliet?No, I've ______ seen her.",
            "nearly", "hardly",
            "often", "always", 2
        )

        questionsList.add(que13)

        val que14 = QuestionG(
            14, "Can you tell me when ______ ?",
            "does the train leave", "leaves the train",
            "does leave the train", "the train leaves", 4
        )

        questionsList.add(que14)

        val que15 = QuestionG(
            15, "Have you visited London?______.",
            "Not yet", "Ever",
            "Already", "Not", 1
        )

        questionsList.add(que15)
        val que16 = QuestionG(
            16, "Is Jo ______ Chris?",
            "taller that", "taller",
            "as tall as", "more tall", 3
        )

        questionsList.add(que16)

        // 2
        val que17 = QuestionG(
            17, "You ______ better see a doctor.",
            "did", "would",
            "should", "had", 4
        )

        questionsList.add(que17)

        val que18 = QuestionG(
            18, " You should ______ swimming.",
            "start up", "get off",
            "take up", "take off", 3
        )

        questionsList.add(que18)

        val que19 = QuestionG(
            19, "When Simon ______ back tonight, he'll cook dinner.",
            "comes", "will come",
            "come", "shall come", 1
        )

        questionsList.add(que19)

        val que20 = QuestionG(
            20, " We arrived ______ England two days ago.",
            "to", "in",
            "on", "at", 2
        )

        questionsList.add(que20)

        val que21 = QuestionG(
            21, "The tree ______ by lightning.",
            "was flashed", "struck",
            "was struck", "flashed", 3
        )

        questionsList.add(que21)

        // 2
        val que22 = QuestionG(
            22, "How long ______ English?",
            "do you learn", "are you learning",
            "have you been learning", "you learn", 3
        )

        questionsList.add(que22)

        val que23 = QuestionG(
            23, "There aren't ______ people here.",
            "much", "many",
            "a lot", "some", 2
        )

        questionsList.add(que23)

        val que24 = QuestionG(
            24, "She ______ me to go to school.",
            "said", "told",
            "suggested", "made", 2
        )

        questionsList.add(que24)

        val que25 = QuestionG(
            25, "The best way to learn a language is ______ a little every day.",
            "speak", "in speaking",
            "to speaking", "by speaking", 4
        )

        questionsList.add(que25)
        val que26 = QuestionG(
            26, "You ______ the cleaning. I would have done it tonight.",
            "needn't have done", "couldn't have done",
            "can't have done", "wouldn't have done", 1
        )

        questionsList.add(que26)

        // 2
        val que27 = QuestionG(
            27, "I went to the shop ______ some chocolate.",
            "for buying", "for buy",
            "to buy", "buy", 3
        )

        questionsList.add(que27)

        val que28 = QuestionG(
            28, " She has been ______ of murdering her husband.",
            "charged", "accused",
            "arrested", "blamed", 2
        )

        questionsList.add(que28)

        val que29 = QuestionG(
            29, "He's interested ______ learning Spanish",
            "in", "to",
            "on", "for", 1
        )

        questionsList.add(que29)

        val que30 = QuestionG(
            30, "By this time next year, I ______ all my exams.",
            "will take", "will have taken",
            "take", "have taken", 2
        )

        questionsList.add(que30)


 val que31 = QuestionG(
            31, "Would you mind ______ the window?",
            "closing", "close",
            "to close", "closed", 1
        )

        questionsList.add(que31)

        val que32 = QuestionG(
            32, "I don't like coffee.______ do I.",
            "So", "Neither",
            "Either", "No", 2
        )

        questionsList.add(que32)

        // 2
        val que33 = QuestionG(
            33, "Tim ______ work tomorrow.",
            "isn't going", "isn't",
            "isn't going to", "isn't to", 3
        )

        questionsList.add(que33)

        val que34 = QuestionG(
            34, "I come ______ England",
            "from", "at",
            "to", "beyond", 1
        )

        questionsList.add(que34)

        val que35 = QuestionG(
            35, "It ______ my brother.",
            "is ages that I didn't see", "is ages since I saw",
            "was ages that I haven't seen", "was ages since I saw", 2
        )

        questionsList.add(que35)

        val que36 = QuestionG(
            36, "I ______ a reply to my letter in the next few days.",
            "hope", "get",
            "wait for", "expect", 4
        )

        questionsList.add(que36)
        val que37 = QuestionG(
            37, "She looks ______ she's going to be sick.",
            "as if", "as",
            "likes", "if", 1
        )

        questionsList.add(que37)

        // 2
        val que38 = QuestionG(
            38, "Why are you so hungry? oh, I ______ breakfast this morning.",
            "hadn't", "didn't",
            "didn't have", "haven't", 3
        )

        questionsList.add(que38)

        val que39 = QuestionG(
            39, "If only I ______ richer.",
            "am", "were",
            "would be", "will be", 2
        )

        questionsList.add(que39)

        val que40 = QuestionG(
            40, "Where's the ______ post office, please?",
            "most near", "near",
            "more near", "nearest", 4
        )

        questionsList.add(que40)



        questionsList.shuffle()
        return questionsList
    }
}

