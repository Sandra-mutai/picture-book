package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_three : AppCompatActivity() {
    lateinit var btnba: Button
    lateinit var btnne: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        castView()
        onClick()
        Click()
    }

    fun castView() {
        btnba = findViewById(R.id.btnba)
        btnne = findViewById(R.id.btnne)
    }

    fun onClick() {
        btnne.setOnClickListener {
            val intent = Intent(baseContext, page_three::class.java)
            startActivity(intent)
        }

    }

    fun Click() {
        btnba.setOnClickListener {
            val intent = Intent(baseContext, page_two::class.java)
            startActivity(intent)
        }
    }
}