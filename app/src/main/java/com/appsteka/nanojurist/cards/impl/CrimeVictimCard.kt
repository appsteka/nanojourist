package com.appsteka.nanojurist.cards.impl

import com.appsteka.nanojurist.cards.CardAbs

class CrimeVictimCard : CardAbs() {

    init {
        internalAdditionalBlocks.add("Сразу же обращайтесь в полицию. Лучше всего — по месту совершения преступления, так будет быстрее, но заявление у вас обязаны принять в любом отделении.")
        internalAdditionalBlocks.add("Позвоните в 112, расскажите о ситуации, уточните адрес отделения: ваш звонок будет зафиксирован, что, возможно, пригодится 3вам позже, если у вас не примут заявление.")
        internalAdditionalBlocks.add("Объясните, что случилось, дежурному, заполните в свободной форме бланк заявления о преступлении. Не забудьте поставить дату, указать время, свой телефон и адрес. Все документы подписывайте в конце страницы, чтобы ничего нельзя было дописать.")
        internalAdditionalBlocks.add("Возьмите у дежурного талон‐уведомление с номером КУСП: это номер вашего заявления. Если вас отправляют к оперуполномоченному, не забудьте взять талон‐уведомление у него.")
        internalAdditionalBlocks.add("После принятия заявления последует проверка, которая займёт трое суток. Её могут продлить до десяти, а затем и до 30 суток. Звоните каждый раз в отделение и узнавайте, какое решение приняли по вашему заявлению: эту информацию должны вам предоставить по телефону. Решений бывает только два: возбуждение уголовного дела или отказ в возбуждении. Копия решений должны уйти вам по почте, но гораздо надёжнее дойти до отделения и потребовать выдать вам копию.")
        internalAdditionalBlocks.add("Если в возбуждении дела было отказано, вы имеете право ознакомиться со всеми материалами проверки. Если что‐то не так, идите в прокуратуру района и обжалуйте указанное решение сотрудников полиции. Письменно. Если через 30 суток не ответа, обращайтесь в прокуратуру уровнем выше.")
    }

    override fun getId(): Int {
        return 9
    }

    override fun getHeader(): String {
        return "Вы стали жертвой преступления"
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
        return ""
    }
}