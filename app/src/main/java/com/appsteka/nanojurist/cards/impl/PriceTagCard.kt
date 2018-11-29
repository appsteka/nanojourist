package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class PriceTagCard : CardAbs() {

    init {
        internalParagraphs.add("Если кассир говорит вам, что реальная стоимость товара на самом деле выше, чем на ценнике, — вы имеете полное право купить его по той цене, которая указана на ценнике.")
        internalParagraphs.add("При продаже товаров в розницу ценник на товар считается предложением продавца о заключении договора купли‐продажи именно по той цене, которая там указана, и, соответственно, продать товар вам должны именно по этой цене (статьи 433, 437, 438, 426, 492, 494 ГК РФ).")

        internalAdditionalBlocks.add("Убедитесь, что на нём есть название товара, цена за единицу, и вид товара. Эти условия обязательны к оформлению ценника.")
        internalAdditionalBlocks.add("На всякий случай сфотографируйте товар и относящийся к нему ценник, а также товар на полке в магазине (чтобы было видно, что он продаётся именно в этом магазине), либо запишите видео.")
        internalAdditionalBlocks.add("Если кассир отказывается продавать вам по цене с ценника, зовите администратора. Если и он отказывается, оставляйте запись в книге жалоб и предложений, а затем обращайтесь в Роспотребнадзор.")
    }
    override fun getId(): Int {
        return 4
    }

    override fun getHeader(): String {
        return "Покупаем по цене с ценника"
    }

    override fun hasAdditionalBlocks(): Boolean {
        return true
    }

    override fun getAdditionalBlocksHeader(): String {
        return ""
    }

    override fun getDontForgetBlock(): String {
        return ""
    }

    override fun getMoreLink(): String {
        return "https://www.mosigra.ru/blog/card9/"
    }

}