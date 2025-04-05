package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Day21Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day21_note) // Make sure you have this XML file

        // Find the TextView inside onCreate method
        val textViewNavigate = findViewById<TextView>(R.id.textView6)

        // Set OnClickListener
        textViewNavigate.setOnClickListener {
            val intent = Intent(this, Calendar_view::class.java)
            startActivity(intent)
        }
    }
}
