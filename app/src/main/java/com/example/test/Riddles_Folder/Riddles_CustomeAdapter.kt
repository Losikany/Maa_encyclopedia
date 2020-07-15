package com.example.test.Riddles_Folder

import com.example.test.R


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class Riddles_CustomeAdapter(val userList: ArrayList<idioms_data>) : RecyclerView.Adapter<Riddles_CustomeAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.riddles_listview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: idioms_data) {
            val textViewIdiom = itemView.findViewById(R.id.idiom_textview) as TextView
            val textViewAnswere  = itemView.findViewById(R.id.ans_text) as TextView
            textViewIdiom.text = user.idiom
            textViewAnswere.text = user.response

        }
    }
}