package com.example.studyhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStarted = findViewById<Button>(R.id.getStarted)
        getStarted.setOnClickListener {
            intent = Intent(applicationContext,CourseSection::class.java)
            Toast.makeText(applicationContext, "changing to courses section", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}