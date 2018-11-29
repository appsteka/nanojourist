package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class GoodWithoutDefectCard : CardAbs() {

    init {
        internalParagraphs.add("По статье 25 Закона РФ «О защите прав потребителей» вы можете смело вернуть товар без брака либо поменять его на аналогичный. На возврат отводится от семи (в интернет‐магазинах) до 14 дней, не считая дня покупки. Если, с вашей точки зрения, недостатки возникли по вине продавца, обратное должен доказывать именно продавец.")
        internalParagraphs.add("Нельзя поменять или вернуть книги, бытовую химию, бельё, мебель, ювелирные изделия, лекарства, растения, транспортные средства, строительные материалы, косметику, бытовую технику; товар, который уже побывал в употреблении, а также продукцию с сорванными ярлыками и пломбами; товар без чека (в этом случае будет необходимо доказывать факт покупки иным способом — скорее всего, через суд).")
        internalParagraphs.add("Если вы меняете товар на аналогичный или другой, то продавец должен выбить на него новый чек. Предполагается, что обмен товара и возврат денежных средств должны быть совершены сразу при вас; но, если вы с продавцом договорились иначе, — обязательно зафиксируйте договорённость в письменной форме.")

        internalAdditionalBlocks.add("Оставьте жалобу в книге жалоб и предложений.")
        internalAdditionalBlocks.add("Отправьте заказное письмо или вручите требование под расписку администратору. Не отдавайте оригинал чека.")
        internalAdditionalBlocks.add("Обратитесь в Роспотребнадзор.")
        internalAdditionalBlocks.add("Напомните администратору, что по статье 395 ГК РФ можно получать неустойку за большую просрочку.")
    }

    override fun getId(): Int {
        return 3
    }

    override fun getHeader(): String {
        return "Товар без брака не подходит"
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
        return "https://www.mosigra.ru/blog/card2/"
    }

}