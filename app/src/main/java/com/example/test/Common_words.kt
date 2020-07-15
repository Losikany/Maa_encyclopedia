package com.example.test


import Food_stuff.Food
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.Colors_package.Colors
import com.google.android.material.bottomnavigation.BottomNavigationView
import common_phrases.Phrases

/**
 * A simple [Fragment] subclass.
 */
class Common_words : Fragment() {
    private val navListener=BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var selectedFrag: Fragment? = null

        when (item.itemId) {
            R.id.nav_colors -> selectedFrag = Colors()
            R.id.nav_family -> selectedFrag = Family()
            R.id.nav_food -> selectedFrag = Food()
            R.id.nav_phrases -> selectedFrag = Phrases()


        }
        selectedFrag?.let {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,
                it)
        }?.commit()
        true


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_common_words, container, false)

val botomNAv=view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        botomNAv.setOnNavigationItemSelectedListener (navListener)
if(savedInstanceState==null){
    fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,Colors())?.commit()

}
        return view
    }



    }





