package com.example.myageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun findMyAge(view :View){
        val resultText: TextView = findViewById(R.id.result_text)
        val yearOfBirth: EditText = findViewById(R.id.year_of_birth)
        val yOB: Int = yearOfBirth.text.toString().toInt()
    }

}