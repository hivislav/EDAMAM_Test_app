package ru.hivislav.edamamtestapp.domain.entities

data class CitiesList(
    val citiesList: List<String> = listOf(
        "Москва",
        "Санкт-Петербург",
        "Екатеринбург",
        "Ростов-на-Дону",
        "Воронеж",
        "Нижний Новгород"
    )
)
