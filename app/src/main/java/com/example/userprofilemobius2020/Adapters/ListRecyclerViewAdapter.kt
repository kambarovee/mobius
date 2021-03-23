package com.example.userprofilemobius2020.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofilemobius2020.ViewItems.ListRecyclerViewItems
import com.example.userprofilemobius2020.databinding.RvListItemsBinding


class ListRecyclerViewAdapter(private val rvList: List<ListRecyclerViewItems>) :
    RecyclerView.Adapter<ListRecyclerViewAdapter.RViewHolder>() {

    class RViewHolder(private val binding: RvListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val imageView: ImageView = binding.iconImage
        val textTitle: TextView = binding.titleTextList
        val subTextTitle: TextView = binding.subTitleTextList

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RViewHolder {
        val itemView = RvListItemsBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
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