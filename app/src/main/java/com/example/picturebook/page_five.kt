package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_five : AppCompatActivity() {
    lateinit var btnlast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        setContentView(R.layout.activity_main)
        castView()
        onClick()

    }

    fun castView() {
        btnlast = findViewById(R.id.btnlast)
    }

    fun onClick() {
        btnlast.setOnClickListener {
            val intent = Intent(baseContext, page_four::class.java)
            startActivity(intent)
        }
    }
}