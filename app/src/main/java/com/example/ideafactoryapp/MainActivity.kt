package com.example.ideafactoryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_up_button.setOnClickListener {
            val signUpIntent = Intent(this, LoginActivity::class.java)
            startActivity(signUpIntent)
        }

        light_control_button.setOnClickListener {
            val signUpIntent = Intent(this, LightControlActivity::class.java)
            startActivity(signUpIntent)
        }
    }
}
