package ru.hivislav.edamamtestapp.domain.entities

import com.google.gson.annotations.SerializedName

data class Nutrients(
    @SerializedName("ENERC_KCAL")
    val enercKcal: Double,
    val procnt: Double,
    val fat: Double,
    val chocdf: Double,
    val fibtg: Double)
