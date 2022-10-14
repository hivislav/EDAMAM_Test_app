package ru.hivislav.edamamtestapp.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import ru.hivislav.edamamtestapp.R
import ru.hivislav.edamamtestapp.databinding.ItemMenuBinding
import ru.hivislav.edamamtestapp.domain.entities.Hint

class MenuFragmentAdapter: ListAdapter<Hint, MenuFragmentAdapter.ItemMenuHolder>(ItemMenuDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMenuHolder {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMenuHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemMenuHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ItemMenuHolder(private val binding: ItemMenuBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(hint: Hint) {
            itemView.apply {
                with(binding) {
                    titleItemRecyclerViewMenuFragment.text = hint.food.label
                    descriptionItemRecyclerViewMenuFragment.text = hint.food.nutrients.toString()
                    imageItemRecyclerViewMenuFragment.load(hint.food.image) {
                        placeholder(R.drawable.placeholder)
                    }
                }
            }
        }
    }
}