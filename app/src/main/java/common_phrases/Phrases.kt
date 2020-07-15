package common_phrases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R

/**
 * A simple [Fragment] subclass.
 */
class Phrases : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_phrases, container, false)

        val prasesRecyclerview=view.findViewById<RecyclerView>(R.id.phrases_rv)as RecyclerView

        prasesRecyclerview.layoutManager=LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)
val phrases= ArrayList<common_words>()

        phrases.add(common_words("What is your name?","Ekiji ng'ae enkarna?"))
        phrases.add(common_words("Where are you going?","Kaji igira alo?"))
        phrases.add(common_words("Where do you live", "Kaji nikimanya?"))
        phrases.add(common_words("Where is your House?", "Koree enkaji ino?"))
        phrases.add(common_words("Where are you going?","Kaji igira alo?"))
        phrases.add(common_words("Where is your Shopping centre?", "Kaji etii ildukai linyi?"))

        prasesRecyclerview.adapter=Phrases_adapter(phrases)
        return view
    }

}
