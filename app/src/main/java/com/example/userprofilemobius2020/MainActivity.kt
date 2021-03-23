package com.example.userprofilemobius2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.userprofilemobius2020.Adapters.CarouselRecyclerViewAdapter
import com.example.userprofilemobius2020.Adapters.ListRecyclerViewAdapter
import com.example.userprofilemobius2020.ViewItems.CarouselRecyclerViewItems
import com.example.userprofilemobius2020.ViewItems.ListRecyclerViewItems
import com.example.userprofilemobius2020.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val cardItems = CarouselGenerator(2)

        binding.rvCards.adapter = CarouselRecyclerViewAdapter(cardItems)

        binding.rvCards.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCards.setHasFixedSize(true)


        val listItems = listGenerator(3)

        binding.rvList.adapter = ListRecyclerViewAdapter(listItems)
        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.setHasFixedSize(true)


    }

    private fun CarouselGenerator(sizeOfCarousel: Int): List<CarouselRecyclerViewItems> {
        val cards = ArrayList<CarouselRecyclerViewItems>()

        val card = CarouselRecyclerViewItems(
            R.drawable.ic_mc_36_sberprime,
            "СберПрайм",
            "Платеж 9 июля",
            "199 Р в месяц"
        )
        val card2 = CarouselRecyclerViewItems(
            R.drawable.ic_36_percent_fill,
            "Переводы",
            "Автопродление 21 августа",
            "199 Р в месяц"
        )

        cards.add(card)
        cards.add(card2)

        return cards
    }


    private fun listGenerator(size: Int): List<ListRecyclerViewItems> {
        val list = ArrayList<ListRecyclerViewItems>()

        val item =
            ListRecyclerViewItems(
                R.drawable.ic_shape,
                "Изменить суточный лимит",
                "Изменить суточный лимит"
            )
        val item2 =
            ListRecyclerViewItems(
                R.drawable.ic_shape_second,
                "Переводы без комиссии",
                "Показать остаток в этом месяце"
            )
        val item3 =
            ListRecyclerViewItems(
                R.drawable.ic_shape_third,
                "Информация о тарифах \nи лимитах",
                ""
            )

        list.add(item)
        list.add(item2)
        list.add(item3)

        return list
    }

}