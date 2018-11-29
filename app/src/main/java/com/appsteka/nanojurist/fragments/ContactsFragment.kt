package com.appsteka.nanojurist.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.appsteka.nanojurist.R
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.net.Uri


class ContactsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        setHasOptionsMenu(true)

        val view = inflater.inflate(R.layout.contacts_fragment, container, false)

        view.findViewById<TextView>(R.id.prp_phone_number).setOnClickListener {
            callNumber("+78001000004")
        }

        view.findViewById<TextView>(R.id.ozpp_phone_number).setOnClickListener {
            callNumber("+74997052734")
        }

        view.findViewById<TextView>(R.id.prp_site).setOnClickListener {
            openUrl("https://rospotrebnadzor.ru")
        }

        view.findViewById<TextView>(R.id.mosigra_site).setOnClickListener {
            openUrl("https://www.mosigra.ru")
        }

        return view
    }

    private fun callNumber(number: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:" + number)
        startActivity(intent)
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

}