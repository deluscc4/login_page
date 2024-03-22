package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()
            if (username.equals("delusc") && password.equals("1234")) {
                Toast.makeText(applicationContext, "Seja bem-vindo!", Toast.LENGTH_LONG).show()
                val i = Intent(this, ProfileActivity::class.java)
                i.putExtra("username", username)
                startActivity(i)
            } else {
                Toast.makeText(applicationContext, "Usuário e/ou senha incorreto.", Toast.LENGTH_LONG).show()
                binding.editUsername.setText("")
                binding.editPassword.setText("")
            }


        }
    }
}
