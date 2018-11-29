package com.appsteka.nanojurist.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.LinearLayout
import android.widget.TextView
import com.appsteka.nanojurist.CardActivity
import com.appsteka.nanojurist.R
import com.appsteka.nanojurist.cards.Card

class CardsAdapter(private val cards: List<Card>, private val context: Context?) : RecyclerView.Adapter<CardsAdapter.ViewHolder>(), Filterable {

    private var filteredCards: MutableList<Card> = mutableListOf()

    init {
        filteredCards.addAll(cards)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cards_list_element, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return filteredCards.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardName?.text = filteredCards[position].getHeader()

        holder.root?.setOnClickListener {
            val cardIntent = Intent(context, CardActivity::class.java)
            cardIntent.putExtra(CardActivity.CARD_ID_KEY, filteredCards[position].getId())
            context?.startActivity(cardIntent)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var root: LinearLayout? = null
        var cardName: TextView? = null

        init {
            root = itemView.findViewById(R.id.root)
            cardName = itemView.findViewById(R.id.card_name_tv)
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): Filter.FilterResults {
                val charString = charSequence.toString().toLowerCase()
                filteredCards.clear()
                if (charSequence.isEmpty()) {
                    filteredCards.addAll(cards)
                } else {
                    filteredCards.addAll(cards.filter {
                        it.getHeader().toLowerCase().contains(charString)
                    })
                }
                val filterResults = FilterResults()
                filterResults.values = filteredCards
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: Filter.FilterResults) {
                filteredCards = filterResults.values as ArrayList<Card>
                notifyDataSetChanged()
            }
        }
    }
}