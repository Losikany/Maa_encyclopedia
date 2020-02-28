package Names


import Names.name

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.google.android.material.bottomnavigation.BottomNavigationView
//import kotlinx.android.synthetic.main.fragment_title.*
import java.util.ArrayList


/**
 * A simple [Fragment] subclass.
 */
class Names_meaning : Fragment() {

    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? =null

            when (item.itemId) {
                R.id.nav_boys -> selectedFragment = Boys()
                R.id.nav_girls -> selectedFragment = Girls()

            }

           // val fm=activity!!.fragmentManager
        selectedFragment?.let {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,
                it
            )
        }?.commit()

            true
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_names_meaning, container, false)


            val bottomNav = view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNav.setOnNavigationItemSelectedListener(navListener)

            //I added this if statement to keep the selected fragment when rotating the device
            if (savedInstanceState == null) {
                fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,
                   Boys())?.commit()
            }
        return  view
        }
    }