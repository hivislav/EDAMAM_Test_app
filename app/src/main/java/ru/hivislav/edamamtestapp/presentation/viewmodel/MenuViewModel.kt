package ru.hivislav.edamamtestapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import ru.hivislav.edamamtestapp.data.RemoteRepositoryImpl
import ru.hivislav.edamamtestapp.domain.entities.Hint
import ru.hivislav.edamamtestapp.domain.usecases.GetFoodListUseCase
import ru.hivislav.edamamtestapp.domain.usecases.GetFoodUseCase

class MenuViewModel(
    private val liveData: MutableLiveData<List<Hint>> = MutableLiveData()
): ViewModel() {

    fun getLiveData(): LiveData<List<Hint>> {
        return liveData
    }

    private val repository = RemoteRepositoryImpl

    private val getFoodListUseCase = GetFoodListUseCase(repository)
    private val getFoodUseCase = GetFoodUseCase(repository)

    fun getFoodList() {
        viewModelScope.launch {
            (Dispatchers.Main)
            val task = async(Dispatchers.IO) {
                getFoodListUseCase.invoke()
            }
            val listFood = task.await()
            if (isActive) {
                listFood?.hints.let {
                    liveData.postValue(it)
                }
            }
        }
    }
}