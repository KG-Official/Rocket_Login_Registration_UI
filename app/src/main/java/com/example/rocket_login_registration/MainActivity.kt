package com.example.rocket_login_registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.signup).setOnClickListener{
            intent = Intent(applicationContext, Registration::class.java)
            startActivity(intent)
        }

    }
}