package com.example.remoteapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    lateinit var notRobot: CheckBox
    lateinit var nextBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        notRobot = findViewById(R.id.notRobotCheckBox)
        nextBtn = findViewById(R.id.nextBtn)

        val username = intent.extras?.getString("username", "username not entered")
        val age = intent.extras?.getInt("age",0)
        val height = intent.extras?.getDouble("height", 0.0)
        val password = intent.extras?.getString("password","000000")

        nextBtn.setOnClickListener {
            if (notRobot.isChecked){
                val notRobotBoolean = true
                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                intent.putExtra("username",username)
                intent.putExtra("age",age)
                intent.putExtra("height", height)
                intent.putExtra("password",password)
                intent.putExtra("notRobot",notRobotBoolean)
                startActivity(intent)
                finish()

            } else {
                return@setOnClickListener
            }

        }

    }
}