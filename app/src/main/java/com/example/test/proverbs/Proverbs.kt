package com.example.test.proverbs


import android.os.Bundle
import android.util.Log
import android.view.*
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.SearchView
import com.example.test.R


/**
 * A simple [Fragment] subclass.
 */
class Proverbs : Fragment() {
    val users =ArrayList<User>()
    val searchList= ArrayList<User>()
    lateinit var recyclerView:RecyclerView
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
       ): View? {
            //Inflate the layout for this fragment
       val view:View =inflater.inflate(R.layout.fragment_proverbs, container, false)
            setHasOptionsMenu(true)
            recyclerView = view.findViewById<RecyclerView>(R.id.colors_rv)


            recyclerView.layoutManager = LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)

            val anim= AnimationUtils.loadLayoutAnimation(activity,
                R.anim.left
            )
            recyclerView.layoutAnimation=anim

            users.add(
                User(
                    "Menang' silig kewan",
                    "Facing backwards does not perform itself",
                    "A simple act like turning backwards has to be performed. The proverb emphasises the importance of initiative and that of corporate action. Everyone has a part to play however small it might be, and therefore people do not ignore a small act, for it is just as essential as a big one."
                )
            )
            users.add(
                User(
                    "Edoorie enker modooni nkuta",
                    "A blind sheep might chance across rain water",
                    "this warns that good fortune is not restricted only to the affluent members of the society, but to all, irrespective of their status."
                )
            )
            users.add(
                User(
                    "Memurata olayioni oota menye",
                    "He who has a father is still not circumcised",
                    "a man will always be subordinate to his father, and will still receive orders from him."
                )
            )
            users.add(
                User(
                    "Memut elukunya nabo eng'eno (or Meishaa elukunya nabo eng'eno",
                    "One head does not consume all knowledge (or, One head cannot contain all knowledge)",
                    "there are limits to one person's knowledg"
                )
            )
            users.add(
                User(
                    "Esuj erashe ng'ejuk emusana",
                    "A new idea (custom) follows an old one",
                    "if an idea is good it will be copied and followed."
                )
            )
            users.add(
                User(
                    "Meeta enkiteng' olopeny",
                    "The cow has no owner",
                    "cattle are exchanged so often that the idea of individual ownership ceases to make much sense."
                )
            )
            users.add(
                User(
                    "Olapa oibor inkera",
                    "The children are the bright moon",
                    "they bring pleasure into the home"
                )
            )
            users.add(
                User(
                    "Meyek olenkaina ilala lenyena",
                    "The elephant does not get tired of its tusks",
                    "one carries his burden without flinching."
                )
            )
            users.add(
                User(
                    "Meitang'e oltung'ani olkikuei leme olenye",
                    "A person does not itch from a thorn that is not ",
                    "it is the wearer who knows where the shoe pinches - you cannot (or should not) feel someone else's troubles"
                )
            )
            users.add(
                User(
                    "Medol ilala osina",
                    "Teeth do not see poverty",
                    " people still smile despite problems. Often said in difficult situations when people still manage to entertain each other and have fun."
                )
            )
            users.add(
                User(
                    "Meituku olkine ng'iro",
                    "It cannot be cleansed with a brown he-goat",
                    "brown he-goats are customarily slaughtered during cleansing rituals, since the colour brown is associated with purity. If a person commits an 'unpardonable sin', normally one which has never been committed before, this proverb is quoted to indicate the magnitude of the deed."
                )
            )
            users.add(
                User(
                    "Meji olayioni kaji itopokie",
                    "A boy (man) is not asked where (how) he recovered",
                    "once a person has acquired property, he is not asked how he obtained it. The means is not important; it is the end that matters."
                )
            )
            users.add(
                User(
                    "Menyaanyuk enchikati enkutuk o enolkurum",
                    "The fart of the mouth and that of the bottom are not the same",
                    "abusive talk smells more than a fart"
                )
            )
            users.add(
                User(
                    "Erruesh olenkaina enaimurruai",
                    "The elephant can trip over a creeping plant",
                    "despite his size and might, he is still vulnerable"
                )
            )
            users.add(
                User(
                    "Milo ilgum eranyi",
                    "Do not go gathering fruit when a dance is taking place",
                    " do not perform an irrelevant task at an inappropriate time."
                )
            )
            searchList.addAll(users)

// now adding the adapter to recyclerview
            recyclerView.adapter = com.example.test.proverbs.Proverb_CustomeAdpter(searchList)



            return view

   }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater.inflate(R.menu.search, menu)

        val searchItem= menu.findItem(R.id.sv_search)
        if(searchItem !=null){

            val searchView= searchItem.actionView as SearchView

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

                override fun onQueryTextSubmit(query: String?): Boolean {

                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if(newText !!.isNotEmpty()){
                        searchList.clear()

                        val search=newText.toLowerCase()

                        users.forEach {
                            if (it.toString().toLowerCase().contains(search)){
                                searchList.add(it)

                            }
                        }
                        recyclerView.adapter?.notifyDataSetChanged()
                        }else{
                        searchList.clear()
                        searchList.addAll(users)
                        recyclerView.adapter?.notifyDataSetChanged()
                       // Toast.makeText(activity,"Not found",Toast.LENGTH_LONG).show()

                    }

                    return true


                    }

                })


            }
       return super.onCreateOptionsMenu(menu, inflater)
        }



    }




