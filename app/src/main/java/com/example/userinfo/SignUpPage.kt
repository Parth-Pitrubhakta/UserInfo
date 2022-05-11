package com.example.userinfo

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.firebase.database.ktx.database

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        val btnLogin = findViewById<TextView>(R.id.TextButton_Login)
        val btnSignUp = findViewById<Button>(R.id.Button_profile_update)

        val name = findViewById<TextView>(R.id.EditText_name)
        val username = findViewById<TextView>(R.id.EditText_username)
        val email = findViewById<TextView>(R.id.EditText_email)
        val phone = findViewById<TextView>(R.id.EditText_phone_no)
        val password = findViewById<TextView>(R.id.EditText_password)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
            finish()
        }

        btnSignUp.setOnClickListener {

            signupDetails(name.text.toString(),username.text.toString(),email.text.toString(),phone.text.toString(),password.text.toString())
        }
    }

    private fun signupDetails(name: String, username: String, email: String, phone: String, password: String) {
        val database = Firebase.database.reference
        val adduser1 = adduser(name, username, email, phone, password)
        val data = adduser1.toMap()
        val key = database.child("USER/Users").push().key
        val adduser_updates = hashMapOf<String, Any>("USER/${Firebase.auth.uid}/Users/$key" to data,
            "USER/users/$key" to data)
        database.updateChildren(adduser_updates).addOnSuccessListener {
            Log.d(ContentValues.TAG, "Successfully stored user data to firebase db")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}