package com.tutorial_kotlin.activities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tutorial_kotlin.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txt = findViewById<TextView>(R.id.txt)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val btnFinish = findViewById<Button>(R.id.btnFinish)

//        val bundle: Bundle? = intent.extras
        val bundle = intent.extras
        val msg = bundle?.getString("user_message")

        txt.text = msg
//        txt.setText(msg)

        btnFinish.setOnClickListener {
            finish()
        }

        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Toast.makeText(this@SecondActivity, s,Toast.LENGTH_SHORT).show()
            }
        })
    }
}