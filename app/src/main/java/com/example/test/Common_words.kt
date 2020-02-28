package com.example.test


import Colors_package.Colors
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class Common_words : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_common_words, container, false)

        val btn_color = view.findViewById<Button>(R.id.btn_colors)
        btn_color.setOnClickListener {
            childFragmentManager.beginTransaction().replace(R.id.fragment_container, Colors())
                .commit()
        }


        return view
    }


}
