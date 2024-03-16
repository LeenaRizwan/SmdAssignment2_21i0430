package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth
import de.hdodenhof.circleimageview.CircleImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var mAuth=FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        //var btnA= findViewById<ImageButton>(R.id.button89)
//        btnA.setOnClickListener {
//            startActivity(
//                Intent(this,
//                    Notificationpage::class.java)
//            );}
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