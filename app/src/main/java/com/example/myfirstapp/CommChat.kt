package com.example.myfirstapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import de.hdodenhof.circleimageview.CircleImageView

class CommChat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.commchat)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA=findViewById<ImageButton>(R.id.button77)
        var btnB=findViewById<ImageButton>(R.id.button87)
        var btnC=findViewById<ImageButton>(R.id.button67)
        btnC.setOnClickListener {
            startActivity(
                Intent(this,
                    VidC::class.java)
            );}
        btnB.setOnClickListener {
            startActivity(
                Intent(this,
                    VC::class.java)
            );}
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btn.setOnClickListener {
            startActivity(
                Intent(this,
                    Home::class.java)
            );}
        btn2.setOnClickListener {
            startActivity(
                Intent(this,
                    SearchHome::class.java)
            );}
        btn3.setOnClickListener {
            startActivity(
                Intent(this,
                    ChatHome::class.java)
            );}
        btn4.setOnClickListener {
            startActivity(
                Intent(this,
                    ProfileHome::class.java)
            );}
        btn5.setOnClickListener {
            startActivity(
                Intent(this,
                    AddMentor::class.java)
            );}
    }
}