package com.example.userprofilemobius2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var vpAdapter: ViewPagerAdapter
    private lateinit var modelList: ArrayList<CardModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = listGenerator(3)

        rv_list.adapter = RecyclerViewAdapter(exampleList)
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)

        supportActionBar?.hide()

        loadCards()
    }

    private fun listGenerator(size: Int): List<RecyclerViewItems> {
        val list = ArrayList<RecyclerViewItems>()

        val item = RecyclerViewItems(R.drawable.ic_shape, "Изменить суточный лимит", "Изменить суточный лимит")
        val item2 = RecyclerViewItems(R.drawable.ic_shape_second, "Переводы без комиссии", "Показать остаток в этом месяце")
        val item3 = RecyclerViewItems(R.drawable.ic_shape_third, "Информация о тарифах \nи лимитах","")
        list.add(item)
        list.add(item2)
        list.add(item3)

        return list
    }


    private fun loadCards() {
        modelList = ArrayList()

        modelList.add(
            CardModel(
                R.drawable.icon_sberprime,
                "СберПрайм",
                "Платёж 9 июля",
                "199 Р в месяц"
            )
        )
        modelList.add(
            CardModel(
                R.drawable.ic_36_percent_fill,
                "Переводы",
                "Автопродление 21 августа",
                "1999 Р в месяц"
            )
        )
        modelList.add(CardModel(R.drawable.icon_sberprime, "SberPrime", "asDQWedsa", "sadASd"))

        vpAdapter = ViewPagerAdapter(this, modelList)

        vp_cardview.adapter = vpAdapter

    }
}