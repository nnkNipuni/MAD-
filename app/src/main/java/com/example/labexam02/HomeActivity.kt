package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home) // Ensure you have this XML file

        val btnCalendar = findViewById<Button>(R.id.log)
        btnCalendar.setOnClickListener {
            val intent = Intent(this, Calendar::class.java)
            startActivity(intent)
        }

        val btnAddNote = findViewById<Button>(R.id.Addnote)
        btnAddNote.setOnClickListener {
            val intent = Intent(this, AddNote::class.java)
            startActivity(intent)
        }

        val textViewCalendar = findViewById<TextView>(R.id.calendar_id2)
        textViewCalendar.setOnClickListener {
            val intent = Intent(this, Calendar_view::class.java)
            startActivity(intent)
        }
    }
}
