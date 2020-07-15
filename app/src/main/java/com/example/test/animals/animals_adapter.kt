package com.example.test.animals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class animals_adapter (var animals_types: ArrayList<animals_list>) : RecyclerView.Adapter<animals_adapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.animals_listview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imagevw.setImageResource(animals_types[position].image2)
        holder.textViewEng.text = animals_types[position].image_eng
        holder.textViewMaa.text = animals_types[position].image_maa

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return animals_types.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagevw: ImageView
        var textViewEng: TextView
        var textViewMaa: TextView

        init {
            imagevw = itemView.findViewById(R.id.image_vw)
            textViewEng = itemView.findViewById(R.id.animal_eng_tv)
            textViewMaa = itemView.findViewById(R.id.animal_maa_tv)
        }

    }
}