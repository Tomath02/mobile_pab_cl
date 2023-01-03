package com.tito.pabcl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tito.pabcl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main), View.OnClickListener {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Characters> = arrayListOf()
    private lateinit var listGenshinAdapter: ListGenshinAdapter
    private lateinit var profileBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvCharacters.setHasFixedSize(true)
        list.addAll(CharactersData.listData)

        profileBtn = findViewById(R.id.profile)

        profileBtn.setOnClickListener(this)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvCharacters.layoutManager = LinearLayoutManager(this@MainActivity)
            listGenshinAdapter = ListGenshinAdapter(list)
            rvCharacters.adapter = listGenshinAdapter
        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.profile -> run {
                val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(profileIntent)
            }
        }
    }
}