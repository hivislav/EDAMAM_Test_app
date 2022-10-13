package ru.hivislav.edamamtestapp.domain.usecases

import ru.hivislav.edamamtestapp.domain.entities.Food
import ru.hivislav.edamamtestapp.domain.repositories.RemoteRepository

class GetFoodUseCase(
    private val repository: RemoteRepository
) {

    operator fun invoke(foodId: String): Food {
        return repository.getFood(foodId)
    }
}