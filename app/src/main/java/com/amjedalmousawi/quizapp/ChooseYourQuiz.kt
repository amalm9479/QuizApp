package com.amjedalmousawi.quizapp

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_choose_your_quiz.*

class ChooseYourQuiz : AppCompatActivity() {

    private var mInterstitialAd: InterstitialAd? = null

    /**
     * This function is auto created by Android when the Activity Class is created.
     */

    lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_choose_your_quiz)
        @Suppress("DEPRECATION")

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        MobileAds.initialize(this)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val adView = AdView(this)

        adView.adSize = AdSize.BANNER

        adView.adUnitId = "ca-app-pub-3940256099942544/6300978111"
        val adRequestI = AdRequest.Builder().build()
        MobileAds.initialize(this) {}


        InterstitialAd.load(
            this,
            "ca-app-pub-3940256099942544/1033173712",
            adRequestI,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d(TAG, adError.message)
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    Log.d(TAG, "Ad was loaded.")
                    mInterstitialAd = interstitialAd
                }
            })


        FalgQuizImageView.setOnClickListener {
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }

            mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    val intent = Intent(this@ChooseYourQuiz, QuizQuestionsCar::class.java)
                    startActivity(intent)
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {

                    val intent = Intent(this@ChooseYourQuiz, QuizQuestionsCar::class.java)
                    startActivity(intent)
                }
                }

        }
        grammerQuizImageView.setOnClickListener {

            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }

            val intent = Intent(this, QuizQuestionsGrammer::class.java)
            startActivity(intent)
        }
            animalQuizImageView.setOnClickListener {
                if (mInterstitialAd != null) {
                    mInterstitialAd?.show(this)
                }

                val intent = Intent(this, QuizQuestionsAnimal::class.java)
                startActivity(intent)
            }
            carQuizImageView.setOnClickListener {
                if (mInterstitialAd != null) {
                    mInterstitialAd?.show(this)
                }
                val intent = Intent(this, QuizQuestionsCar::class.java)
                startActivity(intent)
            }
        }
    }





