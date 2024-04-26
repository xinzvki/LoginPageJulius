package com.example.loginpage2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import
class MainActivity: AppCompatActivity() {
    lateinit var usernameInput EditText
    lateinit var passwordInput EditText
    lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn findViewById(R.id.login_btn)
        loginBtn.setOnClickListener {
        val username usernameInput-test.toString()
            val password passwordingut text.toString()
        Log.i("","Username : $username  Password : $password")

        }
    }
}