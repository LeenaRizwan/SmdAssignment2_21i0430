package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import de.hdodenhof.circleimageview.CircleImageView

class BookedSess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bookedsess)
        var btnA= findViewById<CircleImageView>(R.id.button77)
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    ProfileHome::class.java)
            );}
    }
}