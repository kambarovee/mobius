package com.example.userprofilemobius2020

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.cardview_items.view.*

class ViewPagerAdapter(
    private val context: Context,
    private val modelArrayList: ArrayList<CardModel>
) : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return modelArrayList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_items, container, false)

        val model = modelArrayList[position]
        var iconImage = model.iconImage
        var title = model.title
        var secondaryTitle = model.secondaryTitle
        var secondarySubTitle = model.secondarySubTitle

        view.iv_card.setImageResource(iconImage)
        view.tv_title.text = title
        view.tv_secondaryTitle.text = secondaryTitle
        view.tv_secondarySubTitle.text = secondarySubTitle

        container.addView(view, position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
       container.removeView(`object` as View)
    }
}