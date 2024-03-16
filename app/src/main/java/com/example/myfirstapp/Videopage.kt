package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import de.hdodenhof.circleimageview.CircleImageView

class Videopage : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private var ourRequestCode:Int = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videopage)
        var btn=findViewById<CircleImageView>(R.id.button68)
        videoView = findViewById(R.id.videoview)

        val mediaCollection= MediaController(this)
        mediaCollection.setAnchorView(videoView)
        videoView.setMediaController(mediaCollection)

        btn.setOnClickListener {
            startActivity(
                Intent(this,
                    AddMentor::class.java)
            );}
    }

    fun takeVideo(view: View){
        val intent =Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        if(intent.resolveActivity(packageManager)!=null){
            startActivityForResult(intent, ourRequestCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode:Int, data:Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == ourRequestCode && resultCode ==RESULT_OK){
            val videouri =data?.data
            videoView.setVideoURI(videouri)
            videoView.start()
        }
    }
}