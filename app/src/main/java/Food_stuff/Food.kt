package Food_stuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R

/**
 * A simple [Fragment] subclass.
 */
class Food : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_food, container, false)

        val foodrecyclerview=view.findViewById(R.id.food_rv) as RecyclerView
        foodrecyclerview.layoutManager=LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)



        var food_items=ArrayList<food_types>()

        food_items.add(food_types(R.drawable.blood,"Blood","Orsage"))
        food_items.add(food_types(R.drawable.maize, "Maize","Irpaek"))
        food_items.add(food_types(R.drawable.water,"Water","Enkare"))
        food_items.add(food_types(R.drawable.ugali,"Ugali","Orgali"))
        food_items.add(food_types(R.drawable.milk,"Milk","Kule"))
        food_items.add(food_types(R.drawable.meat,"Meat","Nkiri"))

        foodrecyclerview.adapter=food_adapter(food_items)


        return view
    }

}
