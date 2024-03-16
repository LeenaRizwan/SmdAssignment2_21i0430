package com.example.myfirstapp

import android.app.Application
import com.google.firebase.database.FirebaseDatabase

class SaveThings :Application (){
    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}