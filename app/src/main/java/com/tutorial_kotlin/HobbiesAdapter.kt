package com.tutorial_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(val context: Context,val hobbies : List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent, false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: HobbiesAdapter.MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentHobby: Hobby? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currentHobby?.title,Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(hobby : Hobby?, pos: Int){
            val title = itemView.findViewById<TextView>(R.id.txvTitle)

            title.text = hobby?.title

            this.currentHobby = hobby
            this.currentPosition = pos
        }
    }
}