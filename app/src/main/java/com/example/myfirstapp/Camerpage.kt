package com.example.myfirstapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import de.hdodenhof.circleimageview.CircleImageView

class Camerpage : AppCompatActivity() {
    private var our_request_code :Int =123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camerapage)
        var btn=findViewById<CircleImageView>(R.id.button68)

        btn.setOnClickListener {
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
            val imageview : ImageView =findViewById(R.id.imageView5)
            //its morbin time
            val bitmap =data?.extras?.get("data") as Bitmap
            imageview.setImageBitmap(bitmap)
        }
    }
}