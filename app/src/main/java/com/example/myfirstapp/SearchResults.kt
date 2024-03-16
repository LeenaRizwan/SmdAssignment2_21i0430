package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import de.hdodenhof.circleimageview.CircleImageView

class SearchResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searchresults)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA=findViewById<CircleImageView>(R.id.button90)
        var btnB=findViewById<ImageButton>(R.id.button88)
        var btnC=findViewById<ImageButton>(R.id.button99)
        var btnD=findViewById<ImageButton>(R.id.button77)
        var btnE=findViewById<ImageButton>(R.id.button66)
        var btnF=findViewById<ImageButton>(R.id.button64)
        var btnG=findViewById<ImageButton>(R.id.button65)
        var btnH=findViewById<ImageButton>(R.id.button36)
        var btnI=findViewById<ImageButton>(R.id.button46)
        var btnJ=findViewById<ImageButton>(R.id.button91)
        var btnK=findViewById<ImageButton>(R.id.button92)
        btnK.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnJ.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnI.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnH.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnG.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnF.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnE.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnD.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnC.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnB.setOnClickListener {
            startActivity(
                Intent(this,
                    AcctPage::class.java)
            );}
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    SearchHome::class.java)
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