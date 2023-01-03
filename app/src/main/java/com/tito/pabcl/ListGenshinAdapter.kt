package com.tito.pabcl

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tito.pabcl.databinding.ItemRowGenshinBinding

class ListGenshinAdapter(private val list : ArrayList<Characters>) :
    RecyclerView.Adapter<ListGenshinAdapter.ListViewHolder>() {
    inner class ListViewHolder(private val binding: ItemRowGenshinBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(characters: Characters){
            with(binding){
                tvGenshinName.text = characters.name
                tvGenshinDetail.text = characters.detail
                Glide.with(itemView.context)
                    .load(characters.photo)
                    .apply(RequestOptions().override(260,260))
                    .into(ivCharacter)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, SecondActivity::class.java)
                    intent.putExtra(SecondActivity.EXTRA_DETAIL, characters)
                    itemView.context.startActivity(intent)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowGenshinBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}