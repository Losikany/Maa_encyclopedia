package Names

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


/**
 * A simple [Fragment] subclass.
 */
class Boys : Fragment() {

    val list_names= ArrayList<name>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_boys, container, false)
        val recy= view.findViewById<RecyclerView>(R.id.names_recyclerview)
        recy.layoutManager= LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)



        list_names.add(name("Lemayian", "The blesssed one"))
        list_names.add(name("Saruni", "The generous one"))
        list_names.add(name("Leboo", "Born outside the house"))
        list_names.add(name("Noonyuat", "Someone who is very hardworking"))
        list_names.add(name("Leshan", "One who is given birth when its raining"))
        list_names.add(name("Saitabau" ,"Able to finish on a task"))
        list_names.add(name("Saitoti", "One who feeds people with goodies"))
        list_names.add(name("Aramat", "One who likes to take care of others"))
        list_names.add(name("Saitosha", "One who is able to do a task in all fullness"))

       recy.adapter=Names_CustomAdapter(list_names)

        val animation =
            AnimationUtils.loadLayoutAnimation(activity, R.anim.left)
        recy.layoutAnimation = animation


        return view
    }


}
