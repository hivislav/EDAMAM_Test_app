package ru.hivislav.edamamtestapp.domain.usecases

import ru.hivislav.edamamtestapp.domain.entities.HintsList
import ru.hivislav.edamamtestapp.domain.repositories.RemoteRepository

class GetFoodListUseCase(
    private val repository: RemoteRepository
) {

    operator fun invoke(): HintsList? {
        return repository.getFoodList("pizza")
    }
}