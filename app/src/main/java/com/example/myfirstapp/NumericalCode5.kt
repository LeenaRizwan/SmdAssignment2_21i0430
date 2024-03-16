package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.SparseArray
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import de.hdodenhof.circleimageview.CircleImageView


class NumericalCode5 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
//  val code=findViewById<EditText>(R.id.edittext1)
//    val written=StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.numericalcode5)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2 = findViewById<CircleImageView>(R.id.button3)
        btn.setOnClickListener {
            startActivity(Intent(this, SignUp4::class.java));
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, Home::class.java));
        }
        //KEYPAD BUTTONS
        var key1 = findViewById<CircleImageView>(R.id.imageView53)
        var key2 = findViewById<CircleImageView>(R.id.imageView14)
        var key3 = findViewById<CircleImageView>(R.id.imageView13)
        var key4 = findViewById<CircleImageView>(R.id.imageView55)
        var key5 = findViewById<CircleImageView>(R.id.imageView56)
        var key6 = findViewById<CircleImageView>(R.id.imageView12)
        var key7 = findViewById<CircleImageView>(R.id.imageView21)
        var key8 = findViewById<CircleImageView>(R.id.imageView20)
        var key9 = findViewById<CircleImageView>(R.id.imageView11)
        var key0 = findViewById<CircleImageView>(R.id.imageView100)
        var keybacc = findViewById<CircleImageView>(R.id.imageView10)

//        key1.setOnClickListener{
//            if(written.length<5){
//                written.append("1")
//                code.setText(written)
//
//            }
//        }
    }
}