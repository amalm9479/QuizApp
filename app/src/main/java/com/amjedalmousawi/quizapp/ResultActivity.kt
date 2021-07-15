package com.amjedalmousawi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardedAd
import kotlinx.android.synthetic.main.activity_result.*

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {

    private var mRewardedAd: RewardedAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName1 = intent.getStringExtra(ConstantsFalg.USER_NAME)
        val userName2 = intent.getStringExtra(ConstantsCar.USER_NAME)
        val userName3 = intent.getStringExtra(ConstantsGrammar.USER_NAME)
        val userName4 = intent.getStringExtra(ConstantsAnimal.USER_NAME)
        tv_name.text = userName1
        tv_name.text = userName2
        tv_name.text = userName3
        tv_name.text = userName4

        val totalQuestions = intent.getIntExtra(ConstantsFalg.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstantsFalg.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."
        //tv_name.text ="$userName"

        btn_finish.setOnClickListener {

            mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {}

            startActivity(Intent(this, MainActivity::class.java))

        }
    }

}