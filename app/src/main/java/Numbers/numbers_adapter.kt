package Numbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.User

class numbers_adapter(val numbers_list:ArrayList<Num>) :RecyclerView.Adapter<numbers_adapter.ViewHolder>(){

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.numbers_listview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(numbers_list[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return numbers_list.size
    }

    //the class is hodling the list view
    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: Num) {
            val textViewNumber = itemView.findViewById(R.id.number_textview) as TextView
            val textViewMaa  = itemView.findViewById(R.id.trans_text) as TextView
            val textViewEnglish  = itemView.findViewById(R.id.mean_text) as TextView
            textViewNumber.text = user.numb
            textViewMaa.text = user.maa
            textViewEnglish.text = user.eng
        }
    }

}