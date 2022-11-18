package com.example.p_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("ClassName")
class activity_registration : AppCompatActivity() {
    private lateinit var binding: ActivityregistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener{it1->
            when(it1.itemId)
            {
                R.id.bottom_nav_login->
                {
                    Intent(this,loginActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }

        binding.tvLogin.setOnClickListener{
            Intent(this,loginActivity::class.java).apply {startActivity(this)}
        }
    }
}
