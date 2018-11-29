package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class BankCardOperationCard : CardAbs() {

    init {
        internalAdditionalBlocks.add("Проверьте, при вас ли карта. Если теряли или отдавали кому‐то — сразу же звоните в банк и блокируйте. Зафиксируйте время звонка или сфотографируйте экран телефона, если блокировали через СМС или приложение.")
        internalAdditionalBlocks.add("Получите детализацию по операциям в банке. Напишите заявление в отделении банка. Запустится внутреннее расследование (процедура утверждена Банком России 24.12.2004 No 266‐П, срок проведения составляет до 30 дней).")
        internalAdditionalBlocks.add("После банка загляните в отделение полиции и напишите заявление.")
    }

    override fun getId(): Int {
        return 2
    }

    override fun getHeader(): String {
        return "«Левая» операция по банковской карте"
    }

    override fun hasAdditionalBlocks(): Boolean {
        return true
    }

    override fun getAdditionalBlocksHeader(): String {
        return ""
    }

    override fun getDontForgetBlock(): String {
        return "Не забывайте, что по закону 161‐ФЗ от 27.06.2011 «О национальной платёжной системе» (НПС) банк обязан уведомлять клиента о всех транзакциях, совершаемых с использованием банковской карты. В случае если банк не выполнил свою обязанность по информированию клиента о совершённой операции (то есть вы не получили уведомление о транзакции), он обязан возместить клиенту сумму операции, о которой клиент не был проинформирован и которая была совершена без согласия клиента."
    }

    override fun getMoreLink(): String {
        return "https://www.mosigra.ru/blog/card5/"
    }

}