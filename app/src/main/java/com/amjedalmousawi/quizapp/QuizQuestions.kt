package com.amjedalmousawi.quizapp

import android.content.ContentValues
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import kotlinx.android.synthetic.main.activity_quiz_questions.*
class QuizQuestions : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor]

        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz_questions)
        MobileAds.initialize(this)
        mAdView2 = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView2.loadAd(adRequest)
        // START
        mUserName = intent.getStringExtra(ConstantsFalg.USER_NAME)
        // END
        mQuestionsList = ConstantsFalg.getQuestions()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)



        MobileAds.initialize(this)

        /**
         * This function is auto created by Android when the Activity Class is created.
         */

        var mAdView : AdView = findViewById(R.id.adView)
        mAdView.loadAd(adRequest)


        val adView = AdView(this)

        adView.adSize = AdSize.BANNER

        adView.adUnitId = "ca-app-pub-3940256099942544/6300978111"

        MobileAds.initialize(this) {}




    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                btn_submit.isEnabled = true
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                btn_submit.isEnabled = true

                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                btn_submit.isEnabled = true

                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                btn_submit.isEnabled = true

                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    when {
                        mCurrentPosition <= 10 -> {

                            setQuestion()
                            //واخيرا هنا قدرت اسوي من يختار مايقدر يغير بعد مايضغط submit
                            tv_option_one.isClickable = true
                            tv_option_two.isClickable = true
                            tv_option_three.isClickable = true
                            tv_option_four.isClickable = true
                        }
                        else -> {
                            // START
                            val intent =
                                Intent(this, ResultActivity::class.java)
                            intent.putExtra(ConstantsFalg.USER_NAME, mUserName)
                            intent.putExtra(ConstantsFalg.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(ConstantsFalg.TOTAL_QUESTIONS, 10)
                            startActivity(intent)
                            finish()
                            // END
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    // This is to check if the answer is wrong
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else {
                        mCorrectAnswers++
                    }
                    // This is for correct answer
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
            //mQuestionsList!!.size
                    if (mCurrentPosition == 10) {
                        btn_submit.text = "FINISH"

                    } else {
                        btn_submit.text = "GO TO NEXT QUESTION"
                        tv_option_one.isClickable = false
                        tv_option_two.isClickable = false
                        tv_option_three.isClickable = false
                        tv_option_four.isClickable = false
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }
    private fun setQuestion() {
        btn_submit.isEnabled = false
        val question = mQuestionsList!!.get(mCurrentPosition - 1) // Getting the question from the list with the help of current position.

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "FINISH"


        } else {
            btn_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }
}