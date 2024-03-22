package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.myapplication.databinding.ActivityProfileBinding

class ProfileActivity : ComponentActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val username = i.extras?.getString("username")
        binding.textUser.setText("Olá, ${username}!")

        binding.buttonSair.setOnClickListener {
            finish()
        }
    }
}