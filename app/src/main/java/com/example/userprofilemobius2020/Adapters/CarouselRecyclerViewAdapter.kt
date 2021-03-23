package com.example.userprofilemobius2020.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofilemobius2020.ViewItems.CarouselRecyclerViewItems
import com.example.userprofilemobius2020.databinding.CardviewItemsBinding


class CarouselRecyclerViewAdapter(private val rvList: List<CarouselRecyclerViewItems>) :
    RecyclerView.Adapter<CarouselRecyclerViewAdapter.CarouselRVHolder>() {
    class CarouselRVHolder(private val binding: CardviewItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val imageView: ImageView = binding.ivCard
        val title: TextView = binding.tvTitle
        val secondaryTitle: TextView = binding.tvSecondaryTitle
        val secondarySubTitle: TextView = binding.tvSecondarySubTitle

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselRVHolder {
        val itemView =
            CardviewItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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