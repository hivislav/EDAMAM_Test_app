package ru.hivislav.edamamtestapp.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import ru.hivislav.edamamtestapp.domain.entities.Hint

class ItemMenuDiffCallback: DiffUtil.ItemCallback<Hint>() {

    override fun areItemsTheSame(oldItem: Hint, newItem: Hint): Boolean {
        return oldItem.food.foodId == newItem.food.foodId
    }

    override fun areContentsTheSame(oldItem: Hint, newItem: Hint): Boolean {
        return oldItem == newItem
    }
}