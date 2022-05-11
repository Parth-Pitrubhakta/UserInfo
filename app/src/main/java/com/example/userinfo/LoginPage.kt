package com.example.userinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val forgotpassword = findViewById<TextView>(R.id.TextButton_loginpg_forgotpassword)
        val btnsignup = findViewById<TextView>(R.id.TextButton_Signup)
        val btnlogin = findViewById<Button>(R.id.Button_Login)

        forgotpassword.setOnClickListener {
            startActivity(Intent(this,ForgotPasswordPage::class.java))
        }

        btnsignup.setOnClickListener {
            startActivity(Intent(this,SignUpPage::class.java))
            finish()
        }

        btnlogin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}