package com.example.test


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



/**
 * A simple [Fragment] subclass.
 */
class Proverbs : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
       ): View? {
            //Inflate the layout for this fragment
       val view:View =inflater.inflate(R.layout.fragment_proverbs, container, false)
            val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
            Log.d("debugMode", "The application stopped after this")
            recyclerView.layoutManager = LinearLayoutManager(activity)

            val users =ArrayList<User>()

            //adding some dummy data to the list
            //print(message = users)
            users.add(User("Belal Khan", "Ranchi Jharkhand",  "hello"))
            users.add(User("Ramiz Khan", "Ranchi Jharkhand",  "hello1"))
            users.add(User("Faiz Khan", "Ranchi Jharkhand", "hello2"))
            users.add(User("Yashar Khan", "Ranchi Jharkhand", "hello3"))
            println(message = users)
         val adapter = Proverb_CustomeAdpter(users)
//
//            //now adding the adapter to recyclerview
          recyclerView.adapter = adapter

      return view
   }}

