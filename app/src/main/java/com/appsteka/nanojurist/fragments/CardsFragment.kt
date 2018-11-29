package com.appsteka.nanojurist.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import com.appsteka.nanojurist.R
import com.appsteka.nanojurist.adapters.CardsAdapter
import com.appsteka.nanojurist.cards.CardsHolder
import android.support.v7.widget.SearchView
import com.appsteka.nanojurist.adapters.RcItemDecoration


class CardsFragment : Fragment() {

    private var adapter: CardsAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.cards_fragment, container, false)

        setHasOptionsMenu(true)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        adapter = CardsAdapter(CardsHolder.instance.getCards(), activity)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(RcItemDecoration(resources.getDimension(R.dimen.card_list_margin).toInt()))

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.search_menu, menu)

        val myActionMenuItem = menu?.findItem(R.id.action_search)
        val searchView : SearchView = myActionMenuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(s: String): Boolean {
                adapter?.filter?.filter(s)
                return false
            }
        })
    }
}