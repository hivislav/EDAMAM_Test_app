package ru.hivislav.edamamtestapp.domain.entities

data class Food(
    val foodId: String,
    val label: String,
    val nutrients: Nutrients,
    val image: String
)
