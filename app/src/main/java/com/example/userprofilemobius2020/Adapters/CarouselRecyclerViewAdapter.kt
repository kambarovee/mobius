package com.example.userprofilemobius2020.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofilemobius2020.R
import com.example.userprofilemobius2020.ViewItems.CarouselRecyclerViewItems
import kotlinx.android.synthetic.main.cardview_items.view.*

class CarouselRecyclerViewAdapter(private val rvList: List<CarouselRecyclerViewItems>) :
    RecyclerView.Adapter<CarouselRecyclerViewAdapter.CarouselRVHolder>() {
    class CarouselRVHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.iv_card
        val title: TextView = itemView.tv_title
        val secondaryTitle: TextView = itemView.tv_secondaryTitle
        val secondarySubTitle: TextView = itemView.tv_secondarySubTitle

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselRVHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_items, parent, false)
        return CarouselRVHolder(itemView)
    }

    override fun getItemCount(): Int = rvList.size

    override fun onBindViewHolder(holder: CarouselRVHolder, position: Int) {
        val currentItem = rvList[position]
        holder.imageView.setImageResource(currentItem.imageRes)
        holder.title.text = currentItem.title
        holder.secondaryTitle.text = currentItem.secondaryTitle
        holder.secondarySubTitle.text = currentItem.secondarySubTitle
    }
}