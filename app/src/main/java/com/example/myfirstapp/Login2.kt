package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import de.hdodenhof.circleimageview.CircleImageView

class Login2 : AppCompatActivity() {
    private lateinit var ref: DatabaseReference
    private lateinit var snap:DataSnapshot
    private lateinit var userdata:User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login2)
        val email=findViewById<EditText>(R.id.email)
        val pass=findViewById<EditText>(R.id.pass)
        var mAuth= FirebaseAuth.getInstance()
        var btn = findViewById<CircleImageView>(R.id.button1)
        var btn2 =findViewById<CircleImageView>(R.id.button2)
        var btn3=findViewById<CircleImageView>(R.id.button0)

        btn.setOnClickListener {
            startActivity(Intent(this, ForgotPassword3::class.java));
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, SignUp4::class.java));
        }
        btn3.setOnClickListener {
            mAuth.signInWithEmailAndPassword(
                email.text.toString(),
                pass.text.toString()
            ).addOnSuccessListener {
                startActivity(Intent(this,Home::class.java))
                finish()
            }
                .addOnFailureListener {

                    Log.e("Sigin_Error",it.message.toString())
                    Toast.makeText(this,"Failed To SignIn", Toast.LENGTH_LONG).show()
                }
        }
//        if(mAuth.currentUser!=null){
//            startActivity(Intent(this,LogoPage1::class.java))
//            finish()
//        }
    }
}