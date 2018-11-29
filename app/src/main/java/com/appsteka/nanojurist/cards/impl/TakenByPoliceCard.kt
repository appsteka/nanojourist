package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class TakenByPoliceCard : CardAbs() {

    init {
        internalParagraphs.add("Если вы совершили административное правонарушение (например, курили или переходили дорогу в неположенном месте), то вас могут доставить в отделение полиции для составления протокола. По вашей просьбе о месте вашего нахождения в кратчайший срок уведомляются родственники, администрация по месту работы (учёбы), а также защитник. Срок задержания не должен превышать три часа (или 48 часов, если вы попались пограничникам).")

        internalAdditionalBlocks.add("Ознакомьтесь с документами сотрудников полиции и запомните их фамилии. Если удостоверения вам не показывают, запомните номера значков на форме и надписи на служебном автомобиле.")
        internalAdditionalBlocks.add("Спокойно предъявите свои документы (вы не всегда обязаны это делать, но лучше показать, если вы не совершали правонарушений).")
        internalAdditionalBlocks.add("Уточните, в чём заключается причина вашего задержания. Далее подчиняйтесь требованиям полиции; если захотите их оспорить, делайте это потом, а то получится, что вы сопротивлялись.")
        internalAdditionalBlocks.add("Не подписывайте никаких документов без защитника. До получения любых объяснений вы имеете право на свидание с защитником наедине и конфиденциально. Никогда не подписывайте чистые листы.")
        internalAdditionalBlocks.add("Не поддавайтесь на уговоры и угрозы подписать какой‐либо документ в обмен на немедленное освобождение.")
        internalAdditionalBlocks.add("Как можно раньше сообщите родственникам о задержании.")
        internalAdditionalBlocks.add("Выясните, до какого момента вас планируют удерживать.")
        internalAdditionalBlocks.add("Внимательно читайте всё, что вам предъявляют на подпись, и настаивайте на выдаче вам копий каждого документа (в том числе и протокола).")
    }

    override fun getId(): Int {
        return 8
    }

    override fun getHeader(): String {
        return "Забрала полиция?"
    }

    override fun hasAdditionalBlocks(): Boolean {
        return true
    }

    override fun getAdditionalBlocksHeader(): String {
        return "Общая схема:"
    }

    override fun getDontForgetBlock(): String {
        return ""
    }

    override fun getMoreLink(): String {
        return "https://www.mosigra.ru/blog/card3/"
    }
}