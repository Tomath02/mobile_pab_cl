package com.tito.pabcl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ProfileActivity : AppCompatActivity(R.layout.activity_profile), View.OnClickListener {
    private lateinit var backBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        backBtn = findViewById(R.id.back)

        backBtn.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.back -> run {
                onBackPressed()
            }
        }
    }
}