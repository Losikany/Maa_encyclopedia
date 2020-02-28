package Numbers


import Names.Names_CustomAdapter
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
class Numbers : Fragment() {

    val list_numbers= ArrayList<Num>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_numbers, container, false)
        val recy= view.findViewById<RecyclerView>(R.id.numbers_recycler_View)
        recy.layoutManager= LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)

        list_numbers.add(Num("1", "Nabo", "One"))
        list_numbers.add(Num("2", "Are'", "Two"))
        list_numbers.add(Num("3", "Uni'", "Three"))
        list_numbers.add(Num("4", "On'gwan", "Four"))
        list_numbers.add(Num("5", "Imiet", "Five"))
        list_numbers.add(Num("6", "Ile", "Six"))
        list_numbers.add(Num("7", "Naapishana", "Seven"))
        list_numbers.add(Num("8", "Isiet", "Eight"))
        list_numbers.add(Num("9", "Naudo", "Nine"))
        list_numbers.add(Num("10", "Tomon", "Ten"))
        list_numbers.add(Num("11", "Tomon oobo", "Eleven"))
        list_numbers.add(Num("19", "Tomon naudo", "Nineteen"))
        list_numbers.add(Num("20", "Tikitam", "Twenty"))
        list_numbers.add(Num("21", "Tikitam oobo", "Twenty One"))
        list_numbers.add(Num("29", "Tikitam Naudo", "Twenty Nine"))


        recy.adapter= numbers_adapter(list_numbers)

        return view

    }


}
