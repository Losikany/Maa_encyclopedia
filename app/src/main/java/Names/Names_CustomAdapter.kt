package Names

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class Names_CustomAdapter(val name_list: ArrayList<name>) :
    RecyclerView.Adapter<Names_CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): Names_CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.names_listview, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(name_list[position])
//        var lastPosition = -1
//        if (position > lastPosition) {
//            val animation= AnimationUtils.loadAnimation(this, R.anim.right_fade)
//
//
//            lastPosition.startAnimation(animation)
//        }


    }

    override fun getItemCount(): Int {
        return name_list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(list: name) {

            val textViewNames = itemView.findViewById(R.id.names_textview) as TextView
            val textViewMeaning = itemView.findViewById(R.id.meaning_textview) as TextView
            textViewNames.text = list.names
            textViewMeaning.text = list.meaning


        }


    }

}