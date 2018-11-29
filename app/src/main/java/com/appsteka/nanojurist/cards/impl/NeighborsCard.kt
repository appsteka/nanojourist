package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class NeighborsCard : CardAbs() {

    init {
        internalParagraphs.add("В статье 10 ФЗ No 52 «О санитарно‐ эпидемиологическом благополучии населения» к СанПиН 2.1.2.2645–10 «Требования к условиям проживания в жилых зданиях и помещениях» содержится следующая информация: шуметь в квартире можно с семи утра до 23 часов.")
        internalParagraphs.add("В Москве отдельный регулирующий закон «О соблюдении покоя граждан и тишины в городе Москве» был принят 12.07.2002 и устанавливает «тихий час» днём с 13:00 до 15:00.")

        internalAdditionalBlocks.add("Для начала имеет смысл попытаться пообщаться с «нерадивыми» соседями и объяснить им, что их шум нарушает требования закона и мешает вам жить.")
        internalAdditionalBlocks.add("Если попытки поговорить ни к чему не привели, звоните в полицию. Пока к вам не приехал сотрудник полиции, по возможности следует записать нарушение на видео, чтобы было о чём говорить с сотрудником.")
        internalAdditionalBlocks.add("Полиция обязана проводить проверку по каждому факту правонарушения, о котором ей сообщили. Приехав, сотрудник полиции должен получить объяснение у соседей. Далее, в зависимости от законодательства города, он либо сам составляет протокол об административном правонарушении, либо направляет собранную информацию в администрацию, которая составляет протокол и назначает штраф.")
        internalAdditionalBlocks.add("Если ваши соседи — бар или клуб, то справиться с шумом поможет Роспотребнадзор.")
    }

    override fun getId(): Int {
        return 5
    }

    override fun getHeader(): String {
        return "Соседи шумят?"
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
        return "https://www.mosigra.ru/blog/card8/"
    }

}