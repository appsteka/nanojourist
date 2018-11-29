package com.appsteka.nanojurist.cards

import com.appsteka.nanojurist.cards.impl.*

class CardsHolder private constructor() {

    private val cards: MutableList<Card> = mutableListOf()

    init {
        cards.add(DefectiveGoodCard())
        cards.add(BankCardOperationCard())
        cards.add(GoodWithoutDefectCard())
        cards.add(PriceTagCard())
        cards.add(NeighborsCard())
        cards.add(PhotoPlacesCard())
        cards.add(ProhibitShootCard())
        cards.add(TakenByPoliceCard())
        cards.add(CrimeVictimCard())
        cards.add(HandLuggageCard())
        cards.add(CollectorsCard())
        println("($this) initialisation complete")
    }

    private object Holder { val INSTANCE = CardsHolder() }

    companion object {
        val instance: CardsHolder by lazy { Holder.INSTANCE }
    }

    fun getCards(): List<Card> {
        return cards
    }

    fun getCard(id: Int): Card {
        val filtered: List<Card> = cards.filter {
            it.getId() == id
        }
        return filtered[0]
    }

}