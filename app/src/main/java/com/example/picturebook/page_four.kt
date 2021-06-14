package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_four : AppCompatActivity() {
    lateinit var btnck: Button
    lateinit var btnxt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        castView()
        onClick()
        Click()
    }

    fun castView() {
        btnck = findViewById(R.id.btnBack)
        btnxt = findViewById(R.id.btnNext2)
    }

    fun onClick() {
        btnck.setOnClickListener {
            val intent = Intent(baseContext, page_five::class.java)
            startActivity(intent)
        }


    }
    fun Click(){
        btnxt.setOnClickListener {
            val intent = Intent(baseContext, page_three::class.java)
            startActivity(intent)
        }
    }
}