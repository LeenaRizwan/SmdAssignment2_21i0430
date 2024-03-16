package com.example.myfirstapp

import android.content.Intent
import android.content.pm.PackageManager
import android.media.Image
import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import de.hdodenhof.circleimageview.CircleImageView

class ChatJohn : AppCompatActivity() {
    private lateinit var phonenumber:String
    private var our_request_code :Int =123
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatjohn)
        var btn = findViewById<CircleImageView>(R.id.button2)
        var btn2= findViewById<CircleImageView>(R.id.button3)
        var btn3= findViewById<CircleImageView>(R.id.button4)
        var btn4= findViewById<CircleImageView>(R.id.button5)
        var btn5= findViewById<CircleImageView>(R.id.button60)
        var btnA=findViewById<ImageButton>(R.id.button77)
        var btnB=findViewById<ImageButton>(R.id.button87)
        var btnC=findViewById<ImageButton>(R.id.button12)
        var btnD=findViewById<CircleImageView>(R.id.cam)
        var btnE=findViewById<CircleImageView>(R.id.send)
        var et=findViewById<EditText>(R.id.et)
        var tv=findViewById<TextView>(R.id.textv)

        var copy=" "

        val database = Firebase.database
        val myRef = database.getReference("message")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val value = dataSnapshot.getValue(String::class.java)
                copy=value.toString()
                tv.setText(copy)
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })



        btnE.setOnClickListener{
                copy=copy+ "\n\n"+et.text.toString()
                myRef.setValue(copy)
                et.text.clear()
        }

        btnC.setOnClickListener {

            var videocall= Intent("com.android.phone.videocall");
            videocall.putExtra("videocall", true);
            videocall.setData(Uri.parse("tel:+923048046758"));
            startActivity(videocall);

        }
        checkPermissions()

        btnB.setOnClickListener {
            phonenumber="+923048046758".toString()
            if(phonenumber.isNotEmpty()){
                val callIntent = Intent(Intent.ACTION_CALL)
                callIntent.data= Uri.parse("tel:$phonenumber")
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent)
                }
            }
        }
        btnA.setOnClickListener {
            startActivity(
                Intent(this,
                    ChatHome::class.java)
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

    fun takePhoto(view: View){
        //do it via intent
        val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        //see if can be done or nah
        if(intent.resolveActivity(packageManager)!=null){
            startActivityForResult(intent, our_request_code)
        }
    }

    override fun onActivityResult(requestCode:Int, resultCode:Int, data:Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == our_request_code && resultCode == RESULT_OK){
            val imageview : ImageView =findViewById(R.id.camerapic)
            //its morbin time
            val bitmap =data?.extras?.get("data") as Bitmap
            imageview.setImageBitmap(bitmap)
        }
    }

    private fun checkPermissions() {
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 101)
        }
    }
}


