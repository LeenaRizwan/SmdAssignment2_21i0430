package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class LogoPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo1)
        var btn = findViewById<CircleImageView>(R.id.main)

        btn.setOnClickListener {
            startActivity(
                Intent(this,
                    Login2::class.java)
            );
        }
    }
}