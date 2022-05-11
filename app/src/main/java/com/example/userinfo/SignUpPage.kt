package com.example.userinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        val btnLogin = findViewById<TextView>(R.id.TextButton_Login)
        val btnSignUp = findViewById<Button>(R.id.Button_SignUp)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
            finish()
        }

        btnSignUp.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}