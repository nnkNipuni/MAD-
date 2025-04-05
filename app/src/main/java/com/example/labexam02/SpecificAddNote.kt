package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SpecificAddNote : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.noteadd_specific) // Ensure this XML file exists

        val noteTopicTextView = findViewById<TextView>(R.id.noteTopic3)
        noteTopicTextView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


        val btnTickMark = findViewById<TextView>(R.id.tickMark)
        btnTickMark.setOnClickListener {
            val intent = Intent(this, AddNote::class.java)
            startActivity(intent)
        }

    }
}
