package com.codehunta.funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.codehunta.funfact.databinding.ActivityLoginBinding
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextButton = findViewById<MaterialButton>(R.id.btn_login)
        nextButton.setOnClickListener {
            userLogin()
        }
    }

    private fun userLogin() {
        val email = binding.inputEmail.text.toString()
        val password = binding.inputPassword.text.toString()

        if (email == "codehunta@zuri.com" && password == "SuperM4n") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else {
            Toast.makeText(this, "Provide appropriate email & password to login", Toast.LENGTH_LONG).show()
        }
    }
}