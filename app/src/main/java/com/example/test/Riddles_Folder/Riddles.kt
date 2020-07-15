package com.example.test.Riddles_Folder


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
class Riddles : Fragment() {
val idioms= ArrayList<idioms_data>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_riddles, container, false)

        val recy = view.findViewById<RecyclerView>(R.id.idioms_recycler_View)
        recy.layoutManager=LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)


        idioms.add(idioms_data("Anaa iten nabaa o nabaa niminepu kapironto etagore?", "Olojong'ani"))
        idioms.add(idioms_data("Olkiteng' lai otii erishata oolmang'ati?", "Olng'ejep"))
        idioms.add(idioms_data("Or nememanyi, ore pee emanyi neishiri?", "Enkong'u"))
        idioms.add(idioms_data("Tamanai teidia alo oldoinyio matamanu tena nimikitumo aikata", "Nkiyiaa"))
        idioms.add(idioms_data("Anaa keidurraki neini nanyokie?", "Enkima"))
        idioms.add(idioms_data("Anaa ipi nabaa o nabaa nimitonie enetonie entito nayok?", "Emoti"))

        idioms.add(idioms_data("Ting'iria maaishaki?", "Olalem opiki enchashur"))
        idioms.add(idioms_data("Mugie ai naten ilasho?", "Enkawuo o mbaa"))
        idioms.add(idioms_data("Anaa ipi nabaa o nabaa nimintieu atakedo enkashe e kikoris enkoriong?", "Eremet"))
        idioms.add(idioms_data("Edung' ng'utunyi olosinko erumisho enebanji?", "Enkeju enkerai"))
        idioms.add(idioms_data("Kidung' ang'ata bkira aare nimiking'amaro?", "Iyie oloip lino"))
        idioms.add(idioms_data("Anaa aidorrop enkanashe ino nemeeta olng’anayioi oing’ataa?", "Entaritiki"))



        recy.adapter=Riddles_CustomeAdapter(idioms)

        return view
    }

    }


