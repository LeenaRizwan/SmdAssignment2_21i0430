package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import de.hdodenhof.circleimageview.CircleImageView

class EditProf : AppCompatActivity() {
    private lateinit var databaseRef: DatabaseReference
    private lateinit var database: FirebaseDatabase
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprof)
        var btn = findViewById<Button>(R.id.button6)
        var btn2 =findViewById<ImageButton>(R.id.button76)
        btn.setOnClickListener {
            //rewrite the db entry
            database = FirebaseDatabase.getInstance()
            databaseRef = database.getReference("users")
            val email = findViewById<EditText>(R.id.editTextText4)
            val country = findViewById<EditText>(R.id.editTextText8)
            val city = findViewById<EditText>(R.id.editTextText81)
            val cnum = findViewById<EditText>(R.id.editTextText7)
            val name = findViewById<EditText>(R.id.editTextText2)

            var id =email.text.toString().split("@")[0]
            //  databaseRef.child(id.toString()).setValue(id)
            databaseRef.child(id.toString()).child("Email").setValue(email.text.toString())
            databaseRef.child(id.toString()).child("Country").setValue(country.text.toString())
            databaseRef.child(id.toString()).child("City").setValue(city.text.toString())
            databaseRef.child(id.toString()).child("Cnum").setValue(cnum.text.toString())
            databaseRef.child(id.toString()).child("Name").setValue(name.text.toString())
            databaseRef.child("id").removeValue()

            startActivity(Intent(this, ProfileHome::class.java));
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, ProfileHome::class.java));
        }
    }
}