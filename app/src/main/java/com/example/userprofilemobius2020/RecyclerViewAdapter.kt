package com.example.userprofilemobius2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_list_items.view.*

class RecyclerViewAdapter(private val rvList: List<RecyclerViewItems>) :
    RecyclerView.Adapter<RecyclerViewAdapter.RViewHolder>() {

    class RViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.icon_image
        val textTitle: TextView = itemView.titleTextList
        val subTextTitle: TextView = itemView.subTitleTextList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_list_items, parent, false)
        return RViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: RViewHolder, position: Int) {
        val currentItem = rvList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textTitle.text = currentItem.text1
        holder.subTextTitle.text = currentItem.text2

    }

    override fun getItemCount(): Int = rvList.size
}