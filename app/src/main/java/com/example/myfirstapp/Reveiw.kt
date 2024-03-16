package com.example.myfirstapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import de.hdodenhof.circleimageview.CircleImageView

class Reveiw : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reveiw)
        val intent=getIntent()
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA=findViewById<ImageButton>(R.id.button96)
        var btnB=findViewById<ImageButton>(R.id.button99)
        var reveiw=findViewById<EditText>(R.id.reveiw)
        btnB.setOnClickListener {
            //USE THEIR NAME AS KEY INSTEAAAAD
            val mentorname=intent.getStringExtra("Name")
            //WRITE INTO DBBBBBBBB go Reviews->MentorID->ReveiwerID: Reveiw
            mAuth= FirebaseAuth.getInstance()
            val Reveiw=reveiw.text.toString()
            val MyID=mAuth.currentUser?.email.toString().split("@")[0]
            val database = Firebase.database
            val myRef = database.getReference("Reveiws").child("$mentorname")
            myRef.child(MyID).setValue(Reveiw)
            reveiw.text.clear()
            }
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