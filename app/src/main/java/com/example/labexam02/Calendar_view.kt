package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Calendar_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar_view) // Make sure you have this XML file

        val btnNavigate = findViewById<Button>(R.id.day21)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Day21Activity::class.java)
            startActivity(intent)
        }

        val textViewNavigate = findViewById<TextView>(R.id.textViewArrow)

        // Set OnClickListener
        textViewNavigate.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}