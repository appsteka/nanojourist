package com.appsteka.nanojurist.cards

abstract class CardAbs : Card {

    protected val internalParagraphs: MutableList<String> = mutableListOf()
    protected val internalAdditionalBlocks: MutableList<String> = mutableListOf()

    override fun getParagraphs(): List<String> {
        return internalParagraphs
    }

    override fun getAdditionalBlocks(): List<String> {
        return internalAdditionalBlocks
    }

}