package com.fatihsenturk.odev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private var splashActivitytimeout : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, splashActivitytimeout)
    }

    private fun loadSplashScreen(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity:: class.java))
        }, 3000)
    }

}

