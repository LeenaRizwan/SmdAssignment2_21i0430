package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.InternalHelpers.createDataSnapshot
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.childEvents
import com.google.firebase.database.getValue
import com.google.firebase.database.snapshot.IndexedNode
import com.google.firebase.database.snapshot.Node
import de.hdodenhof.circleimageview.CircleImageView

class ProfileHome : AppCompatActivity() {
private lateinit var btnD: Button
private lateinit var ProfImage:ImageView
private lateinit var CoverImage:ImageView
var Switch=0
companion object{
    val IMAGE_REQUEST_CODE=100
}
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilehome)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA= findViewById<CircleImageView>(R.id.button88)
        var btnB= findViewById<ImageButton>(R.id.button71)
        var btnC= findViewById<Button>(R.id.EditProf)
        var btnD= findViewById<ImageButton>(R.id.button55)//Cover change
        var btnE=findViewById<ImageButton>(R.id.button50)//Profile image change
        ProfImage = findViewById<ImageView>(R.id.profimage)
        CoverImage = findViewById(R.id.Cover)
        btnD.setOnClickListener {
            Switch=1
            pickImageGallery();
        }
        btnE.setOnClickListener {
            Switch=0
            pickImageGallery()
        }
        btnC.setOnClickListener {
            startActivity(
                Intent(this,
                    EditProf::class.java)
            );}
        btnB.setOnClickListener {
            startActivity(
                Intent(this,
                    Home::class.java)
            );}
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                     BookedSess::class.java)
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

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type="image/"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
            if(Switch==0){ProfImage.setImageURI(data?.data)}
            else{CoverImage.setImageURI(data?.data)}
        }
    }

}