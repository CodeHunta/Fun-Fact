package com.codehunta.funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.codehunta.funfact.databinding.ActivityLoginBinding
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    private var binding:ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)

        val nextButton = findViewById<MaterialButton>(R.id.btn_next)
        nextButton.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val email = binding?.inputEmail.toString()
        val password = binding?.inputPassword.toString()

        if (email == "codehunta@zuri.com" && password == "SuperM4n") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else {
            Toast.makeText(this, "Provide appropriate email & password to login", Toast.LENGTH_LONG).show()
        }
    }
}