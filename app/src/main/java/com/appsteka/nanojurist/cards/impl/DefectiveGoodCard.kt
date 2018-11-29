package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class DefectiveGoodCard : CardAbs() {

    init {
        internalParagraphs.add("Если приобретённый вами товар оказался бракованным, вы можете потребовать замены на аналогичный или на любой другой (с пересчётом цены), уменьшения покупной цены (если брак вас устраивает или вы будете ремонтировать покупку самостоятельно), ремонта либо возмещения расходов на ремонт. Также можно отказаться от исполнения договора купли‐ продажи и потребовать возврата уплаченных за покупку денежных средств.")
        internalParagraphs.add("У вас два года на то, чтобы найти брак. Если вы сохранили чек — хорошо, если нет — попробуйте доказать покупку иначе (для этого можно использовать показания свидетелей). Исключение составляют товары, указанные в Постановлении No 924 от 10.11.2011 г. (компьютеры, фотоаппараты и другая сложная техника): на выявление брака в продукции, относящейся к указанным в Постановлении категориям, даётся всего 15 дней.")
        internalParagraphs.add("Бракованный товар, который весит более 5 кг, не нужно самостоятельно никуда везти: за вас это должен сделать продавец либо изготовитель.")

        internalAdditionalBlocks.add("Вам должны предоставить акт приёма‐передачи товара, в котором проставлена дата, содержится информация о получателе и характеристики товара.")
        internalAdditionalBlocks.add("В соответствии со статьями 20, 21, 22 Закона РФ «О защите прав потребителей» в случае спора назначается проведение специальной экспертизы, на которой вы имеете полное право присутствовать. В случае если экспертиза проводится не сразу, товар должен быть должным образом упакован и опломбирован. Если с результатами проведённой экспертизы покупатель не согласен, он может оспорить заключение эксперта в судебном порядке.")
        internalAdditionalBlocks.add("На ремонт отводится не более 45 дней. При получении отремонтированного товара возьмите акт или справку о проведённом ремонте. Также вы можете отремонтировать товар собственными силами и получить от продавца либо изготовителя компенсацию затрат.")
        internalAdditionalBlocks.add("На замену отводится семь дней, причём на третий день вам должны предоставить товар на замену с теми же потребительскими свойствами (доставка осуществляется за счёт продавца) и выдать на него товарную накладную.")
        internalAdditionalBlocks.add("Опаздывают? Статья 23 Закона РФ «О защите прав потребителей» говорит о пене в размере 1% за каждый день просрочки от нормативных сроков.")
    }

    override fun getId(): Int {
        return 1
    }

    override fun getHeader(): String {
        return "Бракованный товар"
    }

    override fun hasAdditionalBlocks(): Boolean {
        return true
    }

    override fun getAdditionalBlocksHeader(): String {
        return "Важно:"
    }

    override fun getDontForgetBlock(): String {
        return "Не забывайте: все договорённости должны быть подтверждены в письменной форме."
    }

    override fun getMoreLink(): String {
        return "https://www.mosigra.ru/blog/card1/"
    }

}