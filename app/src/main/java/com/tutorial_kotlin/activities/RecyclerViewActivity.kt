package com.tutorial_kotlin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tutorial_kotlin.HobbiesAdapter
import com.tutorial_kotlin.R
import com.tutorial_kotlin.Supplier

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adapter = HobbiesAdapter(this, Supplier.hobbies)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }
}