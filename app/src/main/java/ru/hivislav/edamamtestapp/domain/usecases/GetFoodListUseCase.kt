package ru.hivislav.edamamtestapp.domain.usecases

import ru.hivislav.edamamtestapp.domain.entities.HintsList
import ru.hivislav.edamamtestapp.domain.repositories.RemoteRepository

private const val REQUEST_PIZZA = "pizza"

class GetFoodListUseCase(
    private val repository: RemoteRepository
) {

    operator fun invoke(): HintsList? {
        return repository.getFoodList(REQUEST_PIZZA)
    }
}