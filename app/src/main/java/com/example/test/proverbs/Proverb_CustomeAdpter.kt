package com.example.test.proverbs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class Proverb_CustomeAdpter(val userList: ArrayList<User>) : RecyclerView.Adapter<Proverb_CustomeAdpter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.proverb_listview, parent, false)
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

        fun bindItems(user: User) {
            val textViewProverb = itemView.findViewById(R.id.proverb_textview) as TextView
            val textViewTranslation  = itemView.findViewById(R.id.trans_text) as TextView
            val textViewMeaning  = itemView.findViewById(R.id.mean_text) as TextView
            textViewProverb.text = user.proverb
            textViewTranslation.text = user.translation
            textViewMeaning.text = user.meaning
        }
    }
}