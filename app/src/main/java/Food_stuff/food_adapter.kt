package Food_stuff

import android.content.Context
import android.graphics.ColorSpace
import com.example.test.proverbs.User


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class food_adapter( var food_l: ArrayList<food_types>) : RecyclerView.Adapter<food_adapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.food_listview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.iv.setImageResource(food_l[position].image)
        holder.eng.text = food_l[position].eng_desc
        holder.maa.text = food_l[position].maa_desc

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return food_l.size
    }

    //the class is hodling the list view
    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
var iv:ImageView
        var eng:TextView
        var maa:TextView

        init {
            iv=itemView.findViewById(R.id.image_view)
            eng=itemView.findViewById(R.id.eng_tv)
            maa=itemView.findViewById(R.id.maa_tv)

        }
    }
}