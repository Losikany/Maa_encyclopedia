package com.example.test.animals


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
class Animals : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_animals, container, false)

        val animalRecyclerView=view.findViewById(R.id.animals_rv)as RecyclerView
        animalRecyclerView.layoutManager=LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)

        var animals=ArrayList<animals_list>()

animals.add(animals_list(R.drawable.goat,"She Goat","Enkine"))
        animals.add(animals_list(R.drawable.hegoat,"He-Goat","Oloro"))
        animals.add(animals_list(R.drawable.sheep1, "Sheep", "Enker"))
        animals.add(animals_list(R.drawable.ram2, "Ram","Ormeregesh"))
        animals.add(animals_list(R.drawable.cow1, "Cow", "Enkiteng"))
        animals.add(animals_list(R.drawable.bull,"Bull","Oloing'oni"))
        animals.add(animals_list(R.drawable.calf,"Calf","Olashe"))
        animals.add(animals_list(R.drawable.cock3,"Cock","Olchogoo"))
        animals.add(animals_list(R.drawable.hen,"Hen","Elukungu"))
        animals.add(animals_list(R.drawable.donkey,"Donkey","Osikiria"))
        animals.add(animals_list(R.drawable.cat,"Cat","Empuus"))
        animals.add(animals_list(R.drawable.dog1,"Dog","Oldia"))
        animals.add(animals_list(R.drawable.lion,"Lion","Orng'atuny"))
        animals.add(animals_list(R.drawable.elephant,"Elephant","Oltome"))
        animals.add(animals_list(R.drawable.cheetah,"Cheetah","Orkinya Lasho"))
        animals.add(animals_list(R.drawable.leopard, "Leopard","Olowuaru Keri"))
        animals.add(animals_list(R.drawable.hp,"Hippo","Orkinos"))
        animals.add(animals_list(R.drawable.rhino,"Rhino","Emuny"))
        animals.add(animals_list(R.drawable.wildbeast,"wildbeast","Oinkat"))
        animals.add(animals_list(R.drawable.buffalo,"Buffalo","Olaro"))
        animals.add(animals_list(R.drawable.zebra,"Zebra","Oloitiko"))


        animalRecyclerView.adapter=animals_adapter(animals)

        return view
    }


}
