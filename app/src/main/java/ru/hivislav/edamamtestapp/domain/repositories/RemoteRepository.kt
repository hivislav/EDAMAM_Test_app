package ru.hivislav.edamamtestapp.domain.repositories

import ru.hivislav.edamamtestapp.domain.entities.Food
import ru.hivislav.edamamtestapp.domain.entities.HintsList

interface RemoteRepository {

    fun getFoodList(ingredient: String): HintsList?
    fun getFood(foodId: String): Food
}