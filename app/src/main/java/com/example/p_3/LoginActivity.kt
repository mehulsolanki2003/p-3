package com.example.p_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("ClassName")
class loginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when (it1.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this,activity_registration::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
        binding.tvSignup.setOnClickListener {
            Intent(this, activity_registration::class.java).apply { startActivity(this)
            }
        }




    }
}

