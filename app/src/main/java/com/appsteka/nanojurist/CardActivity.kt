package com.appsteka.nanojurist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.appsteka.nanojurist.cards.Card
import com.appsteka.nanojurist.cards.CardsHolder
import kotlinx.android.synthetic.main.card_activity.*

class CardActivity : AppCompatActivity() {

    companion object {
        const val CARD_ID_KEY: String = "CARD_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val card: Card = CardsHolder.instance.getCard(intent.getIntExtra(CARD_ID_KEY, 0))

        title = card.getHeader()

        for (paragraph in card.getParagraphs()) {
            val paragraphView: View = LayoutInflater.from(this).inflate(R.layout.card_paragraph, null)
            val paragraphTv: TextView = paragraphView.findViewById(R.id.paragraph_text);
            paragraphTv.text = paragraph;
            content.addView(paragraphView)
        }

        if (card.hasAdditionalBlocks()) {
            if (card.getAdditionalBlocksHeader() != "") {
                val additionalHeaderView: View = LayoutInflater.from(this).inflate(R.layout.card_additional_header, null)
                val headerText: TextView = additionalHeaderView.findViewById(R.id.additional_header)
                headerText.text = card.getAdditionalBlocksHeader()
                content.addView(additionalHeaderView)
            }

            var i = 1
            for (additionalBlock in card.getAdditionalBlocks()) {
                val additionalBlockView: View = LayoutInflater.from(this).inflate(R.layout.card_additional_block, null)

                val digitTextView: TextView = additionalBlockView.findViewById(R.id.digit)
                digitTextView.text =  i.toString()

                val additionalBlockTextView: TextView = additionalBlockView.findViewById(R.id.additional_block_text)
                additionalBlockTextView.text = additionalBlock
                content.addView(additionalBlockView)
                i++

            }
        }

        if (card.getDontForgetBlock() != "") {
            val dontForgetView: View = LayoutInflater.from(this).inflate(R.layout.card_dont_forget_block, null)
            val dontForgetTextView: TextView = dontForgetView.findViewById(R.id.dont_forget_text)
            dontForgetTextView.text = card.getDontForgetBlock()
            content.addView(dontForgetView)
        }

        if (card.getMoreLink() != "") {
            val linkView: View = LayoutInflater.from(this).inflate(R.layout.card_link_block, null)
            linkView.findViewById<Button>(R.id.link_btn).setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(card.getMoreLink())
                startActivity(intent)
            }
            content.addView(linkView)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id:Int? = item?.itemId
        when(id) {
            android.R.id.home -> onBackPressed()
        }

        return super.onOptionsItemSelected(item)
    }

}