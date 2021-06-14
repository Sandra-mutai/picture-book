package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_two : AppCompatActivity() {
    lateinit var btnBack: Button
    lateinit var btnNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
            setContentView(R.layout.activity_main)
            castView()
            onClick()
            Click()



        }

        fun castView() {
            btnBack = findViewById(R.id.btnBack)
            btnNext2 = findViewById(R.id.btnNext2)
        }

        fun onClick() {
            btnBack.setOnClickListener {
                val intent = Intent(baseContext, page_three::class.java)
                startActivity(intent)
            }
        }
        fun Click() {
            btnNext2.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
    }
