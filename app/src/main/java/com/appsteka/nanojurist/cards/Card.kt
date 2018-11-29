package com.appsteka.nanojurist.cards

interface Card {

    fun getId(): Int

    fun getHeader(): String

    fun getParagraphs(): List<String>

    fun hasAdditionalBlocks(): Boolean

    fun getAdditionalBlocksHeader(): String

    fun getAdditionalBlocks(): List<String>

    fun getDontForgetBlock(): String

    fun getMoreLink(): String

}