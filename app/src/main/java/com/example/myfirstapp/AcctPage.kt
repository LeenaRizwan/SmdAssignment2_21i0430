package com.example.myfirstapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class AcctPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acctpage)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA=findViewById<ImageButton>(R.id.button96)
        var btnB=findViewById<CircleImageView>(R.id.button9)
        var btnC=findViewById<CircleImageView>(R.id.button66)
        var btnD=findViewById<Button>(R.id.button10)
        var name=findViewById<TextView>(R.id.textView43)
        btnD.setOnClickListener {
            startActivity(
                Intent(this,
                    CommChat::class.java)
            );}
        btnC.setOnClickListener {
            startActivity(
                Intent(this,
                    BookSession::class.java)
            );}
        btnB.setOnClickListener {
            val intent =Intent(this, Reveiw::class.java)
            intent.putExtra("Name", name.text.toString())
            startActivity(intent)
            }
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    SearchResults::class.java)
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