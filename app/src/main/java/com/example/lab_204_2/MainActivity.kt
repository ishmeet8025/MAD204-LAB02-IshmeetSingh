package com.example.lab_204_2

/**
 * Course: MAD204 - Java Development for MA
 * Lab: 2 - Login + Greeting App
 * Author: Ishmeet Singh (A00202436)
 * Date: October 2025
 * Description: Simple login screen that navigates to MainActivity after successful login.
 **/
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the username passed from LoginActivity
        val username = intent.getStringExtra("username") ?: "User"
        // Reference TextView and Button
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        // Display greeting
        tvGreeting.text = "Welcome, $username!"
        // Logout button click listener
        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
