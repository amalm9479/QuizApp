package com.amjedalmousawi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_choose_your_quiz.*
import kotlinx.android.synthetic.main.activity_main.*


class ChooseYourQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_your_quiz)

        FalgQuizImageView.setOnClickListener {

            val intent = Intent(this, QuizQuestionsFalg::class.java)
            startActivity(intent)

            }

        grammerQuizImageView.setOnClickListener {
            val intent = Intent(this, QuizQuestionsGrammer::class.java)
            startActivity(intent)

        }
        animalQuizImageView.setOnClickListener {
            val intent = Intent(this, QuizQuestionsAnimal::class.java)
            startActivity(intent)

        }
        carQuizImageView.setOnClickListener {
            val intent = Intent(this, QuizQuestionsCar::class.java)
            startActivity(intent)

        }
        }
    }
