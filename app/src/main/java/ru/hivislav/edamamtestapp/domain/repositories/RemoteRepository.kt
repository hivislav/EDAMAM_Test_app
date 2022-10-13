package ru.hivislav.edamamtestapp.domain.repositories

import ru.hivislav.edamamtestapp.domain.entities.Food
import ru.hivislav.edamamtestapp.domain.entities.Hints

interface RemoteRepository {

    fun getFoodList(): Hints
    fun getFood(foodId: String): Food
}