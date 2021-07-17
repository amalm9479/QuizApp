package com.amjedalmousawi.quizapp

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import kotlinx.android.synthetic.main.activity_result.*

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {

    private var mInterstitialAd: InterstitialAd? = null

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
        val adRequestI = AdRequest.Builder().build()
        MobileAds.initialize(this) {}
        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."
        //tv_name.text ="$userName"
        InterstitialAd.load(
            this,
            "ca-app-pub-5757320647359935/1722447804",
            adRequestI,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d(ContentValues.TAG, adError.message)
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    Log.d(ContentValues.TAG, "Ad was loaded.")
                    mInterstitialAd = interstitialAd
                }
            })
        btn_finish.setOnClickListener {

            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            } else {
                val intent = Intent(this@ResultActivity, ChooseYourQuiz::class.java)
                startActivity(intent)
            }
            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback() {

                override fun onAdDismissedFullScreenContent() {
                    val intent = Intent(this@ResultActivity, ChooseYourQuiz::class.java)
                    startActivity(intent)
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {

                    val intent = Intent(this@ResultActivity, ChooseYourQuiz::class.java)
                    startActivity(intent)
                }

                override fun onAdShowedFullScreenContent() {
                    mInterstitialAd = null
                }


            }
        }

    }
}