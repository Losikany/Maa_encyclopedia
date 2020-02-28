package Colors_package

import com.example.test.R


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class Colors_adapter(val userList: ArrayList<colors_list>) : RecyclerView.Adapter<Colors_adapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.colors_listview, parent, false)
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

        fun bindItems(user: colors_list) {
            val textViewMaa = itemView.findViewById(R.id.maa_textview) as TextView
            val textViewEng  = itemView.findViewById(R.id.english_textview) as TextView
            textViewMaa.text = user.maa
            textViewEng.text = user.english

        }
    }
}