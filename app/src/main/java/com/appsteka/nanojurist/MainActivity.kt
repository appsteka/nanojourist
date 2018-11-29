package com.appsteka.nanojurist

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.appsteka.nanojurist.fragments.CardsFragment
import com.appsteka.nanojurist.fragments.ContactsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.navigation_cards
        switchToFragment(CardsFragment())
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_cards -> {
                switchToFragment(CardsFragment())
                title = getString(R.string.title_cards)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_contacts -> {
                switchToFragment(ContactsFragment())
                title = getString(R.string.profit_contacts)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun switchToFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.frame, fragment).commit()
    }
}
