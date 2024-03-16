package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import de.hdodenhof.circleimageview.CircleImageView
import java.util.concurrent.TimeUnit
import kotlin.random.Random

private lateinit var databaseRef: DatabaseReference
private lateinit var database: FirebaseDatabase
private lateinit var storage:FirebaseStorage
private var profilePictureUri: Uri?=null
var mAuth = FirebaseAuth.getInstance()


class SignUp4 : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth
    lateinit var storedVerificationId:String
    lateinit var resendToken:PhoneAuthProvider.ForceResendingToken
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup4)
        auth = FirebaseAuth.getInstance()
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.pass)
        val country = findViewById<EditText>(R.id.editTextText8)
        val city = findViewById<EditText>(R.id.editTextText81)
        val cnum = findViewById<EditText>(R.id.editTextText7)
        val name = findViewById<EditText>(R.id.editTextText2)
        var btn = findViewById<Button>(R.id.button6)
        var btn2signup = findViewById<CircleImageView>(R.id.button50)


        btn.setOnClickListener {
            mAuth.createUserWithEmailAndPassword(
                email.text.toString(),
                pass.text.toString()
            ).addOnSuccessListener {
                //Write user details into database
                childadd()
                addValue(
                    email.text.toString(),
                    pass.text.toString(),
                    country.text.toString(),
                    city.text.toString(),
                    cnum.text.toString(),
                    name.text.toString()
                )
                startActivity(Intent(this, NumericalCode5::class.java))
                finish()
            }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed To Signup", Toast.LENGTH_LONG).show()

                }
        }
        btn2signup.setOnClickListener {
            startActivity(Intent(this, Login2::class.java));
        }
//        if(mAuth.currentUser!=null){
//            startActivity(Intent(this,Home::class.java))
//            finish()
//    }



    }



    fun addValue(email: String, pass:String, country: String, city:String, cnum:String, name:String) {

        database = FirebaseDatabase.getInstance()
        databaseRef = database.getReference("users")

        var id =email.split("@")[0]
        //  databaseRef.child(id.toString()).setValue(id)
        databaseRef.child(id.toString()).child("Email").setValue(email.toString())
        databaseRef.child(id.toString()).child("Password").setValue(pass.toString())
        databaseRef.child(id.toString()).child("Country").setValue(country.toString())
        databaseRef.child(id.toString()).child("City").setValue(city.toString())
        databaseRef.child(id.toString()).child("Cnum").setValue(cnum.toString())
        databaseRef.child(id.toString()).child("Name").setValue(name.toString())
        databaseRef.child("id").removeValue()
    }

    fun childadd(){

        val database = FirebaseDatabase.getInstance()
        val databaseRef = database.getReference("contacts")

        databaseRef.addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d("Firebase_db", "onChildAdded:" + dataSnapshot.key!! )
                //-----

            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d("Firebase_db", "onChildChanged:"+dataSnapshot.key)
            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {
                Log.d("Firebase_db", "onChildRemoved:" + dataSnapshot.key!!)
            }

            override fun onChildMoved(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d("Firebase_db", "onChildMoved:" + dataSnapshot.key!!)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.w("Firebase_db", "postComments:onCancelled", databaseError.toException())
            }
        })
    }
}