package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(baseContext,page_two::class.java)
        startActivity(intent)


    }
    fun castView(){
         btn1=findViewById(R.id.btn1)
    }
    fun onClick(){
        btn1.setOnClickListener {
            val intent=Intent(baseContext,page_two::class.java)
            startActivity(intent)
        }
    }
}