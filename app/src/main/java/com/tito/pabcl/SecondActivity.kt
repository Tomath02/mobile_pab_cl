package com.tito.pabcl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tito.pabcl.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(R.layout.activity_second), View.OnClickListener {
    private val binding : ActivitySecondBinding by viewBinding()
    private lateinit var backBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        backBtn = findViewById(R.id.back)

        backBtn.setOnClickListener(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }

    private fun setData() {
        binding.apply {
            val characters = intent.getParcelableExtra<Characters>(EXTRA_DETAIL)

            tvGenshinName.text = characters?.name
            tvVision.text = characters?.vision
            tvWeapon.text = characters?.weapon
            tvGenshinDetail.text = characters?.detail

            Glide.with(this@SecondActivity)
                .load(characters?.photo)
                .apply(RequestOptions())
                .into(ivCharacter)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.back -> run {
                onBackPressed()
            }
        }
    }
}