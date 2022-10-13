package ru.hivislav.edamamtestapp.domain.usecases

import ru.hivislav.edamamtestapp.domain.entities.Hints
import ru.hivislav.edamamtestapp.domain.repositories.RemoteRepository

class GetFoodListUseCase(
    private val repository: RemoteRepository
) {

    operator fun invoke(): Hints {
        return repository.getFoodList()
    }
}