package com.example.studyhub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CourseSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_section)
        val callbtn = findViewById<Button>(R.id.callBtn)
        val phoneNum = 9999999999

        callbtn.setOnClickListener {
            intent = Intent(Intent.ACTION_CALL).apply {
                data = Uri.parse("tel: $phoneNum")
            }
            startActivity(intent)
        }
    }
}