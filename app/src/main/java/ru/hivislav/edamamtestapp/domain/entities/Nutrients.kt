package ru.hivislav.edamamtestapp.domain.entities

import com.google.gson.annotations.SerializedName

data class Nutrients(
    @SerializedName("ENERC_KCAL")
    val enercKcal: Double,
    @SerializedName("PROCNT")
    val procnt: Double,
    @SerializedName("FAT")
    val fat: Double,
    @SerializedName("CHOCDF")
    val chocdf: Double,
    @SerializedName("FIBTG")
    val fibtg: Double)
