package com.example.test.Colors_package


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R

/**
 * A simple [Fragment] subclass.
 */
class Colors : Fragment() {
    val list_colors= ArrayList<colors_list>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_colors, container, false)
       // val recy= view.findViewById<RecyclerView>(R.id.colors_rv)
//        recy.layoutManager= LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)
//
//      list_colors.add(colors_list("Olodo/Olonyokie", "Red"))
//        list_colors.add(colors_list("Olorok", "Black"))
//        list_colors.add(colors_list("Oloibor", "White"))
//        list_colors.add(colors_list("Olonyori", "Green"))
//        list_colors.add(colors_list("Empus", "Blue"))
//        list_colors.add(colors_list("Olmujie", "Grey"))
//
//
//        recy.adapter=Colors_adapter(list_colors)
//
//        val animation =
//            AnimationUtils.loadLayoutAnimation(activity, R.anim.left)
       // recy.layoutAnimation = animation
return  view
    }

}
