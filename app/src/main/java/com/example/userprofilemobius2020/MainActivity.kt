package com.example.userprofilemobius2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var vpAdapter: ViewPagerAdapter
    private lateinit var modelList: ArrayList<CardModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadCards()
    }

    private fun loadCards() {
        modelList = ArrayList()

        modelList.add(CardModel(R.drawable.icon_sberprime, "SberPrime", "asDQWedsa", "sadASd"))
        modelList.add(CardModel(R.drawable.icon_sberprime, "Perevodi", "ASDqwe", "QAswqVadsq"))
        modelList.add(CardModel(R.drawable.icon_sberprime, "SberPrime", "asDQWedsa", "sadASd"))

        vpAdapter = ViewPagerAdapter(this, modelList)

        vp_cardview.adapter = vpAdapter

//        vp_cardview.setPadding(0,0,100,0)

    }
}