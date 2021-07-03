package com.amjedalmousawi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import kotlinx.android.synthetic.main.activity_result.*


@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {

    private var mRewardedAd: RewardedAd? = null
    private final var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {


            val adRequest = AdRequest.Builder().build()

            RewardedAd.load(
                this,
                "ca-app-pub-3940256099942544/5224354917",
                adRequest,
                object : RewardedAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.d(TAG, adError.message)
                        mRewardedAd = null
                    }

                    override fun onAdLoaded(rewardedAd: RewardedAd) {
                        Log.d(TAG, "Ad was loaded.")
                        mRewardedAd = rewardedAd
                        mRewardedAd?.fullScreenContentCallback =
                            object : FullScreenContentCallback() {}
                    }
                }
            )


                startActivity(Intent(this, MainActivity::class.java))
            }
            // END
        }
    }
