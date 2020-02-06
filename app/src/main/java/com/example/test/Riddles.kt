package com.example.test


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.idioms_listview.view.*

/**
 * A simple [Fragment] subclass.
 */
class Riddles : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_idioms, container, false)

        val listView = view.findViewById<ListView>(R.id.main_listView)
        listView.adapter = MyCustomAdapter()

        return view
    }

    private class MyCustomAdapter : BaseAdapter() {

        private val names = arrayListOf<String>("Anaa iten nabaa o nabaa niminepu kapironto etagore?", "Olkiteng' lai otii erishata oolmang'ati?", "Or nememanyi, ore pee emanyi neishiri?", "Tamanai teidia alo oldoinyio matamanu tena nimikitumo aikata",
            "Anaa keidurraki neini nanyokie?","Anaa ipi nabaa o nabaa nimitonie enetonie entito nayok?","Ting'iria maaishaki?","Mugie ai naten ilasho?","Anaa ipi nabaa o nabaa nimintieu atakedo enkashe e kikoris enkoriong?","Edung' ng'utunyi olosinko erumisho enebanji?"
        ,"Kidung' ang'ata bkira aare nimiking'amaro?","Anaa aidorrop enkanashe ino nemeeta olng’anayioi oing’ataa?")
        private val answer = arrayListOf<String>("Olojong'ani", "Olng'ejep", "Enkong'u", "Nkiyiaa", "Enkima", "Emoti",
            "Olalem opiki enchashur","Enkawuo o mbaa","Eremet","Enkeju enkerai","Iyie oloip lino","Entaritiki")



        override fun getCount(): Int {
            return names.size;answer.size
            //  return answer.size
        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(position: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val idioms: View
            if (convertView == null) {
                val layoutInflater = LayoutInflater.from(parent!!.context)
                idioms = layoutInflater.inflate(R.layout.idioms_listview, parent, false)


                val viewHolder = ViewHolder(
                    idioms.idiom_textview,
                    idioms.answer_textview,
                    idioms.responce_textview
                )
                idioms.tag = viewHolder


            } else {

                idioms = convertView
            }
            val viewholder = idioms.tag as ViewHolder
            viewholder.idiomTextView.text = names.get(position)
            viewholder.ansTextView.text = "Answer >"
            viewholder.responseTextView.text = answer.get(position)

            return idioms
        }

        private class ViewHolder(
            val idiomTextView: TextView,
            val ansTextView: TextView,
            val responseTextView: TextView
        ) {}
    }

}
