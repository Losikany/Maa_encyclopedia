package common_phrases
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class Phrases_adapter(val phrases_list: ArrayList<common_words>) : RecyclerView.Adapter<Phrases_adapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.phases_listview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(phrases_list[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return phrases_list.size
    }

    //the class is hodling the list view
    class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user:common_words) {
            val textViewEng = itemView.findViewById(R.id.word_tv) as TextView
            val textViewMaa  = itemView.findViewById(R.id.phrase_maa_tv) as TextView

            textViewEng.text = user.phrase_eng
            textViewMaa.text = user.phrase_maa

        }
    }
}