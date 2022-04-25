package com.example.a19bca146

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var image=imageView
        var fadeIn= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
        // fadeIn.setAnimationListener(this);
        image.startAnimation(fadeIn);


        Handler().postDelayed(Runnable {


            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

            finish()
        },8000)
    }
}