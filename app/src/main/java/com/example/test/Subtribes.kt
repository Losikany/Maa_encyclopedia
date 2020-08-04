package com.example.test


import Food_stuff.Food
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.test.Colors_package.Colors
import com.google.android.material.bottomnavigation.BottomNavigationView
import common_phrases.Phrases
import kotlinx.android.synthetic.main.fragment_subtribes.*
import kotlinx.android.synthetic.main.fragment_subtribes.view.*

/**
 * A simple [Fragment] subclass.
 */
class Subtribes : Fragment() {


    lateinit var v: View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.run {

            v.cardview_purko.setOnClickListener {
                clickListener
            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_subtribes, container, false)

        return v
    }

    private val clickListener: View.OnClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.cardview_purko -> next2()
        }

    }

    private fun next2() {
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frag_container, Cardview_Test())
        transaction?.commit()


    }


}



