package com.tito.pabcl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView

class Splash_Screen : AppCompatActivity() {

    private lateinit var iv_logo : ImageView
//    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        iv_logo = findViewById(R.id.iv_logo)
        iv_logo.alpha = 0f
        iv_logo.animate().setDuration(3000).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

//        handler = Handler()
//        handler.postDelayed({
//
//            val splashIntent = Intent(this, MainActivity::class.java)
//            startActivity(splashIntent)
//        }, 3000)

    }
}