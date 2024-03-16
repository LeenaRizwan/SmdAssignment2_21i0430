package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import de.hdodenhof.circleimageview.CircleImageView

class VidC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vidc)
        var btnA=findViewById<ImageButton>(R.id.button87)
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    ChatJohn::class.java)
            );}
    }
}