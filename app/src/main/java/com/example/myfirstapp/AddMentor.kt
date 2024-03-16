package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import de.hdodenhof.circleimageview.CircleImageView


//Just add them into database along with currentuser email
//Dont think too hard abt image, you can get that done later
//Same db youll search through for mentors in search home
//And reveiws are also in their own db. MentorID should be parent, the child keys will be userID
//Done and dusted, nice.
class AddMentor : AppCompatActivity() {
    private lateinit var mAuth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addmentor)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA= findViewById<CircleImageView>(R.id.button33)
        var btnB=findViewById<ImageButton>(R.id.button70)
        var btnC=findViewById<ImageButton>(R.id.button71)
        var makementor=findViewById<ImageButton>(R.id.makementor)
        var name=findViewById<EditText>(R.id.editTextText2)
        var desc=findViewById<EditText>(R.id.editText22)
        var sess=findViewById<EditText>(R.id.editTextText222)
        makementor.setOnClickListener{
            mAuth= FirebaseAuth.getInstance()
            val Name=name.text.toString()
            var Email= mAuth.currentUser?.email.toString().split("@")[0]
            val Desc=desc.text.toString()
            val Sess=sess.text.toString()
            val database = Firebase.database
            val myRef = database.getReference("Mentors").child("$Email")
                    myRef.child("Name").setValue(Name)
                    myRef.child("Desc").setValue(Desc)
                    myRef.child("PerSession").setValue(Sess)
            Email= mAuth.currentUser?.email.toString()
                    myRef.child("Email").setValue(Email)
            name.text.clear()
            desc.text.clear()
            sess.text.clear()
        }

        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    Home::class.java)
            );}
        btnB.setOnClickListener {
            startActivity(
                Intent(this,
                    Videopage::class.java)
            );}
        btnC.setOnClickListener {
            startActivity(
                Intent(this,
                    Camerpage::class.java)
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