package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import de.hdodenhof.circleimageview.CircleImageView

class ForgotPassword3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgotpassword3)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2 =findViewById<CircleImageView>(R.id.button4)
        var btn3 =findViewById<CircleImageView>(R.id.button41)
        btn.setOnClickListener {
            startActivity(
                Intent(this,
                    Login2::class.java)
            );}
        btn3.setOnClickListener {
            startActivity(
                Intent(this,
                    NewPassword6::class.java)
            );}
            btn2.setOnClickListener {
                startActivity(

                    Intent(this,
                        Login2::class.java)
                );
        }
    }
}