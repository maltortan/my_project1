package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
        val btnChangeText=findViewById(R.id.send1) as Button;
        val tvHello=findViewById(R.id.send1) as TextView;
        btnChangeText.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            tvHello.text="Sent"
        }

//
//        intent = Intent(Intent.ACTION_VIEW)
//        startActivity(intent)
    }
}
