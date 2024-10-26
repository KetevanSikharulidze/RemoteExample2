package com.example.remoteapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.remoteapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            signUpRegisterBtn.setOnClickListener {

                val username = signUpUsernameEditText.text.toString()
                var age = signUpAgeEditText.text.toString()
                if (age.isEmpty()){
                    age = "0"
                }
                age.toInt()

                val height = signUpHeightEditText.text.toString().toDouble()
                val password = signUpPasswordEditText.text.toString()

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("username", username)
                intent.putExtra("age",age)
                intent.putExtra("height",height) //როცა ეს ველი არ არის შევსებული, ცალიელ სტრინგად აღიქმევა height EditText-ი, ამიტომ ვერ გადავა double ტიპში. და დაიქრაშება.
                intent.putExtra("password", password)
                startActivity(intent)
                finish()
            }

        }
    }
}