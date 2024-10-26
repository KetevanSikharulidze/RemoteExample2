package com.example.remoteapp2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.remoteapp2.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            usernameTextView.text = intent.extras?.getString("username","username not entered")
            ageTextView.text = intent.extras?.getInt("age",0).toString()
            heightTextView.text = intent.extras?.getDouble("height", 0.0).toString()
            passwordTextView.text = intent.extras?.getString("password","password not entered")
            notRobotTextView.text = "not robot: ${intent.extras?.getBoolean("notRobot",false)}"
        }

    }
}