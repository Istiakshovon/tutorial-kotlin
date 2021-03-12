package com.tutorial_kotlin.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tutorial_kotlin.R

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val number = findViewById<EditText>(R.id.number)
        val number2 = findViewById<EditText>(R.id.number2)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener{
            val text = number.text.toString().toInt()
            val text2 = number2.text.toString().toInt()
            textView.text = (text+text2).toString()
        }
    }
}